package mitra.suvankar.openshare.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseMessage {
    private String message;
    private LocalDateTime generatedAt = LocalDateTime.now();;
}
