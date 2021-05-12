import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class AllergyWarningPanel extends JPanel {
    private RegistrationGUI frame;
    private JLabel allergyWarning, polyglycolAllergy, polysorbateAllergy;
    private JButton vaccineSelection;

    public AllergyWarningPanel(RegistrationGUI frame){
        setFocusable(true);
        this.frame = frame;
        setSize(1000,1000);
        setLayout(new BorderLayout());

        allergyWarning = new JLabel("Based on your answers to the eligibility screening, you have indicated an allergy to either polyethylene glycol (PEG) or polysorbate.");
        allergyWarning.setFont(new Font("Sans Serif", Font.BOLD, 20));
        allergyWarning.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        add(allergyWarning, BorderLayout.NORTH);

        //Warning message for polyethylene glycol allergy
        polyglycolAllergy = new JLabel("If you are allergic to polyethylene glycol (PEG) it is recommended that you receive the Johnson and Johnson vaccine.");
        polyglycolAllergy.setFont(new Font("Sans Serif", Font.BOLD, 20));
        polyglycolAllergy.setForeground(Color.red);
        polyglycolAllergy.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        add(polyglycolAllergy, BorderLayout.CENTER);

        //Warning message for polysorbate allergy
        polysorbateAllergy = new JLabel("If you are allergic to polysorbate it is recommended that you receive an mRNA vaccine (Pfizer or Moderna).");
        polysorbateAllergy.setFont(new Font("Sans Serif", Font.BOLD, 20));
        polysorbateAllergy.setForeground(Color.red);
        polysorbateAllergy.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        add(polysorbateAllergy, BorderLayout.SOUTH);

        vaccineSelection = new JButton("Click for Vaccine Selection");
        vaccineSelection.addActionListener(new AllergyWarningPanel.vaccineSelectionListener());
        vaccineSelection.setBackground(new Color(107, 111, 113));
        add(vaccineSelection, BorderLayout.EAST);
        setOpaque(false);
    }

    private class vaccineSelectionListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if (event.getSource() == vaccineSelection){
                frame.removeAllergyWarning();
            }
        }


    }





}
