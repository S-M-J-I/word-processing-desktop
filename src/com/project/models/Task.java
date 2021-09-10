package com.project.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private static int pageNo = 0;
    private String title;
    private String date;
    private String body;

    public Task(String title, String body) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.title = title;
        this.date = dtf.format(LocalDateTime.now());
        this.body = body;
        pageNo++;
    }

    public static int getPageNo() {
        return pageNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getBody() {
        return body;
    }
}
