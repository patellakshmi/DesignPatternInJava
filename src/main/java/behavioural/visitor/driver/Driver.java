package behavioural.visitor.driver;

import behavioural.visitor.Shirt;
import behavioural.visitor.TShirt;
import behavioural.visitor.TaxVisitor;
import behavioural.visitor.Visitor;

public class Driver {

    public static void drive(){
        Visitor visitor = new TaxVisitor();
        Shirt shirt = new Shirt();
        TShirt tShirt = new TShirt();

        double calculatedTax = shirt.accept(visitor);
        System.out.println("Tax for Shirt is: "+calculatedTax);
    }
}
