package de.edward;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mains extends JFrame{

    public void option(){
        System.out.println("\n Start");
    }

    public static void main(String[] args) {
        Mains m = new Mains();
        m.option();

        m.setSize(600,600);
        m.setResizable(false);
        m.setTitle("ThreeDee");
        m.setVisible(true);

        System.out.print("\n\n ======= This code has been provided by TheBoringEdward =======\n");
    }
}
