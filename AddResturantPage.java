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
import javax.swing.*;
import java.awt.event.*;

public class AddResturantPage extends JFrame {
    JLabel name;            JTextField nameTxf ;
    JLabel rating;          JTextField ratingTxf;
    JLabel phoneNumber;     JTextField phoneNumberTxf;
    String resturantName;   float resturantRating;  int hotline;
    JButton add;
    public AddResturantPage(){
        setSize(500,500);
        setTitle("Add Resturant");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        name = new JLabel("Name");
        rating = new JLabel("Rating");
        phoneNumber = new JLabel("Hotline");
        nameTxf = new JTextField(10);
        ratingTxf = new JTextField(10);
        phoneNumberTxf = new JTextField(10);
        add = new JButton("Add");
        
        
        textFieldListener obj = new textFieldListener();
        nameTxf.addActionListener(obj);
        ratingTxf.addActionListener(obj);
        phoneNumberTxf.addActionListener(obj);
        add.addActionListener(obj);
        
        cp.add(name);
        cp.add(nameTxf);
        cp.add(rating);
        cp.add(ratingTxf);
        cp.add(phoneNumber);
        cp.add(phoneNumberTxf);
        cp.add(add);
        
    }
    private class textFieldListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
               Object t = ae.getSource();
               if(t.equals(nameTxf)){
                    resturantName = nameTxf.getText();
                    System.out.println(resturantName);
               }    
               if(t.equals(ratingTxf))
                    resturantRating = Float.parseFloat(ratingTxf.getText());
                  
               
                if(t.equals(phoneNumberTxf))
                   hotline = Integer.parseInt(phoneNumberTxf.getText());
                
                if(t.equals(add)){
                    Admin_methods.addResturant(resturantName, resturantRating, hotline);
                    
                }
                    
        }
        
    }
}
