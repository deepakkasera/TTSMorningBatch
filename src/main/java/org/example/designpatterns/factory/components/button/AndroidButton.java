package org.example.designpatterns.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing android button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking android button");
    }
}
