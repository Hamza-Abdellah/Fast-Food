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
import java.io.*;
import java.util.*;
        
public class Admin_methods {
    private Admin_methods(){}
    
    private static ArrayList<Resturant>resturantArray = new ArrayList<Resturant>();
    
    public static void addResturant(String name , float rating , int phoneNumber){
        try{loadResturants();}
        catch(Exception e){System.out.println(e+"from addResturant at Admin_methods during loading");}
        

           Resturant x = new Resturant();
           x.Create_Resturant(name, rating, phoneNumber);
           resturantArray.add(x);
        try{saveResturants(resturantArray);}
        catch(Exception e){System.out.println(e+"from addResturant in Admin_methods at saving");}
    }
    
    public static void saveResturants(ArrayList<Resturant>x)throws FileNotFoundException , IOException{
        File resturantsFile = new File("g://Asu_stuff//Advanced Programming//projects//Food_delivery_v4//Data//resturants.bin");
         ObjectOutputStream resturants = new ObjectOutputStream(new FileOutputStream(resturantsFile));
         resturants.writeObject(x);
         resturants.close();
        
    }
    
    public static void loadResturants()throws IOException , ClassNotFoundException{
        
        try{
         File resturantsFile = new File("g://Asu_stuff//Advanced Programming//projects//Food_delivery_v4//Data//resturants.bin");
         ObjectInputStream resturants = new ObjectInputStream(new FileInputStream(resturantsFile));
         ArrayList<Resturant> binResturantsArray = (ArrayList<Resturant>)resturants.readObject();
         resturants.close();
         
         for(Resturant resturant : binResturantsArray)
            resturantArray.add(resturant);
         
         }
         catch(FileNotFoundException e){System.out.print(e+"from loadResturants at adminMethods");}
    }
    
    public static ArrayList<Resturant> getResturants(){
        try{loadResturants();}
        catch(Exception e){System.out.println(e+"from getResturants at loading");}
        
        return resturantArray;
    }
}
