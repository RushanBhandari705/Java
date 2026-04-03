import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RegisterForm");
        frame.setSize(900,900);
        frame.setLayout(null);
        
        JLabel FnameLabel = new JLabel("FirstName:");
        FnameLabel.setBounds(50, 50, 100, 30);
        frame.add(FnameLabel);

        JTextField FnameField = new JTextField();
        FnameField.setBounds(150, 50, 150, 30);
        frame.add(FnameField);

        JLabel LnameLabel = new JLabel("LastName:");
        LnameLabel.setBounds(320, 50, 100, 30);
        frame.add(LnameLabel);

        JTextField LnameField = new JTextField();
        LnameField.setBounds(420, 50, 150, 30);
        frame.add(LnameField);

        JLabel EmailLabel = new JLabel("Email:");
        EmailLabel.setBounds(50, 110, 100, 30);
        frame.add(EmailLabel);

        JTextField EmailField = new JTextField();
        EmailField.setBounds(150, 110, 150, 30);
        frame.add(EmailField);

        JLabel PasswordLabel = new JLabel("Password:");
        PasswordLabel.setBounds(320, 110, 100, 30);
        frame.add(PasswordLabel);

        JTextField PasswordField = new JTextField();
        PasswordField.setBounds(420, 110, 150, 30);
        frame.add(PasswordField);

        JLabel AddressLabel = new JLabel("Address:");
        AddressLabel.setBounds(50, 170, 100, 30);
        frame.add(AddressLabel);

        JTextField AddressField = new JTextField();
        AddressField.setBounds(150, 170, 150, 30);
        frame.add(AddressField);

        JLabel ScodeLabel = new JLabel("SecretCode:");
        ScodeLabel.setBounds(320, 170, 100, 30);
        frame.add(ScodeLabel);

        JTextField ScodeField = new JTextField();
        ScodeField.setBounds(420, 170, 150, 30);
        frame.add(ScodeField);
        
        JLabel GenderLabel = new JLabel("Gender:");
        GenderLabel.setBounds(200, 230, 100, 30);
        frame.add(GenderLabel);
        
        JRadioButton MaleLabel = new JRadioButton("Male");
        MaleLabel.setBounds(300, 230, 80, 30);
        frame.add(MaleLabel);
        
        JRadioButton FemaleLabel = new JRadioButton("Female");
        FemaleLabel.setBounds(400, 230, 100, 30);
        frame.add(FemaleLabel);
        
        JButton ButtonLabel = new JButton("Register");
        ButtonLabel.setBounds(300, 290, 120, 35);
        frame.add(ButtonLabel);
        

        frame.setVisible(true);
    }
}
