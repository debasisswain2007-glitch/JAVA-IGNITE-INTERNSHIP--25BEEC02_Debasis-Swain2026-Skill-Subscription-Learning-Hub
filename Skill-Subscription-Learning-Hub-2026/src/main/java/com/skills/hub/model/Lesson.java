package com.skills.hub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/*
=========================================================
LESSON ENTITY
=========================================================

Represents a lesson inside a SkillPack.

Example:

SkillPack: Java Basics

Lessons:
1. Variables
2. Loops
3. OOP Concepts

Relationship:
Many Lessons -> One SkillPack
=========================================================
*/

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 5000)
    private String content;

    @ManyToOne
    private SkillPack skillPack;

    // =========================
    // CONSTRUCTORS
    // =========================

    public Lesson() {
    }

    public Lesson(String title, String content, SkillPack skillPack) {
        this.title = title;
        this.content = content;
        this.skillPack = skillPack;
    }

    // =========================
    // GETTERS & SETTERS
    // =========================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public SkillPack getSkillPack() {
        return skillPack;
    }

    public void setSkillPack(SkillPack skillPack) {
        this.skillPack = skillPack;
    }

    // =========================
    // TO STRING
    // =========================

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
