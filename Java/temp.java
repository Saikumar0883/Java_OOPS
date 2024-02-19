import java.awt.*;
import java.awt.event.*;

import java.util.Scanner;

import org.w3c.dom.Text;

class temp {
    static int a = 0;

    public static void main(String[] args) {
        Frame f = new Frame("My frmae");
        f.setSize(900, 500);
        f.setLayout(new FlowLayout());
        
        // System.out.println(a);
        
        Label l = new Label("Random Number is ");
        TextField t = new TextField("");
        Button b = new Button("Generete Random Number");
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = (int) (Math.random() * 100);
                t.setText("**");
            }
        });
        
        Label l1=new Label("Your Number");
        TextField t1=new TextField("0");
        Label l2=new Label("Play");
        Scanner sc=new Scanner(System.in);
        f.add(l);
        f.add(t);
        f.add(b);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        while(true)
        {
            int num=sc.nextInt();
            if(num>a)
            {
                t1.setText(String.valueOf(num));
                l2.setText("Try lower");
            }
            else if(num<a)
            {
                t1.setText(String.valueOf(num));
                l2.setText("Try greater");
            }
            else
            {
                t1.setText(String.valueOf(num));
                t.setText(String.valueOf(a));
                l2.setText("Matched");
                break;
            }
        }
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

}