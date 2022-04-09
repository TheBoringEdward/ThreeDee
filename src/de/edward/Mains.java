package de.edward;

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Mains extends JFrame{

    int mx = 0;

    Scanner s2 = new Scanner(System.in);

    /*
    public void option(){
        System.out.println("\n Start");
        while(true){
            move();
        }
    }

    public static void paint(int x,int y,int XSIZE,int YSIZE) {
        Graphics g = frame.getGraphics();
        g.setColor(Color.red);
        g.fillOval(x, y, XSIZE, YSIZE);
        g.dispose();
    }


    public void move(){
        System.out.print("\n\n Enter amount: ");
        mx = s2.nextInt();
    }
     */

    ///////

    public Mains() throws InterruptedException {
        super("Three Dee");

        // You can set the content pane of the frame to your custom class.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        setContentPane(new DrawPane());
        System.out.println("test");
        wait(100);
        System.out.println("test");
        wait(100);
        System.out.println("test");
        wait(100);

    }

    //I'm too dumb for this shit

    // Create a component that you can actually draw on.
    class DrawPane extends JPanel {
        public void paintComponent(Graphics g) {
            //g.fillRect(20, 20, 100, 200); // Draw on g here e.g.
            g.drawLine(10, 10, 40, 40);
        }
    }

    public static void main(String [] args) throws InterruptedException {
        new Mains();
        System.out.print("\n\n ======= This code has been provided by TheBoringEdward =======\n");
    }

    //////

    /*
    public static void main(String[] args) {
        Mains m = new Mains();
        m.option();

        m.setSize(600,600);
        m.setResizable(false);
        m.setTitle("ThreeDee");
        m.setVisible(true);
        m.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        System.out.print("\n\n ======= This code has been provided by TheBoringEdward =======\n");
    }
     */
}
