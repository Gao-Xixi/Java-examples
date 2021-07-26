import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiC implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGuiC gui  = new SimpleGuiC();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Change colors");
        button.addActionListener(this);
        MyDrawPanel drawPanel1 = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel1);

        frame.setSize(300,300);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
