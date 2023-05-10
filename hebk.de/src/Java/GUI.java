package hebk.de.src.Java;
import javax.swing.*;
import java.awt.*;
public class GUI {
    private JFrame frame = new JFrame();
    public GUI(){
        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.BLACK);
        frame.setBounds(0, 0, 800,450);

        JPanel background = new JPanel();
        background.setBounds(0,0,800,450);
        background.setBackground(Color.BLACK);
        frame.add(background);
        background.setVisible(false);
        frame.setVisible(true);
        chat();
    }
    public void chat() {
        while (true) {


            JPanel chat = new JPanel();
            chat.setBounds(150, 0, 650, 450);
            chat.setSize(650,450);
            chat.setAlignmentX(frame.getAlignmentX());
            chat.setBackground(Color.BLUE);
            frame.add(chat);
            chat.setVisible(true);

            JTextField message = new JTextField();
            message.setBounds(500, 50, 200, 50);
            chat.add(message);
            message.setVisible(true);
        }
    }
}
