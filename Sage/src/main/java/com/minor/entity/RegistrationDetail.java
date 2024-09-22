	package com.minor.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registration_details")
public class RegistrationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "participation_type")
    private String participationType; // "individual" or "team"

    @Column(name = "num_of_participants")
    private Integer numOfParticipants; // Only applicable if participationType is "team"

    @Column(name = "min_registration_start_datetime")
    private LocalDateTime minRegistrationStartDateTime;

    @Column(name = "registration_start_datetime")
    private LocalDateTime registrationStartDateTime;

    @Column(name = "num_of_allowed_registrations")
    private Integer numOfAllowedRegistrations;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParticipationType() {
        return participationType;
    }

    public void setParticipationType(String participationType) {
        this.participationType = participationType;
    }

    public Integer getNumOfParticipants() {
        return numOfParticipants;
    }

    public void setNumOfParticipants(Integer numOfParticipants) {
        this.numOfParticipants = numOfParticipants;
    }

    public LocalDateTime getMinRegistrationStartDateTime() {
        return minRegistrationStartDateTime;
    }

    public void setMinRegistrationStartDateTime(LocalDateTime minRegistrationStartDateTime) {
        this.minRegistrationStartDateTime = minRegistrationStartDateTime;
    }

    public LocalDateTime getRegistrationStartDateTime() {
        return registrationStartDateTime;
    }

    public void setRegistrationStartDateTime(LocalDateTime registrationStartDateTime) {
        this.registrationStartDateTime = registrationStartDateTime;
    }

    public Integer getNumOfAllowedRegistrations() {
        return numOfAllowedRegistrations;
    }

    public void setNumOfAllowedRegistrations(Integer numOfAllowedRegistrations) {
        this.numOfAllowedRegistrations = numOfAllowedRegistrations;
    }
}

