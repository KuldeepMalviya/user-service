package userservice.userservice.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import userservice.userservice.dtos.Event;
import userservice.userservice.dtos.EventData;

import java.util.HashMap;

@Slf4j
@Service
public class EventService {

   private static HashMap<String, Event> EVENT_DATA = new HashMap<>();

   public void updateEvent(EventData eventData) {
      String eventName = eventData.getEventName();
      if (EVENT_DATA.containsKey(eventName)) {
         Event event = EVENT_DATA.get(eventName);
         int available = event.getAvailable();
         event.setAvailable(available - eventData.getTotalBook());
         EVENT_DATA.put(event.getEventName(), event);
      }

   }

   public Event getEventDetails(String eventName) {
      return EVENT_DATA.get(eventName);
   }

   public void createEvent(Event event) {
      EVENT_DATA.put(event.getEventName(), event);
   }

}
