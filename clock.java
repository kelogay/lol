import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;
/*<applet code="clock" width=600 height=300>
</applet> */
public class clock extends Applet implements Runnable
{
           Thread t;
           Date cd;
           SimpleDateFormat sf;
           int h=0,m=0,s=0;
           public void init()
           {
               sf=new SimpleDateFormat("EEE MMM dd hh:mm:ss:yyyy",Locale.getDefault());
               cd=new Date();
               sf .applyPattern("s");
               s=Integer.parseInt(sf.format(cd));
               sf.applyPattern("m");
               m=Integer.parseInt(sf.format(cd));
               sf .applyPattern("h");
               h=Integer.parseInt(sf.format(cd));
               Font f=new Font("Arial",Font.BOLD,60);
               setFont(f);
          }
          public void start()
          {
              t=new Thread(this);
              t.start();
          }
          public void run()
          {
                Thread t1=Thread.currentThread();
                while(t==t1)
                {
                   try
                   {
                        Thread.currentThread().sleep(1000);
                   }
                   catch(InterruptedException e)
                   { }
                   repaint();
                }
 }
 public void paint(Graphics g)
{
 g.drawString("Digital Clock:",200,100);
 s=s+1;
 if(s>59) { s=0; m=m+1;}
 if(m>59) { m=0; h=h+1;}
 if(h>12) { h=1;}
 g.drawString(h+" : "+m+" : "+s,200,200);
 }
}