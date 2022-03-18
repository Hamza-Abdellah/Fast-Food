package food_delivery_v4;

import java.io.Serializable;

public class Contacts implements Serializable{

    private String name = "test";

    private int phoneNumber=111;

    private String Address;

    public void setName(String Name) {
        this.name = Name;
    }

    public void set_phoneNumber(int n) {
        this.phoneNumber = n;
    }
    public String get_name(){
    return this.name;
    }
    public int get_phoneNumber(){
    return this.phoneNumber;
    }
}
