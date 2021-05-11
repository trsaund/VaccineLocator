import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FAQ extends JPanel {
    private JButton BackButton;
    private FAQ frame;

    public FAQ() {
        setSize(10000, 10000);
        setLayout(new BorderLayout());
        JLabel title = new JLabel("COVID-19 Vaccine FAQ", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        title.setBackground(Color.lightGray);
        add(title, BorderLayout.NORTH);
        setOpaque(false);

        JPanel FAQPage = new JPanel();
        FAQPage.setBackground(Color.lightGray);
        JLabel q1 = new JLabel("Can I choose which vaccine I get?", SwingConstants.CENTER);
        q1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q2 = new JLabel("What are the most common side effects for the vaccine?", SwingConstants.CENTER);
        q2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q3 = new JLabel("If I am pregnant, can I get a COVID-19 vaccine?", SwingConstants.CENTER);
        q3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q4 = new JLabel("How long does protection from a COVID-19 vaccine last", SwingConstants.CENTER);
        q4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q5 = new JLabel("Do I need to wear a mask I have been fully vaccinated?", SwingConstants.CENTER);
        q5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q6 = new JLabel("If I have already had COVID-19, do I need to get a vaccine?", SwingConstants.CENTER);
        q6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q7 = new JLabel("What are the ingredients in COVID-19 vaccines?", SwingConstants.CENTER);
        q7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q8 = new JLabel("How is paying for the COVID-19 vaccines?", SwingConstants.CENTER);
        q8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q9 = new JLabel("How many does of COVID-19 vaccines will I need?", SwingConstants.CENTER);
        q9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JLabel q10 = new JLabel("Can I get a COVID-19 vaccine if I currently have COVID-19?", SwingConstants.CENTER);
        q10.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        JLabel a1 = new JLabel("<html><ul>" + "<li>" + "Yes" + "</li>" + "</ul></html>");
        JLabel a2 = new JLabel("<html><ul>" + "<li>" + "Pain, redness, swelling in the arm, tiredness, muscle pain, headaches, chills, and a fever" + "</li>" + "</ul></html>");
        JLabel a3 = new JLabel("<html><ul>" + "<li>" + "Yes" + "</li>" + "</ul></html>");
        JLabel a4 = new JLabel("<html><ul>" + "<li>" + "The CDC is not sure how long protection will last" + "</li>" + "</ul></html>");
        JLabel a5 = new JLabel("<html><ul>" + "<li>" + "Fully vaccinated people can gather indoors with no masks/social distancing with other fully vaccinated people" + "</li>" + "</ul></html>");
        JLabel a6 = new JLabel("<html><ul>" + "<li>" + "Yes" + "</li>" + "</ul></html>");
        JLabel a7 = new JLabel("<html><ul>" + "<li>" + "Ingredients vary by maker, please see their websites for details" + "</li>" + "</ul></html>");
        JLabel a8 = new JLabel("<html><ul>" + "<li>" + "The federal government is providing vaccines free of charge" + "</li>" + "</ul></html>");
        JLabel a9 = new JLabel("<html><ul>" + "<li>" + "Two Pfizer vaccine doses, two Moderna vaccine doses, One Johnson and Johnson vaccine dose" + "</li>" + "</ul></html>");
        JLabel a10 = new JLabel("<html><ul>" + "<li>" + "No" + "</li>" + "</ul></html>");

        FAQPage.setLayout(new BoxLayout(FAQPage, BoxLayout.Y_AXIS));
        FAQPage.add(q1);
        FAQPage.add(a1);
        FAQPage.add(q2);
        FAQPage.add(a2);
        FAQPage.add(q3);
        FAQPage.add(a3);
        FAQPage.add(q4);
        FAQPage.add(a4);
        FAQPage.add(q5);
        FAQPage.add(a5);
        FAQPage.add(q6);
        FAQPage.add(a6);
        FAQPage.add(q7);
        FAQPage.add(a7);
        FAQPage.add(q8);
        FAQPage.add(a8);
        FAQPage.add(q9);
        FAQPage.add(a9);
        FAQPage.add(q10);
        FAQPage.add(a10);
        add(FAQPage, BorderLayout.CENTER);
    }
}
