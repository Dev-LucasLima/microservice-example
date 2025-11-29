package br.com.microservice.users.dto;


import java.util.UUID;

public record EmailModelDto(
        UUID userId,
        String emailTo,
        String subject,
        String text
) {
}
