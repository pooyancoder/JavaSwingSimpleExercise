import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickApp extends JFrame implements ActionListener {
    private JLabel clickLabel;
    private JButton clickButton;
    private int counter = 0;

    public ClickApp() {
        setTitle("Click App");
        clickButton = new JButton("click Me");
        clickLabel = new JLabel("click : 0", SwingConstants.CENTER);
        clickButton.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);

        setLayout(new BorderLayout());
        add(clickButton, BorderLayout.SOUTH);
        add(clickLabel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        counter++;
        clickLabel.setText("click : " + counter);
    }
}
