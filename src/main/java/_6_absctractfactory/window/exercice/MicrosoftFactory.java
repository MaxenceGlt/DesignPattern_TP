package _6_absctractfactory.window.exercice;

import _6_absctractfactory.window.correction.Button;
import _6_absctractfactory.window.correction.Input;
import _6_absctractfactory.window.correction.Screen;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowButton;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowInput;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowScreen;

public class MicrosoftFactory implements AbstractFactory{

    @Override
    public Button addButton() { return new MicrosoftWindowButton(); }

    @Override
    public Input addInput() {
        return new MicrosoftWindowInput();
    }

    @Override
    public Screen addScreen() {
        return new MicrosoftWindowScreen();
    }

    @Override
    public void dessinerEcran() {
        Screen screen = addScreen();
        screen.add(this.addButton());
        System.out.println("Ecran microsoft");
    }
}
