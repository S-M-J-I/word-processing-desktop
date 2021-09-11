package com.project.views;

public enum FontWeight {
    LIGHT,
    NORMAL,
    BOLD;

    public static String getCSSPath(FontWeight fontWeight) {
        switch (fontWeight) {
            case LIGHT -> {
                return "css/fontWeightLight.css";
            }
            case NORMAL -> {
                return "css/fontWeightMedium.css";
            }
            case BOLD -> {
                return "css/fontWeightBold.css";
            }
            default -> {
                return null;
            }
        }
    }
}
