package Frontera;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author GAR
 */
public class Fondo extends JPanel {
    
    private Image img;
    private String path;
    
    public Fondo(JPanel panel, String path){
        this.path = path;
        panel.setOpaque(false);
    }

    public void paint(Graphics g){

        img = new ImageIcon(getClass().getResource(path)).getImage();

        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

        this.setOpaque(false);

        super.paint(g);
    }
    
}
