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
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ResturantsPage extends JFrame{
    
    public ResturantsPage(ArrayList<Resturant>x){
        int name_x_bound = 50;
        int name_y_bound = 0;
        
        setSize(500,500);
        setTitle("Resturants"); 
        Container cp = getContentPane();
        cp.setLayout(null);
        
        SelectResturant obj = new SelectResturant();
        
        for(Resturant resturant : x){
            //name
            JButton name = new JButton(resturant.myContacts.get_name());
            name.setBounds(name_x_bound, name_y_bound, 100, 20);
            name.addActionListener(obj);
            cp.add(name);
            //rating
            JLabel rating = new JLabel(String.valueOf(resturant.rating)+"*");
            rating.setBounds(name_x_bound, name_y_bound+15, 100, 30);
            cp.add(rating);
            //phone number
            JLabel phoneNumber = new JLabel(String.valueOf(resturant.myContacts.get_phoneNumber()));
            phoneNumber.setBounds(name_x_bound+50, name_y_bound+15, 100, 30);
            cp.add(phoneNumber);
            
            name_y_bound+=50;
        } 
       
    }
     public class SelectResturant implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
             
            ArrayList<Resturant> r = Admin_methods.getResturants();
            
            for(Resturant resturant : r)
                if(resturant.myContacts.get_name().equals(ae.getActionCommand())){
                    MenuePage menue = new MenuePage(resturant);
                    setVisible(false);
                    menue.setVisible(true);
                    menue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    break;
                }
            
        }
            
        }
}
