package com.oyster.amo.lab3;

import javax.swing.*;
import java.applet.Applet;

public class MainInterpolation extends Applet {

    public static void main(String[] args) {


        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        InterpolationFrame frame = new InterpolationFrame();
    }
}