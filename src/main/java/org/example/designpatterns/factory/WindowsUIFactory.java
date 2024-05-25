package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.button.WindowsButton;
import org.example.designpatterns.factory.components.dropdown.DropDown;
import org.example.designpatterns.factory.components.dropdown.WindowsDropDown;
import org.example.designpatterns.factory.components.menu.Menu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
