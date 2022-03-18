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
import java.util.ArrayList;

public class MenuePage extends JFrame{
   
    ArrayList<Item>cart = new ArrayList<Item>();
    Resturant resturant = new Resturant();
    ArrayList<Item>menueItems = new ArrayList<Item>();
    
    public MenuePage(Resturant resturant){
        setSize(500,500);
        setTitle(resturant.myContacts.get_name()+" Menue");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        String name = resturant.myContacts.get_name();
        menueItems = resturant.myMenue.getItems("meal",name);
        
        JCheckBox selectArr[] = new JCheckBox[menueItems.size()];
        checkListener obj = new checkListener();
        
        for(int i=0;i<selectArr.length;i++){
            String itemname = menueItems.get(i).get_name();
            float itemPrice = menueItems.get(i).get_price();
            selectArr[i] = new JCheckBox(itemname+" "+itemPrice+"EGP");
            selectArr[i].addActionListener(obj);
            cp.add(selectArr[i]);
        }
        
        JButton checkOutBtn = new JButton("CheckOut");
        checkOut object = new checkOut();
        checkOutBtn.addActionListener(object);    
        cp.add(checkOutBtn);
        
}
    private class checkListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            JCheckBox cb = (JCheckBox) ae.getSource();
            if(cb.isSelected()){
                for(Item item : menueItems)
                    if(cb.getText().contains(item.get_name())){
                        cart.add(item);
                        break;
                    }
            }
            else{
                for(Item item : cart)
                    if(cb.getText().contains(item.get_name())){
                        cart.remove(item);
                        break;
                    }
              
            }
        }
        
    }
    private class checkOut implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            CheckOutPage form = new CheckOutPage(cart);
            setVisible(false);
            form.setVisible(true);
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
    }
}
