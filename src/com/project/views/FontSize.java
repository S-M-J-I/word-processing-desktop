package com.project.views;

public enum FontSize {
    SMALL,
    MEDIUM,
    LARGE;

    public static String getCSSPath(FontSize fontSize) {
        switch (fontSize) {
            case SMALL -> {
                return "css/fontSmall.css";
            }
            case MEDIUM -> {
                return "css/fontMedium.css";
            }
            case LARGE -> {
                return "css/fontBig.css";
            }
            default -> {
                return null;
            }
        }
    }
}
