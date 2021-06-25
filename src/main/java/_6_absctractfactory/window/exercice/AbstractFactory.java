package _6_absctractfactory.window.exercice;

import _6_absctractfactory.window.correction.Button;
import _6_absctractfactory.window.correction.Input;
import _6_absctractfactory.window.correction.Screen;

public interface AbstractFactory {

    Button addButton();

    Input addInput();

    Screen addScreen();

    void dessinerEcran();
}
