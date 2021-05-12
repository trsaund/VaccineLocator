import javax.swing.*;

public class RegistrationGUI extends JFrame {
    private RegistrationPanel regPanel;
    private ScreeningPanel screeningPanel;
    private VaccineSelectionPanel vaccSelectPanel;
    private IneligiblePanel ineligiblePanel;
    private ApptCardPanel apptCardPanel;

    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screeningPanel = new ScreeningPanel(this);
        add(screeningPanel);
        pack();
        setVisible(true);
    }

    public void vaccineSelect(){
        remove(screeningPanel);
        vaccSelectPanel = new VaccineSelectionPanel(this);
        add(vaccSelectPanel);
        pack();
        setVisible(true);
        repaint();
    }

    public void ineligibleMessage(){
        remove(screeningPanel);
        ineligiblePanel = new IneligiblePanel(this);
        add(ineligiblePanel);
        pack();
        setVisible(true);
        repaint();
    }

    public void registration(){
        remove(vaccSelectPanel);
        regPanel = new RegistrationPanel(this);
        add(regPanel);
        pack();
        setVisible(true);
        repaint();
    }

    public void apptCard(){
        remove(regPanel);
        apptCardPanel = new ApptCardPanel(this);
        add(apptCardPanel);
        pack();
        setVisible(true);
        repaint();
    }

    public void FAQ() {
        remove(regPanel);
        JPanel theFAQ = new FAQ();
        add(theFAQ);
        pack();
        setVisible(true);
        repaint();
    }



    public static void main(String[] args) {
        RegistrationGUI registrationGUI = new RegistrationGUI();

    }
}
