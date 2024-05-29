package pedroferreiracodes;

import javax.swing.*;

public class Splash extends JFrame {
    private JPanel background;
    private JProgressBar progressBar1;
    private JLabel title;
    private JPanel LoadingPage;

    public Splash() {
        setContentPane(LoadingPage);
        setSize(850, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}