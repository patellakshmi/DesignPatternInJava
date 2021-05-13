package solid.principle.openclosed;

public interface Specification <T>{
    boolean isSatisfied(T item);
}
