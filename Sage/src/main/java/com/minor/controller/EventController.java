package com.minor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.minor.entity.Event;
import com.minor.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private ObjectMapper objectMapper; // Used for JSON conversion

    @PostMapping("/create")
    public ResponseEntity<Event> createEvent(
            @RequestPart("event") String eventJson,
            @RequestPart("logo") MultipartFile logo) {

        try {
            // Deserialize the event JSON string into an Event object
            Event event = objectMapper.readValue(eventJson, Event.class);

            // Convert the logo into byte array and set it in the event object
            event.setLogo(logo.getBytes());

            // Save the event
            Event savedEvent = eventService.saveEvent(event);
            return ResponseEntity.ok(savedEvent);

        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}
