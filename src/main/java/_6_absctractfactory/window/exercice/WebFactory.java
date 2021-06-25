package _6_absctractfactory.window.exercice;

import _6_absctractfactory.window.correction.Button;
import _6_absctractfactory.window.correction.Input;
import _6_absctractfactory.window.correction.Screen;
import _6_absctractfactory.window.exercice.web.WebButton;
import _6_absctractfactory.window.exercice.web.WebInput;
import _6_absctractfactory.window.exercice.web.WebScreen;

public class WebFactory implements AbstractFactory {
    @Override
    public Button addButton() {
        return new WebButton();
    }

    @Override
    public Input addInput() {
        return new WebInput();
    }

    @Override
    public Screen addScreen() {
        return new WebScreen();
    }

    @Override
    public void dessinerEcran() {
        Screen screen = addScreen();
        screen.add(this.addButton());
        System.out.println("Ecran Web");
    }
}
