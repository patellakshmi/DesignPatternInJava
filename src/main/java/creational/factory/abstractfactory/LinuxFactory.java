package creational.factory.abstractfactory;

public class LinuxFactory implements GUIFactory{

    @Override
    public ICheckbox getCheckbox() {
        return null;
    }

    @Override
    public IButton getButton() {
        return null;
    }
}
