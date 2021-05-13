import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FAQ extends JPanel {
    private JButton BackButton;
    private FAQ frame;
    private int fontSize;

    public FAQ() {
        setLayout(new BorderLayout());
        JLabel title = new JLabel("COVID-19 Vaccine FAQ", SwingConstants.CENTER);
        title.setFont(new Font("Sans Serif", Font.BOLD, 30));
        add(title, BorderLayout.NORTH);
        setOpaque(false);
        fontSize = 12;

        JPanel faqpage = new JPanel();
        faqpage.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel freqQues1 = new JLabel("Can I choose which vaccine I get?", SwingConstants.CENTER);
        freqQues1.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues2 = new JLabel("What are the most common side effects for the vaccine?", SwingConstants.CENTER);
        freqQues2.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues3 = new JLabel("If I am pregnant, can I get a COVID-19 vaccine?", SwingConstants.CENTER);
        freqQues3.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues4 = new JLabel("How long does protection from a COVID-19 vaccine last", SwingConstants.CENTER);
        freqQues4.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues5 = new JLabel("Do I need to wear a mask I have been fully vaccinated?", SwingConstants.CENTER);
        freqQues5.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues6 = new JLabel("If I have already had COVID-19, do I need to get a vaccine?", SwingConstants.CENTER);
        freqQues6.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues7 = new JLabel("What are the ingredients in COVID-19 vaccines?", SwingConstants.CENTER);
        freqQues7.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues8 = new JLabel("How much will the vaccine cost?", SwingConstants.CENTER);
        freqQues8.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues9 = new JLabel("How many does of COVID-19 vaccines will I need?", SwingConstants.CENTER);
        freqQues9.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        JLabel freqQues10 = new JLabel("Can I get a COVID-19 vaccine if I currently have COVID-19?", SwingConstants.CENTER);
        freqQues10.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));

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

        faqpage.setLayout(new BoxLayout(faqpage, BoxLayout.Y_AXIS));
        faqpage.add(freqQues1);
        faqpage.add(a1);
        faqpage.add(freqQues2);
        faqpage.add(a2);
        faqpage.add(freqQues3);
        faqpage.add(a3);
        faqpage.add(freqQues4);
        faqpage.add(a4);
        faqpage.add(freqQues5);
        faqpage.add(a5);
        faqpage.add(freqQues6);
        faqpage.add(a6);
        faqpage.add(freqQues7);
        faqpage.add(a7);
        faqpage.add(freqQues8);
        faqpage.add(a8);
        faqpage.add(freqQues9);
        faqpage.add(a9);
        faqpage.add(freqQues10);
        faqpage.add(a10);
        add(faqpage, BorderLayout.CENTER);
    }
}
