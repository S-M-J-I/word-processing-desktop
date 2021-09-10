package com.project;

import com.project.views.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.welcomeWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
