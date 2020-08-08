package userservice.userservice.services;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import userservice.userservice.dtos.Event;
import userservice.userservice.dtos.EventData;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EventServiceTest {

   private EventService eventService = new EventService();

   @BeforeEach
   public void setup(){
      Event event = new Event();
      event.setAvailable(100);
      event.setCapacity(100);
      event.setEventName("MOVIE");
      event.setUnitPrice(250);
      EventService.EVENT_DATA.put("MOVIE", event);
   }

   @Test
   public void updateEvent() {
      EventData eventData = new EventData();
      eventData.setEventName("MOVIE");
      eventData.setTotalBook(2);
      eventData.setUnitPrice(250);

     eventService.updateEvent(eventData);
     assertThat(EventService.EVENT_DATA.get("MOVIE").getAvailable()).isEqualTo(98);

   }

   @Test
   public void getEventDetails() {
      Event movie = eventService.getEventDetails("MOVIE");
      assertThat(movie).isNotNull();
   }

   @Test
   public void createEvent() {
      eventService.createEvent(new Event());
      assertThat(EventService.EVENT_DATA.size()).isEqualTo(2);
   }

   @Test
   public void getAllEventNames() {
      List<String> allEventNames = eventService.getAllEventNames();
      assertThat(EventService.EVENT_DATA.size()).isEqualTo(1);
   }
}
