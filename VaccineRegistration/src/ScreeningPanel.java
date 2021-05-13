import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class ScreeningPanel extends JPanel {
    private RegistrationGUI frame;
    private JLabel eligQuestion1, eligQuestion2, eligQuestion3, eligQuestion4, title;
    private JRadioButton eligQuestion1_yes, eligQuestion1_no, eligQuestion2_yes, eligQuestion2_no, eligQuestion2_na, eligQuestion3_yes, eligQuestion3_no, eligQuestion4_yes, eligQuestion4_no;
    private JButton nextButton;

    public ScreeningPanel(RegistrationGUI frame) {
        setFocusable(true);
        this.frame = frame;
        setLayout(new BorderLayout());
        title = new JLabel("Eligibility Screening", SwingConstants.CENTER);
        title.setFont(new Font ("Sans Serif", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        add(title, BorderLayout.NORTH);
        setOpaque(false);

        //Question 1
        JPanel questions = new JPanel();
        questions.setLayout(new BoxLayout(questions, BoxLayout.Y_AXIS));
        questions.setBorder(BorderFactory.createEmptyBorder(80,50,10,50));
        JPanel question1 = new JPanel();
        question1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQuestion1 = new JLabel("Are you aged 16 or older?");
        eligQuestion1_yes = new JRadioButton("Yes");
        eligQuestion1_no = new JRadioButton("No");
        eligQuestion1_no.addActionListener(new ScreeningPanel.optionButtonListener());
        question1.add(eligQuestion1);
        question1.add(eligQuestion1_yes);
        question1.add(eligQuestion1_no);
        questions.add(question1, BorderLayout.NORTH);


        //Question 2
        JPanel question2 = new JPanel();
        question2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQuestion2 = new JLabel("If you have recently tested positive for COVID-19, Has it been at least 2 weeks since symptoms?");
        eligQuestion2_yes = new JRadioButton("Yes");
        eligQuestion2_no = new JRadioButton("No");
        eligQuestion2_no.addActionListener(new ScreeningPanel.optionButtonListener());
        eligQuestion2_na = new JRadioButton("N/A");
        question2.add(eligQuestion2);
        question2.add(eligQuestion2_yes);
        question2.add(eligQuestion2_no);
        question2.add(eligQuestion2_na);
        questions.add(question2);

        //Questions 3
        JPanel question3 = new JPanel();
        question3.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQuestion3 = new JLabel("Have you ever had a serious allergic reaction to polyethylene glycol (PEG)?");
        eligQuestion3_yes = new JRadioButton("Yes");
        eligQuestion3_yes.addActionListener(new ScreeningPanel.optionButtonListener());
        eligQuestion3_no = new JRadioButton("No");
        question3.add(eligQuestion3);
        question3.add(eligQuestion3_yes);
        question3.add(eligQuestion3_no);
        questions.add(question3);

        //Question 4
        JPanel question4 = new JPanel();
        question4.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQuestion4 = new JLabel("Have you ever had a serious allergic reaction to polysorbate?");
        eligQuestion4_yes = new JRadioButton("Yes");
        eligQuestion4_yes.addActionListener(new ScreeningPanel.optionButtonListener());
        eligQuestion4_no = new JRadioButton("No");
        eligQuestion4_no.addActionListener(new ScreeningPanel.optionButtonListener());
        question4.add(eligQuestion4);
        question4.add(eligQuestion4_yes);
        question4.add(eligQuestion4_no);
        questions.add(question4);
        add(questions, BorderLayout.CENTER);


    }

    private class optionButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == eligQuestion1_no){
                frame.ineligibleMessage();
            }
            if (event.getSource() == eligQuestion2_no){
                frame.ineligibleMessage();
            }
            if(event.getSource() == eligQuestion3_yes){
                frame.allergyWarning();
            }
            if(event.getSource() == eligQuestion4_yes){
                frame.allergyWarning();
            }
            if(event.getSource() == eligQuestion4_no){
                frame.registration();
            }
        }
    }
}

