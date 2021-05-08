package behavioural.visitor;

public class TaxVisitor implements Visitor{

    @Override
    public double visit(TShirt tShirt) {
        return tShirt.getPrice()*.20;
    }

    @Override
    public double visit(Shirt shirt) {
        return shirt.getPrice()*.20;
    }
}
