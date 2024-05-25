package org.example.designpatterns.factory.components.dropdown;

public class IosDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing IOS dropdown");
    }
}
