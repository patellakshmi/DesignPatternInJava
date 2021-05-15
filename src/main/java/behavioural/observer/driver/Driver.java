package behavioural.observer.driver;

import behavioural.momento.CareTaker;
import behavioural.momento.Originator;
import behavioural.observer.EmailTopic;
import behavioural.observer.Observable;
import behavioural.observer.Person;

public class Driver {

    public static void drive(){

        Person person1 = new Person("A");
        Person person2 = new Person("B");
        Person person3 = new Person("C");

        Observable observable = new EmailTopic();
        observable.register(person1);
        observable.register(person2);
        observable.register(person3);

        person1.setObservable(observable);
        person2.setObservable(observable);
        person3.setObservable(observable);

        person1.broadCast("I am here", person1);


    }
}
