package com.skills.hub.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/*
=========================================================
WHAT IS THIS CLASS?
=========================================================

This represents SUBSCRIPTION.

It connects:
User + SkillPack

Example:
Hari -> subscribed to Java Course

=========================================================
*/

@Entity
@Table(name = "subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many subscriptions belong to one user
    @ManyToOne
    private User user;

    // Many subscriptions belong to one skill pack
    @ManyToOne
    private SkillPack skillPack;

    private LocalDate startDate;
    private LocalDate endDate;

    private String status; // ACTIVE / CANCELLED

    // =========================
    // GETTERS AND SETTERS
    // =========================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        //  assign subscription id
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        // link user
        this.user = user;
    }

    public SkillPack getSkillPack() {
        return skillPack;
    }

    public void setSkillPack(SkillPack skillPack) {
        //  link skill pack
        this.skillPack = skillPack;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        //  set start date
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        //  set end date
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        //  set ACTIVE or CANCELLED
        this.status = status;
    }
}
