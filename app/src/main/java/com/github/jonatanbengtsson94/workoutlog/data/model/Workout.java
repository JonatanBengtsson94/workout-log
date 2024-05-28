package com.github.jonatanbengtsson94.workoutlog.data.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Workout {
    private ArrayList<Exercise> exercises;
    private LocalDate datePerformed;
    private String name;

    public Workout(ArrayList<Exercise> exercises, LocalDate datePerformed, String name)
    {
        this.exercises = exercises;
        this.datePerformed = datePerformed;
        this.name = name;
    }
}
