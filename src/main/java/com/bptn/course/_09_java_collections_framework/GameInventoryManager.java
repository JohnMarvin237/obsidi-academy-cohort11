package com.bptn.course._09_java_collections_framework;

import java.util.LinkedList;

public class GameInventoryManager {
    public static int insertPoint(LinkedList <String> inventory){
    	int index = 0;
      for(String item: inventory){
        if(item.contains("Common")) {
          index = inventory.indexOf(item); 
          break;
        }
//        System.out.println(item);		// Debugging line
      }
      return index;
    }

    public static void main(String[] args) {
        // 1. Create and populate the inventory
        LinkedList <String> inventory = new LinkedList<> ();
        inventory.addLast("Sword");
        inventory.addLast("Potion (Common)");
        inventory.addLast("Shield");
        inventory.addLast("Coin Bag (Common)");
        inventory.addLast("Axe");
        
        // 2. Search for Insertion Point
        int index = insertPoint(inventory);
        System.out.println("First Common Item Index: " + index);      
 
        // 3. Insert Rare Item after the common item
        inventory.add(index + 1, "Dragon Scale Armor (Rare)");
        
        // 4. Discard Item (Note: Index 3 after insertion is "Shield")
        String removeItem = inventory.remove(3);
        System.out.println("Item discarded from inventory: " + removeItem);
        
        // 5. Final Inventory
        System.out.println("Final Inventory Size: " + inventory.size());
        System.out.println(inventory);
        
    }
}

