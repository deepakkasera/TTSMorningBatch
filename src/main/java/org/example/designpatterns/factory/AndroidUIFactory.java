package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.button.AndroidButton;
import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.dropdown.AndroidDropDown;
import org.example.designpatterns.factory.components.dropdown.DropDown;
import org.example.designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
