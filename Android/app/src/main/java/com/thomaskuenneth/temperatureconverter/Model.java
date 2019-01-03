/*
 * Model.java
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

public class Model {

    public enum TEMPERATURE_UNIT {
        DEGREES_CELSIUS,
        DEGREES_FAHRENHEIT,
        KELVIN
    }

    private TEMPERATURE_UNIT inUnit, outUnit;
    private Double inTemperature;
    private String outTemperatureAsString;

    public Model() {
        inUnit = TEMPERATURE_UNIT.DEGREES_CELSIUS;
        inTemperature = null;
        outUnit = TEMPERATURE_UNIT.DEGREES_FAHRENHEIT;
        outTemperatureAsString = "";
    }

    public TEMPERATURE_UNIT getInUnit() {
        return inUnit;
    }

    public void setInUnit(TEMPERATURE_UNIT inUnit) {
        this.inUnit = inUnit;
    }

    public TEMPERATURE_UNIT getOutUnit() {
        return outUnit;
    }

    public void setOutUnit(TEMPERATURE_UNIT outUnit) {
        this.outUnit = outUnit;
    }

    public Double getInTemperature() {
        return inTemperature;
    }

    public void setInTemperature(Double inTemperature) {
        this.inTemperature = inTemperature;
    }

    public String getOutTemperatureAsString() {
        return outTemperatureAsString;
    }

    public void calculateOutTemperature() {
        if (inTemperature == null) {
            outTemperatureAsString = "";
        } else {
            double outTemperatureInKelvin;
            switch (inUnit) {
                case DEGREES_CELSIUS:
                    outTemperatureInKelvin = Converter.celsiusToKelvin(inTemperature);
                    break;
                case DEGREES_FAHRENHEIT:
                    outTemperatureInKelvin = Converter.fahrenheitToKelvin(inTemperature);
                    break;
                case KELVIN:
                    outTemperatureInKelvin = inTemperature;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected input unit");
            }
            switch (outUnit) {
                case DEGREES_CELSIUS:
                    outTemperatureAsString = Converter.celsiusToString(Converter.kelvinToCelsius(outTemperatureInKelvin));
                    break;
                case DEGREES_FAHRENHEIT:
                    outTemperatureAsString = Converter.fahrenheitToString(Converter.kelvinToFahrenheit(outTemperatureInKelvin));
                    break;
                case KELVIN:
                    outTemperatureAsString = Converter.kelvinToString(outTemperatureInKelvin);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected output unit");
            }
        }
    }
}
