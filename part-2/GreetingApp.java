import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingApp extends JFrame implements ActionListener {
    private JLabel appLabel;
    private JButton greetingButton;
    private TextField nameField;
    private final JLabel sticker;

    public GreetingApp() {
        setSize(400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Greeting Form");
        sticker = new JLabel("NAME :", SwingConstants.LEFT);
        nameField = new TextField(15);
        appLabel = new JLabel("Enter your name and greet", SwingConstants.CENTER);
        greetingButton = new JButton("Greet");

        greetingButton.addActionListener(this);

        JPanel appPanel = new JPanel();

        appPanel.add(sticker);
        appPanel.add(nameField);
        appPanel.add(greetingButton);

        setLayout(new BorderLayout());
        add(appPanel, BorderLayout.NORTH);
        add(appLabel, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String name = nameField.getText().trim();
        if (!name.isEmpty()) {
            appLabel.setText("hello " + name);
        }else {
            appLabel.setText("hello " + name + " !");
        }
    }
}
