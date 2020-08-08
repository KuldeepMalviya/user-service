package userservice.userservice.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import userservice.userservice.dtos.Event;
import userservice.userservice.dtos.EventData;
import userservice.userservice.services.EventService;


@Slf4j
@RestController
@RequestMapping("/event-service")
@RequiredArgsConstructor
public class EventController {

   private final EventService eventService;


   @PostMapping("/event")
   public void addEvent(@RequestBody Event event) {
      log.info("Adding event with event details={}", event);
      eventService.createEvent(event);
   }

   @GetMapping("/event/{eventName}")
   public Event getEventDetails(@PathVariable String eventName) {
      log.info("Fetch event details for eventName={}", eventName);
      return eventService.getEventDetails(eventName);
   }

   @PutMapping("/event/{eventName}")
   public void updateEvent(@PathVariable String eventName, @RequestBody EventData eventData) {
      log.info("updating event details for eventName={},eventData={}", eventName, eventData);
      eventService.updateEvent(eventData);
   }

}
