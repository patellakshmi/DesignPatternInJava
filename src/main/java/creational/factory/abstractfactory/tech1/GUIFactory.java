package creational.factory.abstractfactory.tech1;

import creational.factory.abstractfactory.tech1.common.IButton;
import creational.factory.abstractfactory.tech1.common.ICheckbox;

public interface GUIFactory {
    public ICheckbox getCheckbox();
    public IButton getButton();
}
