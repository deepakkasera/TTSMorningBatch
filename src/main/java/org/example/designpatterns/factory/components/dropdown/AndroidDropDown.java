package org.example.designpatterns.factory.components.dropdown;

public class AndroidDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing android dropdown");
    }
}
