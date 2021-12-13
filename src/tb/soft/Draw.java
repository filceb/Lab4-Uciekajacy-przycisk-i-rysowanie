package tb.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draw extends JFrame {
    boolean b=false;
    int x,y;
    char c;
    public Draw(){
        setSize(500, 500);
        setTitle("Rysowanie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                x =me.getX();
                y =me.getY();
                b=true;
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                c = ke.getKeyChar();
                repaint();
            }


        });



    }
    public void paint ( Graphics g ) {
        if(b==true && c=='r') {
            g.drawRect(x, y, 60, 50);
        }

        if(b==true && c=='o') {
            g.drawOval(x, y, 50, 70);
        }

    }



    public void run() {
        setVisible(true);
    }


}
