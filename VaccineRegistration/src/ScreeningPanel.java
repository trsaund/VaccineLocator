import javax.swing.*;
import java.awt.*;
public class ScreeningPanel extends JPanel {
    public ScreeningPanel() {
        setSize(1000,600);
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Eligibility Screening", SwingConstants.CENTER);
        title.setFont(new Font ("Sans Serif", Font.BOLD, 30));
        add(title, BorderLayout.NORTH);
        setOpaque(false);

        JPanel questions = new JPanel();
        JLabel queOne = new JLabel("Are you aged 16 or older? ");
        JButton queOneYes = new JButton("yes");
        JButton queOneNo = new JButton("no");
        questions.add(queOne);
        questions.add(queOneYes);
        questions.add(queOneNo);
        JLabel queTwo = new JLabel("Have you ever had an allergic reaction to another vaccine or an injectable medication?");
        JButton queTwoYes = new JButton("yes");
        JButton queTwoNo = new JButton("no");
        questions.add(queTwo);
        questions.add(queTwoYes);
        questions.add(queTwoNo);
        add(questions, BorderLayout.CENTER);
        //checking to see if I can make a commit adding a random comment

    }
}

