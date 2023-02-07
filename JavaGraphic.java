

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
//نورث من واجهة جي فريم
public class JavaGraphic extends JFrame{
    public JavaGraphic(){
    //انشاء عنوان
    setTitle("Java Applicatioj");
    //عشان لو ضغطت اكس يقفل
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //الحجم
    setSize(500,500);
    //الظهور
    setVisible(true);
    }
    //عشان ارسم اسوي اعادة كتابة اوفر رايد للداله باينت الموجوده في جي فريم
    public void paint(Graphics g){//AWT (Abstract Window Toolkit)الباراميتر من نوع قرفيكز وهو موجود بال
    //تنظيف للشاشة 
    //السوبر اللي هو الاب جي فريم بقوله ياخذ داله البينت اللي جوته وينظفها
    super.paint(g);
    //تغيير لون الرسمات اللي بعدها
    g.setColor(Color.BLUE);//cyan
    g.setFont(new Font("Tahome",Font.BOLD,18));//باراميتر من نوع فونت وله ثلاث باراميتر نوع الخط وشكله و حجمه
    //نرسم نص
    g.drawString("Welcome Fatima", 20, 100);
    g.setColor(new Color(200,10,150));
    //رسم خط
    g.drawLine(20, 130, 210, 130);//احداثيات اكس وواي للبدايه واحداثيات اكس وواي للنهايه
    //رسم مستطيلات
    g.drawRect(15, 150, 150, 140);
    g.drawRect(20, 160, 50, 50);
    g.drawRect(100, 160, 50, 50);
    g.drawRect(35, 230, 100, 50);
    //ترسم لنا نقط كثيره عشوائيا بالشاشه
    for (int i = 1; i <= 9000; i++) {
            int x=(int)(Math.random()*(500));
            int y=(int)(Math.random()*(500));
            g.setColor(RandomColor());
            g.drawLine(x, y, x, y);
        }
    //لرسم نقاط مرتبه بالشاشه
       for (int i = 1; i <= 500; i+=3) {
            for (int j = 0; j < 500; j+=3) {
            g.setColor(RandomColor());
            g.drawLine(i, j, i, j);            
        }
        }
    }
    //داله تختار لنا لون عشوائي بانها تختار ارقام للاحمر والاخضر والازرق
    public Color RandomColor(){
        Random r = new Random();
        int red=r.nextInt(255);
        int green=r.nextInt(255);
        int blue=r.nextInt(255);
        return new Color(red,green,blue);
    }
    public static void main(String[] args) {
        new JavaGraphic();
    }
}
