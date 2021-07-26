import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons  {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        label = new JLabel("I am a label");
        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());
        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ColorListener());
        MyDrawPanel drawPanel1 = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);

        frame.getContentPane().add(BorderLayout.WEST,label);
        frame.getContentPane().add(BorderLayout.EAST,labelButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel1);
        frame.setSize(500,300);
        frame.setVisible(true);
    }

    private class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");

        }
    }

    private class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }


}
