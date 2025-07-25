package com.email.writer.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;

    public String getEmailContent() {
        return emailContent;
    }

    // Setter for emailContent


    // Getter for tone
    public String getTone() {
        return tone;
    }

    // Setter for tone

}
