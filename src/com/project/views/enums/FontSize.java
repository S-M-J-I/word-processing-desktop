package com.project.views.enums;

public enum FontSize {
    SMALL,
    MEDIUM,
    LARGE;

    public static String getCSSPath(FontSize fontSize) {
        switch (fontSize) {
            case SMALL -> {
                return "css/font_size/fontSmall.css";
            }
            case MEDIUM -> {
                return "css/font_size/fontMedium.css";
            }
            case LARGE -> {
                return "css/font_size/fontBig.css";
            }
            default -> {
                return null;
            }
        }
    }
}
