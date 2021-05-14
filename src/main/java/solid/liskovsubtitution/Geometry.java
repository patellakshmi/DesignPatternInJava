package solid.liskovsubtitution;

public class Geometry {

    public void useGeo(Rectangle rectangle){
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Calculated Area of Geometry is: "+width*rectangle.getHeight());
        System.out.println("Actual Area of Geometry is: "+rectangle.getWidth()*rectangle.getHeight());
    }

    public void useGeoUsingLSP(Rectangle rectangle){

        if( rectangle instanceof Rectangle){
            int width = rectangle.getWidth();
            rectangle.setHeight(10);
            System.out.println("Calculated Area of Geometry is: "+width*rectangle.getHeight());
            System.out.println("Actual Area of Geometry is: "+rectangle.getWidth()*rectangle.getHeight());
        }else{
            int width = rectangle.getWidth();
            rectangle.setHeight(10);
            System.out.println("Calculated Area of Geometry is: "+rectangle.getWidth()*rectangle.getHeight());
            System.out.println("Actual Area of Geometry is: "+rectangle.getWidth()*rectangle.getHeight());
        }

    }
}
