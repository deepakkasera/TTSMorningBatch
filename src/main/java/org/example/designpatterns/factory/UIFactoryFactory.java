package org.example.designpatterns.factory;

public class UIFactoryFactory {
    //Practical Factory
    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platform) {
        if (platform.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUIFactory();
        } else if (platform.equals(SupportedPlatforms.IOS)) {
            return new IosUIFactory();
        } else if (platform.equals(SupportedPlatforms.WINDOWS)) {
            return new WindowsUIFactory();
        }

        return null;
    }
}
