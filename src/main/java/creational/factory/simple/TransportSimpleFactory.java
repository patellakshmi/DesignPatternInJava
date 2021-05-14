package creational.factory.simple;

public class TransportSimpleFactory {

    public static Transport getObject(Type type){
        switch (type){
            case HELICOPTER:
            case AEROPLANE:
                return new Helicopter();
            case CAR:
                return new Car();
            case CYCLE:
                return new Cycle();
            default:
                return null;
        }
    }
}
