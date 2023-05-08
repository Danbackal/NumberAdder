import java.awt.event.*
;import javax.swing.*;

public class Calculator {
    JFrame f;
    int windowX;
    int windowY;
    JTextField tf;
    ActionListener b1;
    Calculator(int windowx, int windowy) {
        /*
        learning about frames
        looks like setBounds uses weird measurements, should be using layout style
        will probably want grad layout style, but that doesn't include the info at top
        Looks like way to go is master layer, then add others in
        will need a better tutorial
        */
        f = new JFrame("Calculator", null);
        windowX = windowx;
        windowY = windowy;

        tf = new JTextField();
        tf.setBounds(20, 20, windowX - 40, 20);

        JButton b = new JButton("Click", null);
        b.setBounds(windowX/2 - 50, windowY/2 - 50, 100, 100);
        b1 = new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                tf.setText("What up");
            }
        };
        b.addActionListener(b1);

        f.add(b);
        f.add(tf);

        f.setSize(windowX, windowY);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator(400, 500);
        
    }
}
