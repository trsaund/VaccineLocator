import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreeningPanel extends JPanel {
    private RegistrationGUI frame;
    private JLabel eligQues1, eligQues2, eligQues3, eligQues4, eligQues5, title;
    private JRadioButton eligQues1_yes, eligQues_no, eligQues2_yes, eligQues2_no,
            eligQues2_na, eligQues3_yes, eligQues3_no, eligQues4_yes, eligQues4_no,
            eligQues5_yes, eligQues5_no;
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
        eligQues1 = new JLabel("Are you aged 16 or older?");
        eligQues1_yes = new JRadioButton("Yes");
        eligQues_no = new JRadioButton("No");
        eligQues_no.addActionListener(new ScreeningPanel.optionButtonListener());
        question1.add(eligQues1);
        question1.add(eligQues1_yes);
        question1.add(eligQues_no);
        questions.add(question1, BorderLayout.NORTH);


        //Question 2
        JPanel question2 = new JPanel();
        question2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQues2 = new JLabel("If you have recently tested positive for COVID-19, Has it been at least 2 weeks since symptoms?");
        eligQues2_yes = new JRadioButton("Yes");
        eligQues2_no = new JRadioButton("No");
        eligQues2_no.addActionListener(new ScreeningPanel.optionButtonListener());
        eligQues2_na = new JRadioButton("N/A");
        question2.add(eligQues2);
        question2.add(eligQues2_yes);
        question2.add(eligQues2_no);
        question2.add(eligQues2_na);
        questions.add(question2);

        //Questions 3
        JPanel question3 = new JPanel();
        question3.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQues3 = new JLabel("Have you ever had a serious allergic reaction to polyethylene glycol (PEG)?");
        eligQues3_yes = new JRadioButton("Yes");
        eligQues3_yes.addActionListener(new ScreeningPanel.optionButtonListener());
        eligQues3_no = new JRadioButton("No");
        question3.add(eligQues3);
        question3.add(eligQues3_yes);
        question3.add(eligQues3_no);
        questions.add(question3);

        //Question 4
        JPanel question4 = new JPanel();
        question4.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQues4 = new JLabel("Have you ever had a serious allergic reaction to polysorbate?");
        eligQues4_yes = new JRadioButton("Yes");
        eligQues4_yes.addActionListener(new ScreeningPanel.optionButtonListener());
        eligQues4_no = new JRadioButton("No");
        eligQues4_no.addActionListener(new ScreeningPanel.optionButtonListener());
        question4.add(eligQues4);
        question4.add(eligQues4_yes);
        question4.add(eligQues4_no);
        questions.add(question4);

        //Question 5
        JPanel question5 = new JPanel();
        question5.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eligQues5 = new JLabel("Are you a resident of Johnson County?");
        eligQues5_yes = new JRadioButton("Yes");
        eligQues5_yes.addActionListener(new ScreeningPanel.optionButtonListener());
        eligQues5_no = new JRadioButton("No");
        eligQues5_no.addActionListener(new ScreeningPanel.optionButtonListener());
        question5.add(eligQues5);
        question5.add(eligQues5_yes);
        question5.add(eligQues5_no);
        questions.add(question5);
        add(questions, BorderLayout.CENTER);

        //Next Button
        JPanel bottomPanel = new JPanel();
        nextButton = new JButton("Next Step");
        nextButton.addActionListener(new ScreeningPanel.nextButtonListener());
        nextButton.setBackground(new Color(102,204,255));
        bottomPanel.add(nextButton);

        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0,0,50,0));
        add(bottomPanel, BorderLayout.SOUTH);

    }

    private class nextButtonListener implements ActionListener { //make new instance of patient class using information entered in GUI
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == nextButton){
                frame.registration();

            }

        }
    }

    private class optionButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == eligQues_no){
                frame.ineligibleMessage();
            }
            if (event.getSource() == eligQues2_no){
                frame.ineligibleMessage();
            }
            if (event.getSource() == eligQues5_no){
                frame.ineligibleMessage();
            }
            if(event.getSource() == eligQues3_yes){
                JOptionPane.showMessageDialog(null, "If you are allergic to polyethylene glycol " +
                        "(PEG) it is recommended that you receive the Johnson and Johnson vaccine.");
            }
            if(event.getSource() == eligQues4_yes){
                JOptionPane.showMessageDialog(null, "If you are allergic to polysorbate it is " +
                        "recommended that you receive an mRNA vaccine (Pfizer or Moderna).");
            }
        }
    }
}

