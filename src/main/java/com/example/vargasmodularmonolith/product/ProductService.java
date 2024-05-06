package com.example.vargasmodularmonolith.product;

import com.example.vargasmodularmonolith.notification.NotificationDTO;
import com.example.vargasmodularmonolith.notification.NotificationService;
import com.example.vargasmodularmonolith.product.internal.Product;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductService {

    private final ApplicationEventPublisher events;

    public ProductService(ApplicationEventPublisher events) {
        this.events = events;
    }

    public void create(Product product) {
        events.publishEvent(new NotificationDTO(new Date(), "SMS", product.getName()));
    }
}
