package behavioural.visitor;

public class TShirt implements Product,Visitable{

    @Override
    public double getPrice() {
        return 2050.00;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
