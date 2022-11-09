package liga.medical.model.dto;

import liga.medical.model.dto.enums.MessageType;
import lombok.Data;

@Data
public class RabbitMessageDTO {

    Long id;
    MessageType messageType;
    String content;
}
