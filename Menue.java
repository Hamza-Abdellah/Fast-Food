/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_v4;

import java.util.*;
import java.io.*;


/**
 *
 * @author zyady
 */
public class Menue implements Serializable{
     private ArrayList<Item> itemsArray = new ArrayList<Item>();
     
     public void addItems(String resturantName){
         try{ loadItems(resturantName);}
         catch(Exception e){System.out.println(e);}
         
         Scanner input = new Scanner(System.in);
         System.out.println("Enter 1 to add item. any other number to quit");
         int adminOpt = input.nextInt();
         input.nextLine();//dummy input
         
         while(adminOpt==1){
          System.out.println("Enter item's name");
         String name = input.nextLine();
         System.out.println("Enter item's price");
         float price= input.nextFloat();
         input.nextLine();//dummy input
         System.out.println("Enter item's type");
         String type = input.nextLine();
         
         Item x = new Item();
         x.set_properties(name, price, type);
         itemsArray.add(x);
         
         System.out.println("To continue enter 1. To quite enter any other number");
         adminOpt = input.nextInt();
         input.nextLine();//dummy input
         }
         
         try{saveItems(itemsArray , resturantName);}
         catch(Exception e){System.out.println(e);}
     }
     
         public ArrayList<Item> getItems(String type , String resturantName){
             try{ loadItems(resturantName);}
             catch(Exception e){System.out.println(e);}
         
         ArrayList<Item>filteredItems = new ArrayList<Item>();
         
         for(Item item : itemsArray)
            if(item.get_type().equals(type))
                filteredItems.add(item);
            
         //return filteredItems;
         return itemsArray;
     }
         
//             public ArrayList<Item> getItemsz(String resturantName){
//             try{ loadItems(resturantName);}
//             catch(Exception e){System.out.println(e);}
//         
//            
//         return itemsArray;
//     }
     
     public void loadItems(String resturantName)throws IOException , ClassNotFoundException{
         try{
         File itemsFile = new File("g://Asu_stuff//Advanced Programming//projects//Food_delivery_v4//Data//"+resturantName+"menue.bin");
         ObjectInputStream items = new ObjectInputStream(new FileInputStream(itemsFile));
         ArrayList<Item> binItemsArray = (ArrayList<Item>)items.readObject();
         items.close();
         
         for(Item item : binItemsArray)
            itemsArray.add(item);
         
         }
         catch(FileNotFoundException e){System.out.print(e+" from loadItems at Menue class");}
         
     }
     
     public void saveItems(ArrayList<Item>x , String resturantName)throws FileNotFoundException , IOException{
         File itemsFile = new File("g://Asu_stuff//Advanced Programming//projects//Food_delivery_v4//Data//"+resturantName+"menue.bin");
         ObjectOutputStream items = new ObjectOutputStream(new FileOutputStream(itemsFile));
         items.writeObject(x);
         items.close();
            
     }
     
 
}
