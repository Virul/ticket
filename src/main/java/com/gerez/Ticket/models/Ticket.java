package com.gerez.Ticket.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tcket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String urgency;

    @Column(nullable = false)
    private String impact;

    @Column(nullable = false, updatable = false)
    private LocalDateTime captureDate;

    @PrePersist
    public void prePersist() {
        this.captureDate = LocalDateTime.now();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public LocalDateTime getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(LocalDateTime captureDate) {
        this.captureDate = captureDate;
    }
}
