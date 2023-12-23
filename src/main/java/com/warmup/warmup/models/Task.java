package com.warmup.warmup.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // >IDENTITY for auto incrementing id/primary key
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private String task;
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
}
