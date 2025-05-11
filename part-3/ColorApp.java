import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorApp extends JFrame implements ActionListener {
    private JButton green;
    private JButton blue;
    private JButton red;
    private JPanel panel;

    public ColorApp() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("THEME COLOR APP");
        setSize(400, 300);

        panel = new JPanel();

        green = new JButton("GREEN");
        blue = new JButton("BLUE");
        red = new JButton("red");

        green.setActionCommand("green");
        blue.setActionCommand("blue");
        red.setActionCommand("red");

        green.addActionListener(this);
        blue.addActionListener(this);
        red.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(green);
        buttonPanel.add(blue);
        buttonPanel.add(red);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase("green")){
            panel.setBackground(Color.GREEN);
        }else if (event.getActionCommand().equalsIgnoreCase("blue")) {
            panel.setBackground(Color.BLUE);
        } else if (event.getActionCommand().equalsIgnoreCase("red")) {
            panel.setBackground(Color.RED);
        }
    }
}
