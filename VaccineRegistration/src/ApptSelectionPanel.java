import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class ApptSelectionPanel extends JPanel{
    private RegistrationGUI frame;
    private JButton nextButton;

    public ApptSelectionPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setLayout(new BorderLayout());

        //Title
        JPanel topPanel = new JPanel();
        JLabel title = new JLabel("Appointments Available Near You", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        topPanel.setBackground(Color.lightGray);
        topPanel.add(title);
        add(topPanel, BorderLayout.NORTH);

        //Main Panel for Patient Information Input
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(80,50,80,50));
        mainPanel.setLayout(new GridLayout(5,2));


        //Next Buttons
        JPanel bottomPanel = new JPanel();
        nextButton = new JButton("Next Step");
        nextButton.addActionListener(new nextButtonListener());
        nextButton.setBackground(new Color(102,204,255));
        bottomPanel.add(nextButton);

        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0,0,50,0));
        bottomPanel.setBackground(Color.lightGray);
        add(bottomPanel, BorderLayout.SOUTH);

    }

    private class nextButtonListener implements ActionListener { //make new instance of patient class using information entered in GUI
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == nextButton){
                frame.apptCard();

            }

        }
    }
}


