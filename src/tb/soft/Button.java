package tb.soft;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


public class Button extends JFrame{

    int x1, y1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new Button().run();
        });
    }


    public Button(){
        setTitle("Uciekający przycisk");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);


        setLayout(null);

        JButton button = new JButton("Złap mnie");
        button.setBounds(870, 550, 100, 100);
        add(button);

        Random rand = new Random();

        button.addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me){
                x1 = me.getX();
                y1 = me.getY();

                int x=rand.nextInt(870);
                int y=rand.nextInt(550);
                if(x1>20 && x1<80 && y1>20 && y1<80) {
                    button.setLocation(x, y);
                }
            }
        });

        button.addActionListener((e)->{

            SwingUtilities.invokeLater(()->{
                new Draw().run();
            });
            setVisible(false);
        });

        JButton reset = new JButton("Reset");
        reset.setBounds(0, 0, 100, 50);
        add(reset);

        reset.addActionListener(e -> {
            button.setLocation(870,550);
        });
    }




    private void run() {
        setVisible(true);
    }
}
