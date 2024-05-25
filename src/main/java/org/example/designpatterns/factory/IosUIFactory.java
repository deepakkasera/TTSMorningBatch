package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.button.IosButton;
import org.example.designpatterns.factory.components.dropdown.DropDown;
import org.example.designpatterns.factory.components.dropdown.IosDropDown;
import org.example.designpatterns.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
