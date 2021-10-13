package diu_practica_4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class canvast extends JPanel{
    private int [] x = new int[5];
    private int [] y = new int[5];
    private int indice = -1;
    private Color bgC = Color.WHITE;
    private Color fgC = Color.BLACK;
    private int i = 0;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(bgC);
        this.setForeground(fgC);
        if(indice != -1){
            for (int i = 0; i < 5; i++) {
                g.fillOval(x[i], y[i], 10, 10);
            }
            if(indice == 4) indice = -1;
        }
    }
    
    public void setCoordinates(int x, int y){
        if(this.i == 12){
            indice++;
            this.x[indice] = x;
            this.y[indice] = y;
            this.repaint();
            this.i = 0;
        }
        this.i++;
    }
    
    public void setBackgroundColor(Color color){
        this.bgC = color;
        this.repaint();
    }
    public void setForegroundColor(Color color){
        this.fgC = color;
        this.repaint();
    }

}
