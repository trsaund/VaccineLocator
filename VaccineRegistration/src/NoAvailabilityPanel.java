import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class NoAvailabilityPanel {
    private RegistrationGUI frame;
    private JLabel noAvailMessage;

    public NoAvailabilityPanel(RegistrationGUI frame) {
        frame.setFocusable();
        this.frame = frame;
        frame.setLayout(new BorderLayout());
        noAvailMessage = new JLabel("There are no vaccines available in your area at this time. " +
                "Please check back again soon.", SwingConstants.CENTER);
        noAvailMessage.setFont(new Font("Sans Serif", Font.BOLD, 15));
        noAvailMessage.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.add(noAvailMessage, BorderLayout.CENTER);

    }
}
