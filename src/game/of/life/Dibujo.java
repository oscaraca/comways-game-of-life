package game.of.life;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Dibujo extends JPanel {
    private int rows, cols;

    public Dibujo(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.setIgnoreRepaint(true); 
            //this.setSize(1904, 3007);
        this.setSize(800, 800);
            this.setAutoscrolls(true); 
    }

    

    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GRAY); 
        super.paint(g);
        
        dibujarRuta(g);
    }
    
    public void dibujarRuta(Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.GRAY); 
            int width, height;
            width = this.getWidth();
            height = this.getHeight();
            System.out.println("pintando lineas verticales");
            for (int i=0; i<rows; i++) {
                g2.drawLine(i*width/cols, 0, i*width/cols, height);
                g2.drawLine(0, i*width/rows, width, i*width/rows);
            }
            g2.fillRect((8*width/cols)+1, (8*width/rows)+1, (width/cols)-1, (height/rows)-1);
            
            g2.setColor(Color.WHITE);
            g2.fillRect((9*width/cols)+1, (9*width/rows)+1, (width/cols)-1, (height/rows)-1);
        
    }
    

}
