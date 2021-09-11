package com.project.views.enums;

public enum FontFamily {
    Calibri,
    Helvetica,
    Montserrat,
    Roboto;

    public static String getCSSPath(FontFamily fontFamily) {
        switch (fontFamily) {
            case Calibri -> {
                return "css/font_family/calibri.css";
            }
            case Helvetica -> {
                return "css/font_family/helvetica.css";
            }
            case Montserrat -> {
                return "css/font_family/montserrat.css";
            }
            case Roboto -> {
                return "css/font_family/roboto.css";
            }
            default -> {
                return null;
            }
        }
    }
}
