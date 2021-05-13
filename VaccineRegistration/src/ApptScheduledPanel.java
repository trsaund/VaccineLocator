import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class ApptScheduledPanel extends JPanel{
    private RegistrationGUI frame;
    private JLabel title;


    public ApptScheduledPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        title = new JLabel("Your appt has been scheduled." +
                "You will recieve a confirmation e-mail with the date and time of your appt.", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        add(title, BorderLayout.NORTH);
        setOpaque(false);

    }


}