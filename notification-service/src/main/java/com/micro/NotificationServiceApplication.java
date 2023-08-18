package com.micro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

    @KafkaListener(topics= "NotificationTopic")
    public void handleNotification(OrderPlacedEvent orderPlacedEvent){
        System.out.println("Notification sent for order number {}"+ orderPlacedEvent.getOrderNumber());
        log.info("Notification sent for order number {}", orderPlacedEvent.getOrderNumber());
    }
}
