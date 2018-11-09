import java.applet.*;
import java.awt.*;

public class SceneryApplet extends Applet {
	public void paint(Graphics g) {
		// Rainbow
		g.setColor(Color.red);
		g.fillOval(360, 30, 200, 200);
		g.setColor(Color.orange);
		g.fillOval(365, 35, 190, 190);
		g.setColor(Color.yellow);
		g.fillOval(370, 40, 180, 180);
		g.setColor(Color.green);
		g.fillOval(375, 45, 170, 170);
		g.setColor(Color.cyan);
		g.fillOval(380, 50, 160, 160);
		g.setColor(Color.blue);
		g.fillOval(385, 55, 150, 150);
		g.setColor(Color.magenta);
		g.fillOval(390, 60, 140, 140);
		g.setColor(Color.black);
		g.fillOval(85, 85, 130, 130);
		// Mountains
		Color c = new Color(142, 58, 5);
		g.setColor(c);
		int x1[] = { 0, 150, 400 };
		int y1[] = { 100, 20, 100 };
		g.fillPolygon(x1, y1, 3);
		int x2[] = { 320, 430, 520, 400 };
		int y2[] = { 80, 50, 70, 100 };
		g.fillPolygon(x2, y2, 4);
		int x3[] = { 400, 700, 1000 };
		int y3[] = { 100, 20, 100 };
		g.fillPolygon(x3, y3, 3);
		// Setting size of applet Viewer
		this.setSize(1000, 500);
		// Grass
		g.setColor(Color.green);
		g.fillRect(0, 100, 1000, 500);
		// Sun
		g.setColor(Color.yellow);
		g.fillOval(300, 15, 50, 50);
		g.setColor(Color.black);
		g.drawOval(300, 15, 50, 50);
		// Leaves
		Color c1 = new Color(30, 160, 1);
		g.setColor(c1);
		g.fillOval(75, 75, 100, 100);
		// Trunk of tree
		g.setColor(new Color(60, 60, 0));
		g.fillRect(115, 175, 20, 100);
		// Cloud 1
		Color cloud = new Color(216, 237, 242);
		g.setColor(cloud);
		g.fillOval(-30, 10, 70, 20);
		g.fillOval(-10, 20, 70, 20);
		// Cloud 2
		g.fillOval(450, 10, 70, 20);
		g.fillOval(430, 20, 70, 20);
		g.fillOval(470, 20, 70, 20);
		// Cloud 3
		g.fillOval(850, 10, 70, 20);
		g.fillOval(830, 20, 70, 20);
		g.fillOval(870, 20, 70, 20);
		// House
		g.setColor(Color.PINK);
		g.fillRect(450, 300, 100, 100);
		// Door
		g.setColor(new Color(60, 60, 0));
		g.fillRect(483, 330, 35, 70);
		// Second Floor
		g.setColor(Color.yellow);
		g.fillRect(460, 230, 80, 70);
		// Window
		g.setColor(Color.black);
		g.fillRect(470, 240, 20, 20);
		g.fillRect(510, 240, 20, 20);
		// Roof
		g.setColor(Color.magenta);
		int rx1[] = { 420, 585, 495 };
		int ry1[] = { 230, 230, 190 };
		g.fillPolygon(rx1, ry1, 3);
	}
}