import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);

        JButton redBtn = new JButton("Red");
        JButton blueBtn = new JButton("Blue");

        redBtn.setBounds(50, 200, 100, 40);
        blueBtn.setBounds(200, 200, 100, 40);

        frame.setLayout(null);
        frame.add(redBtn);
        frame.add(blueBtn);

        redBtn.addActionListener(e -> frame.getContentPane().setBackground(Color.RED));
        blueBtn.addActionListener(e -> frame.getContentPane().setBackground(Color.BLUE));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}