import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class AllergyWarningPanel extends JPanel {
    private RegistrationGUI frame;
    private JLabel allergyWarning, polyglycolAllergy, polysorbateAllergy;
    private JButton proceedButton;

    public AllergyWarningPanel(RegistrationGUI frame){
        setFocusable(true);
        this.frame = frame;
        setSize(1000,1000);
        setLayout(new BorderLayout());

        allergyWarning = new JLabel("Based on your answers to the eligibility screening, you have indicated an allergy to either polyethylene glycol (PEG) or polysorbate.", SwingConstants.CENTER);
        allergyWarning.setFont(new Font("Sans Serif", Font.BOLD, 20));
        allergyWarning.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        add(allergyWarning, BorderLayout.NORTH);

        //Warning message for polyethylene glycol allergy
        JPanel warnings = new JPanel();
        polyglycolAllergy = new JLabel("If you are allergic to polyethylene glycol (PEG) it is recommended that you receive the Johnson and Johnson vaccine.");
        polyglycolAllergy.setFont(new Font("Sans Serif", Font.BOLD, 20));
        polyglycolAllergy.setForeground(Color.red);
        polyglycolAllergy.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        warnings.add(polyglycolAllergy);

        //Warning message for polysorbate allergy
        polysorbateAllergy = new JLabel("If you are allergic to polysorbate it is recommended that you receive an mRNA vaccine (Pfizer or Moderna).");
        polysorbateAllergy.setFont(new Font("Sans Serif", Font.BOLD, 20));
        polysorbateAllergy.setForeground(Color.red);
        polysorbateAllergy.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        warnings.add(polysorbateAllergy);

        add(warnings, BorderLayout.CENTER);

        JPanel vaccineButton = new JPanel();
        proceedButton = new JButton("Proceed to registration");
        proceedButton.addActionListener(new AllergyWarningPanel.registrationListener());
        proceedButton.setBackground(new Color(107, 111, 113));
        vaccineButton.add(proceedButton);
        add(vaccineButton, BorderLayout.SOUTH);
        setOpaque(false);
    }

    private class registrationListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if (event.getSource() == proceedButton){
                //frame.removeAllergyWarning();
            }
        }


    }





}
