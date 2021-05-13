import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class RegistrationPanel extends JPanel{
    private RegistrationGUI frame;
    private JLabel patientNameLabel, patientDOBLabel, patientZipCodeLable, patientEmailLabel, patientPhoneLabel, title, FAQ;
    private JButton resetButton, nextButton, FAQButton;
    private JTextField patientNameField, patientDOBField, patientZipCodeField, patientEmailField, patientPhoneField;
    private int patientID;

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

        //Main Panel for Patient Information Input
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(80,50,80,50));
        mainPanel.setLayout(new GridLayout(5,2));
        JLabel patientNameLabel = new JLabel("Name: ");
        patientNameField = new JTextField(50);
        mainPanel.add(patientNameLabel);
        mainPanel.add(patientNameField);

        JLabel patientDOBLabel = new JLabel("Date of Birth (MM/DD/YYYY): ");
        patientDOBField = new JTextField(10);
        mainPanel.add(patientDOBLabel);
        mainPanel.add(patientDOBField);
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.setBackground(Color.lightGray);

        JLabel patientZipCodeLabel = new JLabel("Zip Code: ");
        patientZipCodeField = new JTextField(5);
        mainPanel.add(patientZipCodeLabel);
        mainPanel.add(patientZipCodeField);
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.setBackground(Color.lightGray);

        JLabel patientPhoneLabel = new JLabel("Phone Number (XXX-XXX-XXXX): ");
        patientPhoneField = new JTextField(12);
        mainPanel.add(patientPhoneLabel);
        mainPanel.add(patientPhoneField);
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.setBackground(Color.lightGray);

        JLabel patientEmailLabel = new JLabel("Email: ");
        patientEmailField = new JTextField(10);
        mainPanel.add(patientEmailLabel);
        mainPanel.add(patientEmailField);
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

    private class resetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == resetButton){
                patientNameField.setText("");
                patientDOBField.setText("");
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
                String patientName = patientNameField.getText();
                double patientZipCode = Double.parseDouble(patientZipCodeField.getText());
                String patientEmail = patientEmailField.getText();
                String patientPhone = patientPhoneField.getText();
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
                Date patientDOB = null;
                try {
                    patientDOB = formatter.parse(patientDOBField.getText());
                }
                catch (ParseException e) {
                    e.printStackTrace();
                }

                //creates new Patient instance using input
                Patient newPatient = new Patient(patientName, patientDOB, patientZipCode, patientEmail, patientPhone);

                patientID += 1; // after patient file is created, increase patient counter for next input
                frame.screening();

            }

        }
    }

}

