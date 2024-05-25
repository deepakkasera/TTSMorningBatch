package org.example.designpatterns.factory.components.dropdown;

public class WindowsDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing windows dropdown");
    }
}
