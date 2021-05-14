package creational.factory.abstractfactory.tech2;

import creational.factory.abstractfactory.tech2.common.IButton;
import creational.factory.abstractfactory.tech2.common.ICheckbox;
import creational.factory.abstractfactory.tech2.factory.*;

public class LinuxFactory implements GUIFactory {
    private ICheckboxFactory iCheckboxFactory = new LinuxCheckboxFactory();
    private IButtonFactory iButtonFactory = new LinuxButtonFactory();

    @Override
    public ICheckbox getCheckbox() {
        return iCheckboxFactory.getCheckbox();
    }

    @Override
    public IButton getButton() {
        return iButtonFactory.getButton();
    }
}
