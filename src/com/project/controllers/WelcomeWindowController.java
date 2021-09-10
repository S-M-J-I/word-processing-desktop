package com.project.controllers;

import com.project.views.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WelcomeWindowController extends BaseController{

    public WelcomeWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }

    @FXML
    private Label welcomeLabel;

    @FXML
    void onProceedButton(ActionEvent event) {
        super.getViewFactory().showMainWindow();
        Stage stage = (Stage) welcomeLabel.getScene().getWindow();
        super.getViewFactory().closeWindow(stage);
    }

}
