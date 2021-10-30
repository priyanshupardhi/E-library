import javax.swing.*;

public class AdminPanel {
    public JPanel Main;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;
    private JProgressBar progressBar4;
    private JTable table1;
    private JTable table2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("AdminPanel");
        frame.setContentPane(new AdminPanel().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
