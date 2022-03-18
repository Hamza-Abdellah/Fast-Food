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

public class Resturant implements Serializable{
    
    public float rating = 0;

    private String tagsArray[];

    public Contacts myContacts = new Contacts();

    public Menue myMenue = new Menue();

    public void Create_Resturant(String name , float rating , int phoneNumber) {
        myContacts.setName(name);
        myContacts.set_phoneNumber(phoneNumber);
        this.rating = rating;
    }
   

    public void removeResturant() {
    }

   
    public float get_rating(){
    return this.rating;
    }
}
