import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class ApptCardPanel extends JPanel{
    private RegistrationGUI frame;
    private JLabel title;


    public ApptCardPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        title = new JLabel("Your Appointment Information", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        add(title, BorderLayout.NORTH);
        setOpaque(false);

        //Appointment Information
        JPanel apptInfo = new JPanel();
        apptInfo.setLayout(new BorderLayout());
        apptInfo.setBorder(BorderFactory.createEmptyBorder(60,60,60,60));
        //apptInfo.add(, BorderLayout.CENTER);

    }


}
