import javax.swing.*;

public class RegistrationGUI extends JFrame {
    public static int Height;
    public static int Width;

    private RegistrationPanel regPanel;
    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        //Height = 400;
        //Width = 600;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //getContentPane().setPreferredSize(new Dimension(Width, Height));
        //pack();
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
