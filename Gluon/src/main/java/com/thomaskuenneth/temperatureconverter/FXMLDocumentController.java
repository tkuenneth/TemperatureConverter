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
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
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
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

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

    @FXML
    void handleButtonAction(ActionEvent event) {
        String txt = input.getText();
        Converter r = new Converter();
        try {
            double in = r.stringToDouble(txt);
            double kelvin;
            Toggle selectedSrc = tempSrc.getSelectedToggle();
            if (selectedSrc.equals(srcCelsius)) {
                kelvin = r.celsiusToKelvin(in);
            } else if (selectedSrc.equals(srcFahrenheit)) {
                kelvin = r.fahrenheitToKelvin(in);
            } else {
                kelvin = in;
            }
            Toggle selectedDesti = tempDesti.getSelectedToggle();
            String out;
            if (selectedDesti.equals(destiCelsius)) {
                out = r.celsiusToString(r.kelvinToCelsius(kelvin));
            } else if (selectedDesti.equals(destiFahrenheit)) {
                out = r.fahrenheitToString(r.kelvinToFahrenheit(kelvin));
            } else {
                out = r.kelvinToString(kelvin);
            }
            result.setText(out);
        } catch (ParseException ex) {
            LOGGER.log(Level.SEVERE, "handleButtonAction()", ex);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        result.setText("");
        input.textProperty().addListener((observable, oldValue, newValue) -> {
            updateCalculateButton();
        });
        updateCalculateButton();
        // see http://stackoverflow.com/a/31043122/5956451
        NumberFormat f = NumberFormat.getInstance(Locale.getDefault());
        input.setTextFormatter(new TextFormatter<>(c -> {
            if (c.getControlNewText().isEmpty()) {
                return c;
            }
            ParsePosition parsePosition = new ParsePosition(0);
            Object object = f.parse(c.getControlNewText(), parsePosition);
            if (object == null || parsePosition.getIndex() < c.getControlNewText().length()) {
                return null;
            } else {
                return c;
            }
        }));
    }

    private void updateCalculateButton() {
        calculate.setDisable(input.getText().length() < 1);
    }
}
