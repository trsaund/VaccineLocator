import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class RegistrationGUI extends JFrame {
    private RegistrationPanel regPanel;
    private ScreeningPanel screeningPanel;
    private VaccineSelectionPanel vaccSelectPanel;
    private IneligiblePanel ineligiblePanel;
    private ApptSelectionPanel apptSelection;
    private ApptScheduledPanel apptScheduled;
    private NoAvailabilityPanel noAvailAppts;
    private Patient newPatient;
    private CountySiteRoster site;



    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screeningPanel = new ScreeningPanel(this);
        add(screeningPanel);
        pack();
        setVisible(true);
        setSize(900,600);
    }

    public void vaccineSelect(){
        VaccineSelectionPanel vaccSelectPanel = new VaccineSelectionPanel(this);
        update(screeningPanel, vaccSelectPanel);
        setSize(500,500);
        repaint();
    }

    public void ineligibleMessage(){
        ineligiblePanel = new IneligiblePanel(this);
        update(screeningPanel, ineligiblePanel);
        setSize(900,600);
        repaint();
    }

    public void screening(){
        screeningPanel = new ScreeningPanel(this);
        update(regPanel, screeningPanel);
        setSize(1500,500);
        repaint();
    }

    public void registration() {
        regPanel = new RegistrationPanel(this);
        update(screeningPanel, regPanel);
        setSize(1000,600);
        repaint();
    }

    public void apptSelector() throws FileNotFoundException {
        apptSelection = new ApptSelectionPanel(this);
        update(regPanel, apptSelection);
        setSize(800,800);
        repaint();

    }
    public void apptScheduled(){
        apptScheduled = new ApptScheduledPanel(this);
        update(apptSelection, apptScheduled);
        setSize(900,500);
        repaint();
    }

    public void FAQ() {
        JPanel theFAQ = new FAQ();
        update(regPanel, theFAQ);
        setSize(600,700);
        repaint();
    }

    public void noAvailAppt() {
        noAvailAppts = new NoAvailabilityPanel(this);
        update(apptSelection, noAvailAppts);
        setSize(900,200);
        repaint();
    }

    public void update(JPanel currentPanel, JPanel nextPanel) {
        remove(currentPanel);
        add(nextPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) throws FileNotFoundException {
        //CountySiteRoster johnsonCountySites = new CountySiteRoster("JohnsonCounty.txt");
        RegistrationGUI registrationGUI = new RegistrationGUI();
        String test = "8288288288";
        System.out.println(test.length());
    }
}
