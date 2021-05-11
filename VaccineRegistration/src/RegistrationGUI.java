import javax.swing.*;

public class RegistrationGUI extends JFrame {
    private RegistrationPanel regPanel;

    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regPanel = new RegistrationPanel(this);
        add(regPanel);
        pack();
        setVisible(true);
    }
    public void eligibilityScreening(){
        remove(regPanel);
        JPanel screeningPanel = new ScreeningPanel();
        add(screeningPanel);
        setVisible(true);
        repaint();
    }
    public static void main(String[] args) {
        RegistrationGUI registrationGUI = new RegistrationGUI();

    }
}
