import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoginPage {
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JPanel Main;
    private JLabel eLibraryLabel;
    static JFrame frame;

    public LoginPage() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame jf1 = new JFrame("Admin panel");
                jf1.setContentPane(new AdminPanel().Main);
                jf1.setSize(800, 400);
                jf1.setVisible(true);
//              if password or username is wrong
//              JOptionPane.showMessageDialog(null, " Wrong password ");
                ClosePrevFrame();
            }
        });
    }

    private void ClosePrevFrame() {
//     frame.setVisible(false);
     frame.dispose();
    }

    public static void main(String[] args) throws IOException {
        frame = new JFrame("Library Management");
        frame.setContentPane(new LoginPage().Main);

//        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("book.jpg"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 500);
        frame.setVisible(true);

    }

}
