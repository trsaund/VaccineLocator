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
        //remove(screeningPanel);
        vaccSelectPanel = new VaccineSelectionPanel(this);
        //add(vaccSelectPanel);
        //pack();
        //setVisible(true);
        update(screeningPanel, vaccSelectPanel);
        setSize(500,500);
        repaint();
    }

    public void ineligibleMessage(){
        //remove(screeningPanel);
        ineligiblePanel = new IneligiblePanel(this);
        //add(ineligiblePanel);
        //pack();
        //setVisible(true);
        update(screeningPanel, ineligiblePanel);
        setSize(900,200);
        repaint();
    }

    public void allergyWarning(){
        //remove(screeningPanel);
        allergyWarning = new AllergyWarningPanel(this);
        //add(allergyWarning);
        //pack();
        //setVisible(true);
        update(screeningPanel, allergyWarning);
        setSize(800,800);
        repaint();
    }

    public void screening(){
        //remove(vaccSelectPanel);
        screeningPanel = new ScreeningPanel(this);
        //add(screeningPanel);
        //pack();
        //setVisible(true);
        update(regPanel, screeningPanel);
        setSize(800,500);
        repaint();
    }

     /*public void registration(){
        //remove(vaccSelectPanel);
        regPanel = new RegistrationPanel(this);
        //add(regPanel);
        //pack();
        //setVisible(true);
        setSize(800,500);
        repaint();
    } */

    public void apptSelector(){
        //remove(regPanel);
        apptSelection = new ApptSelectionPanel(this);
        update(regPanel, apptSelection);
        //add(apptSelection);
        //pack();
        //setVisible(true);
        setSize(800,800);
        repaint();

    }
    public void apptScheduled(){
        //remove(regPanel);
        apptScheduled = new ApptScheduledPanel(this);
        update(apptSelection, apptScheduled);
        //add(apptCardPanel);
        //pack();
        //setVisible(true);
        setSize(900,500);
        repaint();
    }

    public void FAQ() {
        JPanel theFAQ = new FAQ();
        //remove(regPanel);
        //add(theFAQ);
        //pack();
        //setVisible(true);
        update(regPanel, theFAQ);
        setSize(900,200);
        repaint();
    }

    public void noAvailAppt() {
        noAvailAppts = new NoAvailabilityPanel(this);
        //remove(apptSelection);
        //add(noAvailAppts);
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
