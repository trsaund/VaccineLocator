import javax.swing.*;
import java.io.FileNotFoundException;

public class RegistrationGUI extends JFrame {
    private RegistrationPanel regPanel;
    private ScreeningPanel screeningPanel;
    private VaccineSelectionPanel vaccSelectPanel;
    private IneligiblePanel ineligiblePanel;
    private AllergyWarningPanel allergyWarning;
    private ApptSelectionPanel apptSelection;
    private ApptScheduledPanel apptScheduled;
    private NoAvailabilityPanel noAvailAppts;
    private Patient newPatient;


    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regPanel = new RegistrationPanel(this);
        add(regPanel);
        pack();
        setVisible(true);
        setSize(900,600);
    }

    public void removeAllergyWarning(){
        remove(allergyWarning);
        vaccineSelect();
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
        setSize(1500,200);
        repaint();
    }

    public void allergyWarning(){
        allergyWarning = new AllergyWarningPanel(this);
        update(screeningPanel, allergyWarning);
        setSize(800,800);
        repaint();
    }

    public void screening(){
        screeningPanel = new ScreeningPanel(this);
        update(regPanel, screeningPanel);
        setSize(800,500);
        repaint();
    }

    public void apptSelector(){
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
        setSize(1500,1000);
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

    public static void main(String[] args) {
        //CountySiteRoster johnsonCountySites = new CountySiteRoster("JohnsonCounty.txt");
        RegistrationGUI registrationGUI = new RegistrationGUI();
        /*for(int i=0; i < johnsonCountySites.vaccineSites.size(); i++){
            System.out.println( johnsonCountySites.vaccineSites.get(i) );
        }*/

    }
}
