package creational.factory.abstractfactory.driver;

import creational.factory.abstractfactory.tech1.*;
import creational.factory.abstractfactory.tech1.common.IButton;
import creational.factory.abstractfactory.tech1.common.ICheckbox;

public class Driver {
    public void drive(){
        GUIFactory guiFactory = AbstractFactory.getFactory(Type.LINUX);
        IButton iButton = guiFactory.getButton();
        ICheckbox checkbox = guiFactory.getCheckbox();
    }
}
