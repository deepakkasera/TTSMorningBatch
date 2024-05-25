package org.example.designpatterns.factory.components.button;

public class IosButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing IOS button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Ios Button");
    }
}
