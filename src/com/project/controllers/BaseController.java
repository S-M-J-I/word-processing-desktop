package com.project.controllers;

import com.project.views.ViewFactory;

public abstract class BaseController {
    private ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(ViewFactory viewFactory, String fxmlName) {
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
