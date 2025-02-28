package com.kulushev;


public class UnitConverter {
    public static double mmToCm(double mm) {
        double value = mm/10;
        return Math.round(value * 100.0) / 100.0;
    }

    public static double cmToM(double cm) {
        double value = cm/100;
        return Math.round(value * 100.0) / 100.0;
    }

    public static double cmToMm(double cm) {
        double value = cm*100;
        return Math.round(value * 100.0) / 100.0;
    }

}
