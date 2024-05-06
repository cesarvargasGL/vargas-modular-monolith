package com.example.vargasmodularmonolith.notification;

import com.example.vargasmodularmonolith.notification.internal.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger LOG = LoggerFactory.getLogger(NotificationService.class);

    @ApplicationModuleListener
    public void notificationEvent(NotificationDTO event) {
        Notification notification = event.toEntity();
        LOG.info("Received notification by event for product {} in date {} by {}.",
                notification.getProductName(),
                notification.getDate(),
                notification.getFormat());
    }
}
