import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationApp extends JFrame implements ActionListener {
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JRadioButton rbMale, rbFemale;
    private JCheckBox cbJava, cbPython, cbCpp;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private GridBagConstraints gbc;


    private JButton submit;

    public RegistrationApp() {
        setTitle("USER REGISTRATION APP");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;


        nameLabel = new JLabel("NAME");
        emailLabel = new JLabel("E-MAIL");
        passwordLabel = new JLabel("PASSWORD");

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel = new JLabel("NAME : "), gbc);
        gbc.gridx = 1;
        panel.add(nameField = new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(emailLabel = new JLabel("E-MAIL : "), gbc);
        gbc.gridx = 1;
        panel.add(emailField = new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel = new JLabel("PASSWORD : "), gbc);
        gbc.gridx = 1;
        panel.add(passwordField = new JPasswordField(15), gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        rbMale = new JRadioButton("Male"); rbFemale = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup(); bg.add(rbMale); bg.add(rbFemale);
        JPanel genderPanel = new JPanel(); genderPanel.add(rbMale); genderPanel.add(rbFemale);
        panel.add(genderPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Interests:"), gbc);
        gbc.gridx = 1;
        cbJava = new JCheckBox("java");cbPython = new JCheckBox("python");cbCpp = new JCheckBox("C++");
        JPanel interestPanel = new JPanel();
        interestPanel.add(cbJava); interestPanel.add(cbPython); interestPanel.add(cbCpp);
        panel.add(interestPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        submit = new JButton("SUBMIT");
        submit.addActionListener(this);
        panel.add(submit, gbc);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String name = nameField.getText();
        String email = emailField.getText();
        String gender = rbMale.isSelected() ? "male" : rbFemale.isSelected() ? "Female" : "unSpecified";
        String interest = "";
        interest += cbJava.isSelected() ? "JAVA  " : "";
        interest += cbPython.isSelected()? "PYTHON  " : "";
        interest += cbCpp.isSelected() ? "C++  " : "";

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Interests: " + interest,
                "Registration Details", JOptionPane.INFORMATION_MESSAGE);

    }


}
