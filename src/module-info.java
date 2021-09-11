module Word.Processing {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;

    opens com.project;
    opens com.project.controllers;
    opens com.project.views;
    opens com.project.views.css;
    opens com.project.views.css.font_family;
    opens com.project.views.css.font_size;
    opens com.project.views.css.font_weight;
    opens com.project.models;
    opens com.project.views.enums;
}