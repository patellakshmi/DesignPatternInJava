package behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class Student {

    List<Integer> everyDayScores = new ArrayList<>();
    private String name;

    private Strategy strategy;

    public Student(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void addScores(List<Integer> list){ everyDayScores.addAll(list); }

    public void addScore(int value){ everyDayScores.add(value); }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort(){
        this.strategy.execute(everyDayScores);
    }


}
