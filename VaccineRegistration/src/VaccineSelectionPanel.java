import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class VaccineSelectionPanel extends JPanel{
    private RegistrationGUI frame;
    private JLabel vaccinePrefQuestion, title;
    private JRadioButton jandjButton, modernaButton, pfizerButton, noPreferenceButton;
    private JButton nextButton;

    public VaccineSelectionPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        title = new JLabel("Vaccine Preference", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        add(title, BorderLayout.NORTH);
        setOpaque(false);

        //Preference Question
        JPanel vaccineChoice = new JPanel();
        vaccineChoice.setLayout(new BorderLayout());
        vaccinePrefQuestion = new JLabel("Do you have a vaccine preference?", SwingConstants.CENTER);
        vaccineChoice.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        vaccineChoice.add(vaccinePrefQuestion, BorderLayout.CENTER);

        //Vaccine Options
        JPanel vaccines = new JPanel();
        modernaButton = new JRadioButton("Moderna");
        pfizerButton = new JRadioButton("Pfizer");
        jandjButton = new JRadioButton("Johnson & Johnson");
        noPreferenceButton = new JRadioButton("No Preference");
        vaccines.add(modernaButton);
        vaccines.add(pfizerButton);
        vaccines.add(jandjButton);
        vaccines.add(noPreferenceButton);
        vaccineChoice.add(vaccines,BorderLayout.SOUTH);
        add(vaccineChoice, BorderLayout.CENTER);

        //Next Button
        JPanel bottomPanel = new JPanel();
        nextButton = new JButton("Next Step");
        nextButton.addActionListener(new VaccineSelectionPanel.nextButtonListener());
        nextButton.setBackground(new Color(102,204,255));
        bottomPanel.add(nextButton);

        bottomPanel.setBorder(BorderFactory.createEmptyBorder(20,0,50,0));
        add(bottomPanel, BorderLayout.SOUTH);
    }

    /*private class addPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;

    }*/

    private class nextButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            /*if (event.getSource() == jandjButton) {
                currentPatient.setVaccinePref("Johnson & Johnson");
            }
            else if (event.getSource() == modernaButton) {
                currentPatient.setVaccinePref("Moderna");
            }
            else if (event.getSource() == pfizerButton) {
                currentPatient.setVaccinePref("Pfizer");
            }
            else {
                currentPatient.setVaccinePref("No Preference");
            }*/

            frame.apptSelector();
        }
    }

}
