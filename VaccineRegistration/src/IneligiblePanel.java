import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class IneligiblePanel extends JPanel {
    private RegistrationGUI frame;
    private JLabel ineligibleMessage;

    public IneligiblePanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        ineligibleMessage = new JLabel("Based on your answer to the eligibility " +
                "questionaire, you are ineligible for the COVID-19 vaccine.", SwingConstants.CENTER);
        ineligibleMessage.setFont(new Font("Sans Serif", Font.BOLD, 20));
        ineligibleMessage.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        add(ineligibleMessage, BorderLayout.CENTER);
        setOpaque(false);

    }

}