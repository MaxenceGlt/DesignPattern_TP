package _6_absctractfactory.window.exercice;

public class Application {
    public static void main(String[] args) {

        AbstractFactory abstractFactoryWeb = new WebFactory();

        AbstractFactory abstractFactoryMicrosoft = new MicrosoftFactory();

        abstractFactoryWeb.addButton();
        abstractFactoryWeb.addInput();
        abstractFactoryWeb.addScreen();
        abstractFactoryWeb.dessinerEcran();

        System.out.println("-----------------");

        abstractFactoryMicrosoft.addButton();
        abstractFactoryMicrosoft.addInput();
        abstractFactoryMicrosoft.addScreen();
        abstractFactoryMicrosoft.dessinerEcran();
    }
}
