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
import java.io.Serializable;

public class person implements Serializable  {
    public String username;
    
    public String password;
    
    public String address;

    public int phonenumber;
    
    public String gender;
    
     public person (String a, String b,String c, int d)
    {
     username=a;
     password=b;
     address=c;
     phonenumber=d;
     
    }

    public person(){}
}