package solid.liskovsubtitution.driver;

import solid.liskovsubtitution.Geometry;
import solid.liskovsubtitution.Rectangle;
import solid.liskovsubtitution.Square;

public class Driver {

    public static void drive(){
        Rectangle rectangle = new Rectangle(5,3);
        Square square = new Square(5,5);

        Geometry geometry = new Geometry();
        geometry.useGeo(square);

    }

}
