package StockFlow.JFrameApp;

import javax.swing.*;

public class Splash extends JFrame {
    private JPanel background;
    private JProgressBar progressBar1;
    private JLabel title;
    private JPanel loadingPage;

    public Splash() {
        setContentPane(loadingPage);
        setSize(850, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}