import java.applet.*;
import java.awt.*;

/*<applet code="new3" width=800 height=800></applet>*/

public class new3 extends Applet
{
	
	public void paint(Graphics g)
	{
		
		g.setColor(Color.black);
		g.fillPolygon(new int[] {480,320,640},
						new int[] {25,365,365},3);
						
						
		g.setColor(Color.pink);
		g.fillOval(390,198,184,184);
		
		
		g.setColor(Color.pink);
		g.fillPolygon(new int[] {230,230,470,470},
					new int[] {70,300,300,70},4);
	
		g.setColor(Color.red);
		Font f = new Font("Times New Roman", Font.BOLD, 20);
			g.setFont(f);
		g.drawString("HEHE",80,60);
	
	
	}
}