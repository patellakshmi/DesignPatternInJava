package behavioural.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Observable {

    private Set<Person> personList = new HashSet<>();

    public void setPersonList(Set<Person> personList) {
        this.personList = personList;
    }

    public void register(Person person){
        this.personList.add(person);
    }

    public void deRegister(Person person){
        if( personList.contains(person))
            personList.remove(person);
    }

    private void broadCost(String msg, Observer identity){
        if( personList.contains(identity))
            personList.stream().filter(person ->person != identity ).forEach(person -> person.update(msg));
    }

    public void event(String msg, Observer identity){
        broadCost(msg, identity);
    }

}
