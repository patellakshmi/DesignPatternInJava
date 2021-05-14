package creational.factory.abstractfactory.tech2.factory;

import creational.factory.abstractfactory.tech2.common.IButton;
import creational.factory.abstractfactory.tech2.linux.Button;

public class LinuxButtonFactory implements IButtonFactory {

    @Override
    public IButton getButton() {
        return new Button();
    }
}
