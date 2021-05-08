package behavioural.visitor;

public class Shirt implements Product,Visitable {

    @Override
    public double getPrice() {
        return 1000.00;
    }


    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
