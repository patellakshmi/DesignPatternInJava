package behavioural.strategy.driver;

import behavioural.momento.CareTaker;
import behavioural.momento.Originator;
import behavioural.strategy.BubbleSort;
import behavioural.strategy.QuickSort;
import behavioural.strategy.Student;

import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void drive(){

        BubbleSort<List> bubbleSort = new BubbleSort<>();
        Student student = new Student("Patel", bubbleSort);
        student.addScores(Arrays.asList(1,2,3,10,5,3,2));
        student.sort();

        QuickSort<List> quickSort = new QuickSort<>();
        student.setStrategy(quickSort);
        student.sort();

    }
}
