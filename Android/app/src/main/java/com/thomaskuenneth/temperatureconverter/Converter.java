/*
 * Converter.java
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

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Converter {

    public static final String DEGREES_CELSIUS = "\u00B0C";
    public static final String DEGREES_FAHRENHEIT = "\u00B0F";
    public static final String KELVIN = "K";

    public static double stringToDouble(String s) throws ParseException {
        NumberFormat df = DecimalFormat.getInstance();
        Number n = df.parse(s);
        return n.doubleValue();
    }

    public static double celsiusToKelvin(double celsius) {
        return 273.15 + celsius;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5f / 9f;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 1.8 - 459.67;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }

    public static String celsiusToString(double celsius) {
        return doubleToString(celsius, DEGREES_CELSIUS);
    }

    public static String fahrenheitToString(double fahrenheit) {
        return doubleToString(fahrenheit, DEGREES_FAHRENHEIT);
    }

    public static String kelvinToString(double kelvin) {
        return doubleToString(kelvin, KELVIN);
    }

    private static String doubleToString(double val, String suffix) {
        return String.format(Locale.US, "%s %s",
                (val == (long) val)
                        ? String.format(Locale.US, "%d", (long) val)
                        : String.format(Locale.US, "%.2f", val), suffix);
    }
}
