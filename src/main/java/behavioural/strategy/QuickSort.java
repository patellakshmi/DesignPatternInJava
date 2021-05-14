package behavioural.strategy;

public class QuickSort<T> implements Strategy<T>{
    @Override
    public void execute(T t) {
        System.out.println("Quick sorting...");
    }
}
