import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Design{
    public static void main (String[]args) {
        JFrame frame = new JFrame("Signup");
        frame.setSize(800,800);
        frame.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(40,80,420,320);
        frame.add(panel);
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
        panel.setBorder(border);
     
        JLabel EmailLabel = new JLabel("Email:");
        EmailLabel.setBounds(20,20,100,30);
        panel.add(EmailLabel);
        
        JTextField TextLabel = new JTextField();
        TextLabel.setBounds(150,20,200,30);
        panel.add(TextLabel);
        
        JLabel GenderLabel = new JLabel("Gender:");
        GenderLabel.setBounds(20,70,100,30);
        panel.add(GenderLabel);
        
        JRadioButton Male = new JRadioButton("Male");
        Male.setBounds(150,70,80,30);
        panel.add(Male);
        
        JRadioButton Female = new JRadioButton("Female");
        Female.setBounds(240,70,100,30);
        panel.add(Female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(Male);
        genderGroup.add(Female);
        
        String [] places = {"Dharan", "Itahari", "Damak", "Biratnagar"};
        JComboBox<String> placeComboBox = new JComboBox<>(places);
        placeComboBox.setBounds(150, 120, 200, 30);
        panel.add(placeComboBox);
        
        JTextArea Text = new JTextArea();
        Text.setBounds(150,170,200,60);
        panel.add(Text);
        
        JButton Button = new JButton("Submit");
        Button.setBounds(200, 250, 100, 30);
        panel.add(Button);
        
        frame.setVisible(true);
        
        
        
        
        
        
        
        
        
        
    }
}