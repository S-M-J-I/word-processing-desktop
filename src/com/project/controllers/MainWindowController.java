package com.project.controllers;

import com.project.views.FontSize;
import com.project.views.FontWeight;
import com.project.views.ViewFactory;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController extends BaseController implements Initializable {

    public MainWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }

    private void setUpFontSizePicker(){
        fontSizePicker.setItems(FXCollections.observableArrayList(FontSize.values()));
        fontSizePicker.setValue(super.getViewFactory().getFontSize());
    }

    private void setFontWeightPicker(){
        fontWeightPicker.setItems(FXCollections.observableArrayList(FontWeight.values()));
        fontWeightPicker.setValue(super.getViewFactory().getFontWeight());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setUpFontSizePicker();
        setFontWeightPicker();
    }

    @FXML
    void applyStyles(ActionEvent event) {
        super.getViewFactory().setFontSize(fontSizePicker.getValue());
        super.getViewFactory().setFontWeight(fontWeightPicker.getValue());
        super.getViewFactory().updateStyles();
    }

    @FXML
    private ChoiceBox<FontSize> fontSizePicker;

    @FXML
    private ChoiceBox<FontWeight> fontWeightPicker;

    @FXML
    void onAboutButtonAction(ActionEvent event) {

    }

    @FXML
    void onCloseButtonAction(ActionEvent event) {

    }

    @FXML
    void onOpenButtonAction(ActionEvent event) {

    }

    @FXML
    void onOptionsButtonAction(ActionEvent event) {

    }

    @FXML
    void onSaveButtonAction(ActionEvent event) {

    }

}
