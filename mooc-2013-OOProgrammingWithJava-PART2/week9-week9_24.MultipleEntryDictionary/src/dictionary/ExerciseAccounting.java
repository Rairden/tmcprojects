package dictionary;

import java.util.HashSet;
import java.util.Set;

public class ExerciseAccounting {
    private Set<Integer> doneExercises;

    public ExerciseAccounting() {
        this.doneExercises = new HashSet<Integer>();
    }

    public void add(int exercise) {
        this.doneExercises.add(exercise);
    }

    public void print() {
        for (int exercise: this.doneExercises) {
            System.out.println(exercise);
        }
    }
}