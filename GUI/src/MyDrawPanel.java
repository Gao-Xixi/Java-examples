import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MyDrawPanel extends JPanel{
//    /**
//     * 1 paint component
//     * @param g
//     */
//    @Override
//    public void paintComponent(Graphics g){
//        g.setColor(Color.PINK);
//        g.fillRect(20,50,100,100);
//    }

//    /**
//     * 2 Dispaly a JPEG   // the selfie.jpg is too large to show
//     * @param g
//     */
//    @Override
//    public void paintComponent(Graphics g){
//        java.net.URL imgUrl = getClass().getResource("selfie.jpg");
//        Image image = new ImageIcon(imgUrl).getImage();
//        g.drawImage(image,3,4,this);

//    }

    /**
     * 3 Paint a randomly-colored circle one a background
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);

        Color randomColor = new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }

//    /**
//     * 4 Graphics2D (polymorphism) need cast
//     * 渐变色
//     * @param g
//     */
//    @Override
//    public void paintComponent(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        GradientPaint gradient = new GradientPaint(70,70,Color.BLUE,150,150, Color.ORANGE);
//        g2d.setPaint(gradient);
//        g.fillOval(70, 70, 100, 100);
//    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(500,500);;
        frame.setVisible(true);
    }
}
