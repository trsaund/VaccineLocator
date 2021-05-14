import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApptSelectionPanel extends JPanel {
    private RegistrationGUI frame;
    private JButton nextButton;
    private JComboBox<String> siteChooser;
    private JButton submitButton;
    ArrayList<String> vaccineSites; //array list because we do not know how many products there will be
    ArrayList<Patient> patients;

    public ApptSelectionPanel(RegistrationGUI frame) throws FileNotFoundException {
        setFocusable(true);
        this.frame = frame;
        setLayout(new BorderLayout());
        CountySiteRoster("JohnsonCounty.txt");

        //Title
        JPanel topPanel = new JPanel();
        JLabel title = new JLabel("Appointments Available Near You", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        topPanel.setBackground(Color.lightGray);
        topPanel.add(title);
        add(topPanel, BorderLayout.NORTH);

        //Main Panel for Appt Selection
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(80, 50, 80, 50));
        mainPanel.setLayout(new GridLayout(5, 2));
        mainPanel.setBackground(Color.lightGray);

        siteChooser = new JComboBox();
        for(int i = 0; i < vaccineSites.size(); i++){
            siteChooser.addItem(vaccineSites.get(i));
        }
        mainPanel.add(siteChooser);
        add(mainPanel);


        //Next Buttons
        JPanel bottomPanel = new JPanel();
        nextButton = new JButton("Next Step");
        nextButton.addActionListener(new nextButtonListener());
        nextButton.setBackground(new Color(102, 204, 255));
        bottomPanel.add(nextButton);

        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        bottomPanel.setBackground(Color.lightGray);
        add(bottomPanel, BorderLayout.SOUTH);

    }
    public void CountySiteRoster(String fileName) throws FileNotFoundException {
        vaccineSites = new ArrayList<String>();
        patients = new ArrayList<Patient>();
        Scanner input = new Scanner(new File(fileName));
        loadSite(input);
    }

    public void loadSite(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals("")) {
                break; //moves execution down to next while loop (or whatever next chunk of code is)
            }
            Scanner scannerLine = new Scanner(line);
            VaccineSite site = new VaccineSite(scannerLine);
            vaccineSites.add(site.getName());
        }
    }


    private class nextButtonListener implements ActionListener { //make new instance of patient class using information entered in GUI
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == nextButton){
                frame.apptScheduled();

            }

        }
    }

}


