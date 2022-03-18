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
import java.util.ArrayList;
import javax.swing.*;

public class signup extends JFrame {

    person c2=new person();
    
    
    JLabel lb1=new JLabel("Username");
    JTextField txt1=new JTextField(10);
    JLabel lb2=new JLabel("Password");
    JTextField txt2=new JTextField(10);
    JLabel lb3=new JLabel("Address");
    JTextField txt3=new JTextField(10);
    JLabel lb4=new JLabel("PhoneNumber");
    JTextField txt4=new JTextField(10);
    
    JRadioButton m=new JRadioButton("Male",true);
    JRadioButton f=new JRadioButton("Female",false);
    ButtonGroup gender=new ButtonGroup();
    
    JRadioButton c=new JRadioButton("Customer",true);
    JRadioButton a=new JRadioButton("Admin",false);
    ButtonGroup user=new ButtonGroup();
    
    JButton btn1=new JButton("SignUp");
    JButton btn2=new JButton("Login");
  
    public signup(){
        setSize(500,500);
        setTitle("Sign Up Window");
        this.setLayout(new FlowLayout());
        
        this.add(lb1);
        this.add(txt1);
        this.add(lb2);
        this.add(txt2);
        this.add(lb3);
        this.add(txt3);
        this.add(lb4);
        this.add(txt4);
        
        this.add(c);
        this.add(a);
        user.add(c);
        user.add(a);
        
        
        this.add(m);
        this.add(f);
        gender.add(m);
        gender.add(f);
        
        this.add(btn1);
        this.add(btn2);
        
        
       
        
        
        
        
        btn1.addActionListener(new execute1());
        btn2.addActionListener(new execute2());
    }
    private class execute1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            c2.username=txt1.getText();
            c2.password=txt2.getText();
            c2.address=txt3.getText();
            c2.phonenumber=Integer.parseInt(txt4.getText());
            if(gender.equals(m)==true)
                c2.gender="Male";
            else
                c2.gender="Female";
            
            JOptionPane.showMessageDialog(null,"Signed Up successfully");
            
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
        
    }
    
    private class execute2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)  {
            login l =new login();
            setVisible(false);
            l.setVisible(true);
        }
     
    }
}

