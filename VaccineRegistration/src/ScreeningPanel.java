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
        JLabel q1 = new JLabel("Have you ever received a dose of COVID-19 vaccine? ");
        JButton q1_yes = new JButton("yes");
        JButton q1_no = new JButton("no");
        questions.add(q1);
        questions.add(q1_yes);
        questions.add(q1_no);
        JLabel q2 = new JLabel("Have you ever had an allergic reaction to another vaccine or an injectable medication?");
        JButton q2_yes = new JButton("yes");
        JButton q2_no = new JButton("no");
        questions.add(q2);
        questions.add(q2_yes);
        questions.add(q2_no);
        add(questions, BorderLayout.CENTER);

    }
}

