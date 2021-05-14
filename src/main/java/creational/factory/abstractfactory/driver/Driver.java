package creational.factory.abstractfactory.driver;

import creational.factory.abstractfactory.*;

public class Driver {
    public void drive(){
        GUIFactory guiFactory = AbstractFactory.getFactory(Type.LINUX);
        IButton iButton = guiFactory.getButton();
        ICheckbox checkbox = guiFactory.getCheckbox();
    }
}
