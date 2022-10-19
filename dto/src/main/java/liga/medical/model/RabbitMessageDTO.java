package liga.medical.model;

import lombok.Data;

@Data
public class RabbitMessageDTO {

    MessageType messageType;
    String content;
}
