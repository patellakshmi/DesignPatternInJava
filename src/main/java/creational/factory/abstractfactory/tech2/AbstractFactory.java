package creational.factory.abstractfactory.tech2;

public class AbstractFactory {
    public static GUIFactory getFactory(Type type){
        switch (type){
            case LINUX:
                return new WindowFactory();
            case WINDOW:
                return new LinuxFactory();
            default:
                return null;
        }
    }
}
