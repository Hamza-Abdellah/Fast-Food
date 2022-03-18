/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_v4;

/**
 *
 * @author zyady
 */
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class CheckOutPage extends JFrame {
    float total;
    JButton paymentBtn;
    public CheckOutPage(ArrayList<Item> a)
    {
        
       setSize(250,500);
       setTitle("Check Out");
       this.setLayout(new FlowLayout());
       
       float sum=0;
        for(Item i :a)
        {
            JLabel lb1=new JLabel(i.get_name());
            JLabel lb2=new JLabel(String.valueOf(i.get_price()));
            JLabel lb3=new JLabel();
            
            this.add(lb1);
            this.add(lb2);
            this.add(lb3);
            
            sum+=i.get_price();
        }
        total = sum;
        JLabel lb4=new JLabel("Total Amount = "+String.valueOf(sum)+"EGP");
        this.add(lb4);
       
        paymentBtn = new JButton("PAY");
        btnListener obj = new btnListener();
        paymentBtn.addActionListener(obj);
        this.add(paymentBtn);
        
    }
    private class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            payment form = new payment(total);
            setVisible(false);
            form.setVisible(true);
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
    }
}

