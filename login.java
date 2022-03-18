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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

public class login extends JFrame {
    person c1 =new person("Ahmed","ahmed123","nasr city",24721948);
    signup s=new signup();
    
    
    JLabel lb1 = new JLabel("Username");
    JTextField txt1=new JTextField(10);
    JLabel lb2 = new JLabel("Password");
    JTextField txt2=new JTextField(10);
    
    JRadioButton c=new JRadioButton("Customer",true);
    JRadioButton a=new JRadioButton("Admin",false);
    ButtonGroup user=new ButtonGroup();
    
    JButton btn1=new JButton("Login");
    JButton btn2=new JButton("SignUp");
    
    public login() 
    {
        
        
        setSize(300,300);
        setTitle("Log In Window");
        this.setLayout(new FlowLayout());
        this.add(lb1);
        this.add(txt1);
        this.add(lb2);
        this.add(txt2);
        
        this.add(c);
        this.add(a);
        user.add(c);
        user.add(a);
        
        this.add(btn1);
        this.add(btn2);
        
        btn1.addActionListener(new execute1());
        btn2.addActionListener(new execute2());
        
    }

    
    private class execute1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)  {
           
            if(c1.username.equals(txt1.getText())&& c1.password.equals(txt2.getText()))
            {
                JOptionPane.showMessageDialog(null,"Logged in successfully");
                setVisible(false);
                
                if(a.isSelected()){
                    AdminPage form = new AdminPage();
                    form.setVisible(true);
                    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                else {
                    ArrayList<Resturant> x =  Admin_methods.getResturants();
                    ResturantsPage form = new ResturantsPage(x);
                    form.setVisible(true);
                    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            else if(c1.username.equals(txt1.getText())==false)
            {
               JOptionPane.showMessageDialog(null,"Username incorrect","alert",JOptionPane.ERROR_MESSAGE); 
            }
            else if(c1.password.equals(txt2.getText())==false)
            {
                JOptionPane.showMessageDialog(null,"Password incorrect","alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Username & Password incorrect","alert",JOptionPane.ERROR_MESSAGE);
            }
      
        }
        
        
    }
    
    private class execute2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            setVisible(false);
           s.setVisible(true);
        }
        
    }
    private class radioListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
                System.out.println(ae.getActionCommand());
                
        }
        
    }
}

