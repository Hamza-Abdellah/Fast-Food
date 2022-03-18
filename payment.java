/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_v4;



import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author TWINZY ^_O
 */
public class payment extends JFrame {
    JButton visa ;
    JButton cash ;
 JLabel lb;
 float total;
    public payment(float total)
    {
        this.total = total;
        setSize(500,500);
        setTitle("welcome to payment method");
             Container cp = this.getContentPane();
         cp.setLayout(new FlowLayout());
         lb = new JLabel("Payment method");
         visa= new JButton("Credit Card");
         cash= new JButton("Cash");
         cp.add(lb);
         cp.add(visa);
         cp.add(cash);
      
        
         mouse click = new mouse();
          mouse1 click1 = new mouse1();
       visa.addMouseListener(click);
       cash.addMouseListener(click1);
       
    }
    public class mouse extends MouseAdapter
    {

        private String num;
        @Override
        public void mouseClicked(MouseEvent me) {
        String name = JOptionPane.showInputDialog("Please input your Name ");
      while(true)
      {
        String num = JOptionPane.showInputDialog("Please input your Card Number");
        
           if ( num.length() != 14 )
      {
          JOptionPane.showMessageDialog(null, "Your Card number Not Valid", "visa number", JOptionPane.ERROR_MESSAGE);
          
   
      }
           else if (num.length() == 14)
                   {
                       String cvv = JOptionPane.showInputDialog("Please input cvv ");
        String ed = JOptionPane.showInputDialog("Please input Expiry_date");
                   }
           break;
           
      }
      
     
          
        

        } 
    }
     public class mouse1 extends MouseAdapter
    {

      
        @Override
        public void mouseClicked(MouseEvent me) {
    JOptionPane.showMessageDialog(null, "Your cash is "+ total, "CASH",JOptionPane.INFORMATION_MESSAGE);

        } 
    }
    
    
   
        
    }




    


