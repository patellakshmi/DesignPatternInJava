package creational.factory.abstractfactory.tech1;

import creational.factory.abstractfactory.tech1.common.IButton;
import creational.factory.abstractfactory.tech1.common.ICheckbox;
import creational.factory.abstractfactory.tech1.linux.Button;
import creational.factory.abstractfactory.tech1.linux.Checkbox;

public class LinuxFactory implements GUIFactory{

    @Override
    public ICheckbox getCheckbox() {
        return new Checkbox();
    }

    @Override
    public IButton getButton() {
        return new Button();
    }
}
