import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class RegistrationPanel extends JPanel{
    private RegistrationGUI frame;
    private JLabel patientNameLabel, patientZipCodeLable, patientEmailLabel, patientPhoneLabel, title, FAQ,
            vaccinePrefQuestion;
    private JButton resetButton, nextButton, FAQButton;
    private JRadioButton jandjButton, modernaButton, pfizerButton, noPreferenceButton;
    private JTextField patientFirstNameField, patientLastNameField, patientZipCodeField, patientEmailField,
            patientPhoneField;
    private int patientID;
    private Patient currentPatient;

    public RegistrationPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setLayout(new BorderLayout());

        //Title
        JPanel topPanel = new JPanel();
        JLabel title = new JLabel("COVID-19 Vaccine Registration", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        topPanel.setBackground(Color.lightGray);
        topPanel.add(title);
        add(topPanel, BorderLayout.NORTH);

        //Main Panel for Patient Information Input and Vaccine Preference
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(80,50,80,50));
        mainPanel.setLayout(new GridLayout(6,2));
        JLabel patientFirstNameLabel = new JLabel("First Name: ");
        patientFirstNameField = new JTextField(50);
        mainPanel.add(patientFirstNameLabel);
        mainPanel.add(patientFirstNameField);

        JLabel patientLastNameLabel = new JLabel("Last Name: ");
        patientLastNameField = new JTextField(50);
        mainPanel.add(patientLastNameLabel);
        mainPanel.add(patientLastNameField);

        JLabel patientZipCodeLabel = new JLabel("Zip Code: ");
        patientZipCodeField = new JTextField(5);
        mainPanel.add(patientZipCodeLabel);
        mainPanel.add(patientZipCodeField);

        JLabel patientPhoneLabel = new JLabel("Phone Number (XXX-XXX-XXXX): ");
        patientPhoneField = new JTextField(12);
        mainPanel.add(patientPhoneLabel);
        mainPanel.add(patientPhoneField);

        JLabel patientEmailLabel = new JLabel("Email: ");
        patientEmailField = new JTextField(10);
        mainPanel.add(patientEmailLabel);
        mainPanel.add(patientEmailField);

        vaccinePrefQuestion = new JLabel("Do you have a vaccine preference?");
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(vaccinePrefQuestion, BorderLayout.CENTER);

        //Vaccine Options
        JPanel vaccines = new JPanel();
        vaccines.setBackground(Color.lightGray);
        modernaButton = new JRadioButton("Moderna");
        modernaButton.setBackground(Color.lightGray);
        pfizerButton = new JRadioButton("Pfizer");
        pfizerButton.setBackground(Color.lightGray);
        jandjButton = new JRadioButton("Johnson & Johnson");
        jandjButton.setBackground(Color.lightGray);
        noPreferenceButton = new JRadioButton("No Preference");
        noPreferenceButton.setBackground(Color.lightGray);
        vaccines.add(modernaButton);
        vaccines.add(pfizerButton);
        vaccines.add(jandjButton);
        vaccines.add(noPreferenceButton);
        mainPanel.add(vaccines,BorderLayout.SOUTH);
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.setBackground(Color.lightGray);

        //Reset, Enter and FAQ Buttons
        JPanel bottomPanel = new JPanel();
        resetButton = new JButton("Reset");
        resetButton.addActionListener(new resetButtonListener());
        resetButton.setBackground(new Color(102,204,255));
        bottomPanel.add(resetButton);

        FAQButton = new JButton ("COVID-19 Vaccine FAQ");
        FAQButton.addActionListener(new faqButtonListener());
        FAQButton.setBackground(new Color(102,204,255));
        bottomPanel.add(FAQButton);

        nextButton = new JButton("Next Step");
        nextButton.addActionListener(new nextButtonListener());
        nextButton.setBackground(new Color(102,204,255));
        bottomPanel.add(nextButton);

        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0,0,50,0));
        bottomPanel.setBackground(Color.lightGray);
        add(bottomPanel, BorderLayout.SOUTH);

    }

    private Patient getCurrentPatient() {
        return currentPatient;
    }

    private class resetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == resetButton){
                patientFirstNameField.setText("");
                patientLastNameField.setText("");
                patientEmailField.setText("");
                patientPhoneField.setText("");
                patientZipCodeField.setText("");
            }

        }
    }
    
    private class faqButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == FAQButton) {
                frame.FAQ();
            }
        }
    }

    private class nextButtonListener implements ActionListener { //make new instance of patient class using information entered in GUI
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == nextButton){
                //parse input from GUI
                String patientFirstName = patientFirstNameField.getText();
                String patientLastName = patientLastNameField.getText();
                int patientZipCode = Integer.parseInt(patientZipCodeField.getText());
                String patientEmail = patientEmailField.getText();
                String patientPhone = patientPhoneField.getText();

                //creates new Patient instance using input
                Patient currentPatient = new Patient(patientFirstName, patientLastName, patientZipCode, patientEmail, patientPhone);
                frame.screening();

            }
            if (event.getSource() == jandjButton) {
                currentPatient.setVaccinePref("Johnson & Johnson");
            }
            else if (event.getSource() == modernaButton) {
                currentPatient.setVaccinePref("Moderna");
            }
            else if (event.getSource() == pfizerButton) {
                currentPatient.setVaccinePref("Pfizer");
            }
            //default setting for vaccine preference is already no preference, so do not need listener for this option

        }
    }

     /*private class jandjButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

        }
    }*/

}

