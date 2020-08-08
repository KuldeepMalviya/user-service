package userservice.userservice.dtos;


import lombok.Data;

@Data
public class Event {
   private String eventName;
   private int capacity;
   private int available;
   private int unitPrice;
}
