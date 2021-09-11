package com.project.views.enums;

public enum FontWeight {
    LIGHT,
    NORMAL,
    BOLD;

    public static String getCSSPath(FontWeight fontWeight) {
        switch (fontWeight) {
            case LIGHT -> {
                return "css/font_weight/fontWeightLight.css";
            }
            case NORMAL -> {
                return "css/font_weight/fontWeightMedium.css";
            }
            case BOLD -> {
                return "css/font_weight/fontWeightBold.css";
            }
            default -> {
                return null;
            }
        }
    }
}
