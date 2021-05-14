package behavioural.strategy;

public class BubbleSort<T> implements Strategy<T>{

    @Override
    public void execute(T t) {
        System.out.println("Bubble sorting....");
    }
}
