package creational.factory.abstractfactory.tech2;

import creational.factory.abstractfactory.tech2.common.IButton;
import creational.factory.abstractfactory.tech2.common.ICheckbox;
import creational.factory.abstractfactory.tech2.factory.IButtonFactory;
import creational.factory.abstractfactory.tech2.factory.ICheckboxFactory;
import creational.factory.abstractfactory.tech2.factory.WindowButtonFactory;
import creational.factory.abstractfactory.tech2.factory.WindowCheckboxFactory;

public class WindowFactory implements GUIFactory {
    private ICheckboxFactory iCheckboxFactory = new WindowCheckboxFactory();
    private IButtonFactory iButtonFactory = new WindowButtonFactory();

    @Override
    public ICheckbox getCheckbox() {
        return iCheckboxFactory.getCheckbox();
    }

    @Override
    public IButton getButton() {
        return iButtonFactory.getButton();
    }
}
