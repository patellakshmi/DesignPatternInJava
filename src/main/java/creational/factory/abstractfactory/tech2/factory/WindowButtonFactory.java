package creational.factory.abstractfactory.tech2.factory;

import creational.factory.abstractfactory.tech2.common.IButton;
import creational.factory.abstractfactory.tech2.window.Button;

public class WindowButtonFactory implements IButtonFactory {
    @Override
    public IButton getButton() {
        return new Button();
    }
}
