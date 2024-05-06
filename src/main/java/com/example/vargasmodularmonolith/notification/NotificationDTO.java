package com.example.vargasmodularmonolith.notification;

import com.example.vargasmodularmonolith.notification.internal.Notification;
import com.example.vargasmodularmonolith.notification.internal.NotificationType;

import java.util.Date;

public class NotificationDTO {

    private Date date;
    private String productName;
    private String format;

    public NotificationDTO(Date date, String format, String productName) {
        this.date = date;
        this.productName = productName;
        this.format = format;
    }

    // getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Notification toEntity() {
        return new Notification(this.date, NotificationType.valueOf(this.format), this.productName);
    }
}