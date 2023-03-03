import javax.swing.*;

public class MyForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameTextField = new JTextField(5);
        panel.add(firstNameLabel);
        panel.add(firstNameTextField);
        
        JLabel surnameLabel = new JLabel("Surname:");
        JTextField surnameTextField = new JTextField(20);
        panel.add(surnameLabel);
        panel.add(surnameTextField);
        
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageTextField = new JTextField(5);
        panel.add(ageLabel);
        panel.add(ageTextField);
        
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        panel.add(okButton);
        panel.add(cancelButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
