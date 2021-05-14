package creational.factory.abstractfactory.tech2.factory;

import creational.factory.abstractfactory.tech2.common.ICheckbox;
import creational.factory.abstractfactory.tech2.linux.Checkbox;

public class LinuxCheckboxFactory implements ICheckboxFactory {
    @Override
    public ICheckbox getCheckbox() {
        return new Checkbox();
    }
}
