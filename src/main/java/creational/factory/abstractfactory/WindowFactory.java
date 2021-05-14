package creational.factory.abstractfactory;

public class WindowFactory implements GUIFactory{
    @Override
    public ICheckbox getCheckbox() {
        return null;
    }

    @Override
    public IButton getButton() {
        return null;
    }
}
