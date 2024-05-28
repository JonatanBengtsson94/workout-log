package com.github.jonatanbengtsson94.workoutlog.data.model;

import java.util.ArrayList;

public class Exercise {
    private ArrayList<Set> sets;
    private ExerciseType type;

    public Exercise(ArrayList<Set> sets, ExerciseType type)
    {
        this.sets = sets;
        this.type = type;
    }
}
