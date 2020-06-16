package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Canvas extends JPanel {
    public int helper = 8;
    Color BROWN = new Color(102,51,0);
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2.setColor(new Color(0,180,0));
        g2.fillRect(0, (int)(this.getHeight()/1.5), this.getWidth(), this.getHeight());
        yikes(g2);
    }
    private void yikes(Graphics2D g2) {
        switch(helper){
            default:
            case 8:
                g2.setColor(Color.BLACK);
                
            case 7:
                g2.setColor(Color.BLACK);
                g2.drawLine((int)(this.getWidth()/1.7-1), this.getHeight()/5+45, 4, 50);

            case 6:
                g2.setColor(Color.BLACK);
                g2.fillRect((int)(this.getWidth()/1.7-1), this.getHeight()/5+45, 4, 50);

            case 5:
                g2.setColor(Color.BLACK);
                g2.setStroke(new BasicStroke(4));
                g2.drawOval((int)(this.getWidth()/1.7+5), this.getHeight()/5+20, 35, 35);
                g2.fillOval((int)(this.getWidth()/1.7+30), this.getHeight()/5+40, 4, 4);
                g2.drawRect((int)(this.getWidth()/1.7+15), this.getHeight()/5+45, 1, 5);
                g2.setStroke(new BasicStroke(1));
            case 4:
                g2.setColor(Color.BLACK);
                g2.fillRect((int)(this.getWidth()/1.7), this.getHeight()/5, 5, 50);

            case 3:
                g2.setColor(BROWN);
                g2.fillRect(this.getWidth()/2-10, this.getHeight()/5, this.getWidth()/8, 20);
            case 2:
                g2.setColor(BROWN);
                g2.fillRect(this.getWidth()/2-10, this.getHeight()/5, 20, this.getHeight()/2);
            case 1:
                g2.setColor(Color.GREEN);
                g2.fillOval(0, (int) (this.getHeight()/1.8), this.getWidth(), this.getWidth());
            case 0:
                break;
        }
    }
}
