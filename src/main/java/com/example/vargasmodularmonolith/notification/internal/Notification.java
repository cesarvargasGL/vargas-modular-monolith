package com.example.vargasmodularmonolith.notification.internal;

import java.util.Date;

public class Notification {

    private Date date;
    private NotificationType type;
    private String message;
    private String productName;
    private String format;

    public Notification(Date date, NotificationType type, String message, String productName, String format) {
        this.date = date;
        this.type = type;
        this.message = message;
        this.productName = productName;
        this.format = format;
    }

    public Notification(Date date, NotificationType type, String message) {
        this.date = date;
        this.type = type;
        this.message = message;
    }

    // getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}