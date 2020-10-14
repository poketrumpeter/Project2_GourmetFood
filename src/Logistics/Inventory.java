package Logistics;

import Food.Roll;

import java.util.Map;

public class Inventory {

    private Map<String, InventoryItem> inventory;

    public Inventory(Map<String, InventoryItem> inventory) {
        this.inventory = inventory;
    }

    public void addInventory(Roll roll, int qty){
        InventoryItem item = new InventoryItem(roll, qty);
        inventory.put(roll.getKey(), item);

    }

    public void displayInventory(){
        for (Map.Entry<String, InventoryItem> item : inventory.entrySet()){

            item.getValue().displayItem();

        }
    }

    public int checkStock(String rollKey){

        return inventory.get(rollKey).getQty();
    }

    public boolean decrementInventory(String rollKey, int qtyOrdered) {

        InventoryItem item = inventory.get(rollKey);

        if (item != null) {
            int qty = item.getQty();

            if (qtyOrdered <= qty) { //We have enough and wont end with 0
                if (qtyOrdered == qty) { //We will end with 0 stock
                    //Will need to order more stock
                    System.out.println("Out of Stock");
                }
                item.setQty(qty - qtyOrdered);

                return true;
            } else {//We dont have stock
                return false;
            }
        }
        return false;
    }

    public void restockItem(String rollKey){

        this.inventory.get(rollKey).setQty(30);

    }


}
