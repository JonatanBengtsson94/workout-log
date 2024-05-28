package com.github.jonatanbengtsson94.workoutlog.data.model;

public enum ExerciseType {
   DEADLIFT("Deadlift"),
   SQUAT("Squat"),
   BENCH_PRESS("Bench press");

   private String displayName;

   private ExerciseType(String displayName)
   {
       this.displayName = displayName;
   }

   @Override
   public String toString()
   {
       return displayName;
   }
}
