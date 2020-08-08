package userservice.userservice.dtos;

import lombok.Data;

@Data
public class EventData {
   private String eventName;
   private int unitPrice;
   private int totalBook;
   private String promoCode;
}
