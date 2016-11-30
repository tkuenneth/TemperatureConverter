/*
 * Rechnen.java
 *
 * Copyright 2016 Thomas Kuenneth
 *
 * This file is part of Temperaturumrechnung.
 *
 * Temperaturumrechnung is free software: you can redistribute it and/or modify
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
package com.thomaskuenneth.temperaturumrechnung;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Rechnen {

    public double string2double(String s) throws ParseException {
        NumberFormat df = DecimalFormat.getInstance();
        Number n = df.parse(s);
        return n.doubleValue();
    }

    public double celsius2fahrenheit(double celsius) {
        return (celsius * 1.8) + 32.0;
    }

    public double fahrenheit2celsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }

    public String celsius2string(double celsius) {
        return double2string(celsius, "°C");
    }

    public String fahrenheit2string(double fahrenheit) {
        return double2string(fahrenheit, "°F");
    }

    private String double2string(double val, String suffix) {
        return String.format("%f %s", val, suffix);
    }
}
