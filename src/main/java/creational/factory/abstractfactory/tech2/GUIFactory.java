package creational.factory.abstractfactory.tech2;

import creational.factory.abstractfactory.tech2.common.IButton;
import creational.factory.abstractfactory.tech2.common.ICheckbox;

public interface GUIFactory {
    public ICheckbox getCheckbox();
    public IButton getButton();
}
