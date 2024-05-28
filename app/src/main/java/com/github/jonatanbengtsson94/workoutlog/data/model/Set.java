package com.github.jonatanbengtsson94.workoutlog.data.model;

public class Set {
    private int reps;
    private float weight;

    public Set(int reps, float weight)
    {
        this.reps = reps;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }
}
