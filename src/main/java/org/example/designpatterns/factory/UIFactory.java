package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.dropdown.DropDown;
import org.example.designpatterns.factory.components.menu.Menu;

public interface UIFactory {
    //Factory Methods.
    Button createButton();

    Menu createMenu();

    DropDown createDropDown();
}
