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

public class AdminPage extends JFrame{
    JButton addResturant;
    JButton editResturant;
    
    public AdminPage(){
        setSize(300,250);
        setTitle("Admin page");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        addResturant = new JButton("Add Resturant");
        editResturant = new JButton("Edit Resturant");
        btnListener obj = new btnListener();
        
        addResturant.addActionListener(obj);
        editResturant.addActionListener(obj);
        
        cp.add(addResturant);
        cp.add(editResturant);
    }
    public class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           Object t = ae.getSource();
           if(t.equals(addResturant)){
               AddResturantPage form = new AddResturantPage();
               form.setVisible(true);
               form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(t.equals(editResturant)){
                
           }
        }
        
    }
}
