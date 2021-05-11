import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class ApptCardPanel extends JPanel{
    private RegistrationGUI frame;
    private JLabel vaccinePrefQuestion, title;
    private JRadioButton jandjButton, modernaButton, pfizerButton, noPreferenceButton;
    private JButton saveButton;

    public ApptCardPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        title = new JLabel("Vaccine Preference", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        add(title, BorderLayout.NORTH);
        setOpaque(false);

        //Appointment Information
        JPanel apptInfo = new JPanel();
        apptInfo.setLayout(new BorderLayout());
        apptInfo.setBorder(BorderFactory.createEmptyBorder(60,60,60,60));
        apptInfo.add(vaccinePrefQuestion, BorderLayout.CENTER);

        //Save as PDF Button
        JPanel bottomPanel = new JPanel();
        saveButton = new JButton("Save as PDF");
        saveButton.addActionListener(new ApptCardPanel.saveButtonListener());
        saveButton.setBackground(new Color(102,204,255));
        bottomPanel.add(saveButton);

        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0,0,50,0));
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private class saveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == saveButton) {
                frame.registration();
            }
        }
    }

}
