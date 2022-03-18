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

public class Item implements Serializable{
    private String name;

    private String type;
    public String ResturantName;

    private float price;

    public void set_properties(String name , float price , String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

//    public void setPrice(float price) {
//        this.price = price;
//    }
//    public void set_type(String type) {
//        this.type = type;
//    }
    public String get_name(){
    return name;
    }
    public float get_price(){
    return price;
    }
     public String get_type(){
    return type;
    }
}
