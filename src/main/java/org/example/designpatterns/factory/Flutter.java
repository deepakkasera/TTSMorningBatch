package org.example.designpatterns.factory;

public class Flutter {
    //Non Factory methods.
    void refreshUI() {
        System.out.println("Refresh UI");
    }

    void setTheme() {
        System.out.println("Set theme");
    }

    public UIFactory getUIFactory(SupportedPlatforms platform) {
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
