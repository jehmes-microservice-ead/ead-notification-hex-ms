package com.ead.notificationhex.adapters.dtos;

import java.util.UUID;

public class NotificationCommandDto {

    private String title;
    private String message;
    private UUID userId;

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public UUID getUserId() {
        return userId;
    }
}
