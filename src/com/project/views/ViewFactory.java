package com.project.views;

import com.project.controllers.BaseController;
import com.project.controllers.MainWindowController;
import com.project.controllers.WelcomeWindowController;
import com.project.views.enums.FontFamily;
import com.project.views.enums.FontSize;
import com.project.views.enums.FontWeight;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ViewFactory {


    private FontSize fontSize = FontSize.MEDIUM;
    private FontWeight fontWeight = FontWeight.NORMAL;
    private FontFamily fontFamily = FontFamily.Calibri;

    private ArrayList<Stage> activeStages;

    public ViewFactory() {
        this.activeStages = new ArrayList<>();
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    public FontWeight getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public FontFamily getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(FontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void welcomeWindow(){
        BaseController controller = new WelcomeWindowController(this, "WelcomeWindow.fxml");
        initWindow(controller, "Welcome");
    }

    public void showMainWindow() {
        BaseController controller = new MainWindowController(this, "MainWindow.fxml");
        initWindow(controller, "Document");
    }

    public void closeWindow(Stage stage) {
        stage.close();
        activeStages.remove(stage);
    }

    private void initWindow(BaseController controller, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
        fxmlLoader.setController(controller);

        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
        activeStages.add(stage);
    }

    public void updateStyles() {
        for(Stage stage : activeStages) {
            Scene scene = stage.getScene();
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource(FontWeight.getCSSPath(fontWeight)).toExternalForm());
            scene.getStylesheets().add(getClass().getResource(FontSize.getCSSPath(fontSize)).toExternalForm());
            scene.getStylesheets().add(getClass().getResource(FontFamily.getCSSPath(fontFamily)).toExternalForm());
        }
    }
}
