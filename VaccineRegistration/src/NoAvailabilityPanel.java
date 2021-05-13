import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class NoAvailabilityPanel extends JPanel {
    private RegistrationGUI frame;
    private JLabel noAvailMessage;

    public NoAvailabilityPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setLayout(new BorderLayout());
        noAvailMessage = new JLabel("Based on your answer to the eligibility " +
                "questionaire, you are ineligible for the COVID-19 vaccine.", SwingConstants.CENTER);
        noAvailMessage.setFont(new Font("Sans Serif", Font.BOLD, 15));
        noAvailMessage.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(noAvailMessage, BorderLayout.CENTER);
        setOpaque(false);

    }

}
