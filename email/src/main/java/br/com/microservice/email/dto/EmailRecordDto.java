package br.com.microservice.email.dto;

import java.util.UUID;

public record EmailRecordDto(
    UUID emailId,
    String emailTo, 
    String subject, 
    String message
) {

}
