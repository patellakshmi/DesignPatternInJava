package behavioural.visitor;

public interface Visitor {
    double visit(TShirt tShirt);
    double visit(Shirt shirt);

}
