/*
 * FXMLDocumentController.java
 *
 * Copyright 2016 Thomas Kuenneth
 *
 * This file is part of TemperatureConverter.
 *
 * TemperatureConverter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.thomaskuenneth.temperatureconverter;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.ToggleGroup;
import javafx.util.converter.DoubleStringConverter;

public class FXMLDocumentController implements Initializable {

    private static final Logger LOGGER = Logger.getLogger(FXMLDocumentController.class.getName());

    @FXML
    private TextField input;

    @FXML
    private RadioButton srcCelsius;

    @FXML
    private RadioButton srcFahrenheit;

    @FXML
    private RadioButton srcKelvin;

    @FXML
    private ToggleGroup tempSrc;

    @FXML
    private RadioButton destiCelsius;

    @FXML
    private RadioButton destiFahrenheit;

    @FXML
    private RadioButton destiKelvin;

    @FXML
    private ToggleGroup tempDesti;

    @FXML
    private Button calculate;

    @FXML
    private Label result;

    private final Model model = new Model();

    @FXML
    void handleButtonAction(ActionEvent event) {
        model.setInTemperature(Double.valueOf(input.getText()));
        model.calculateOutTemperature();
        updateOutTemperatureFromModel();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tempSrc.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == srcCelsius) {
                model.setInUnit(Model.TEMPERATURE_UNIT.DEGREES_CELSIUS);
            } else if (newValue == srcFahrenheit) {
                model.setInUnit(Model.TEMPERATURE_UNIT.DEGREES_FAHRENHEIT);
            } else if (newValue == srcKelvin) {
                model.setInUnit(Model.TEMPERATURE_UNIT.KELVIN);
            } else {
                LOGGER.log(Level.SEVERE, "Unexpected input unit");
            }
        });
        tempDesti.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == destiCelsius) {
                model.setOutUnit(Model.TEMPERATURE_UNIT.DEGREES_CELSIUS);
            } else if (newValue == destiFahrenheit) {
                model.setOutUnit(Model.TEMPERATURE_UNIT.DEGREES_FAHRENHEIT);
            } else if (newValue == destiKelvin) {
                model.setOutUnit(Model.TEMPERATURE_UNIT.KELVIN);
            } else {
                LOGGER.log(Level.SEVERE, "Unexpected output unit");
            }
        });
        input.setTextFormatter(
                new TextFormatter(
                        new DoubleStringConverter()));
        input.textProperty().addListener((observable, oldValue, newValue) -> {
            updateCalculateButton();
        });
        updateInputUnitFromModel();
        updateOutputUnitFromModel();
        updateInTemperatureFromModel();
        updateOutTemperatureFromModel();
        updateCalculateButton();
    }

    private void updateCalculateButton() {
        calculate.setDisable(input.getText().length() < 1);
    }

    private void updateInputUnitFromModel() {
        model.calculateOutTemperature();
        switch (model.getInUnit()) {
            case DEGREES_CELSIUS:
                tempSrc.selectToggle(srcCelsius);
                break;
            case DEGREES_FAHRENHEIT:
                tempSrc.selectToggle(srcFahrenheit);
                break;
            case KELVIN:
                tempSrc.selectToggle(srcKelvin);
                break;
            default:
                throw new IllegalArgumentException("Unexpected input unit");
        }
    }

    private void updateOutputUnitFromModel() {
        switch (model.getOutUnit()) {
            case DEGREES_CELSIUS:
                tempDesti.selectToggle(destiCelsius);
                break;
            case DEGREES_FAHRENHEIT:
                tempDesti.selectToggle(destiFahrenheit);
                break;
            case KELVIN:
                tempDesti.selectToggle(destiKelvin);
                break;
            default:
                throw new IllegalArgumentException("Unexpected output unit");
        }
    }

    private void updateInTemperatureFromModel() {
        Double inTemperature = model.getInTemperature();
        input.setText(inTemperature == null ? "" : inTemperature.toString());
    }

    private void updateOutTemperatureFromModel() {
        result.setText(model.getOutTemperatureAsString());
    }
}
