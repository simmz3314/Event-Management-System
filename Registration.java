package model;

import java.time.LocalDate;

// Author: Simran K, Vanshita
// Course: Advanced Object Oriented Programming
// Iteration 1 - Model Layer
// This class represents a registration that links a participant to an event.
public class Registration {

    // Unique ID of the registration
    private int registrationId;

    // Event associated with the registration
    private Event event;

    // Participant associated with the registration
    private Participant participant;

    // Date when the registration was made
    private LocalDate registrationDate;

    // Constructor to initialize registration details
    public Registration(int registrationId, Event event, Participant participant) {
        this.registrationId = registrationId;
        this.event = event;
        this.participant = participant;
        this.registrationDate = LocalDate.now();
    }

    // Getter for registrationId
    public int getRegistrationId() {
        return registrationId;
    }

    // Setter for registrationId
    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    // Getter for event
    public Event getEvent() {
        return event;
    }

    // Setter for event
    public void setEvent(Event event) {
        this.event = event;
    }

    // Getter for participant
    public Participant getParticipant() {
        return participant;
    }

    // Setter for participant
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    // Getter for registrationDate
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    // Setter for registrationDate
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

   
}