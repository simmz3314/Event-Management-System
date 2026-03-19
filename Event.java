package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Author: Simran K
// This class represents an Event in the system
public class Event {

    // Unique ID of the event
    private int eventId;

    // Name of the event
    private String name;

    // Location of the event
    private String location;

    // Date of the event
    private LocalDate date;

    // Maximum participants allowed
    private int maxParticipants;

    // List of participants
    private List<Participant> participants;

    // Constructor
    public Event(int eventId, String name, String location, LocalDate date, int maxParticipants) {
        this.eventId = eventId;
        this.name = name;
        this.location = location;
        this.date = date;
        this.maxParticipants = maxParticipants;
        this.participants = new ArrayList<>();
    }

    // Add participant if event is not full
    public boolean addParticipant(Participant participant) {
        if (!isFull()) {
            participants.add(participant);
            return true;
        }
        return false;
    }

    // Check if event is full
    public boolean isFull() {
        return participants.size() >= maxParticipants;
    }

    // toString method
    public String toString() {
        return name + " - " + location;
    }
}