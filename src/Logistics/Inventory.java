package Logistics;

import Food.Roll;

import java.util.ArrayList;
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

    public void checkEmpty(){
        for (Map.Entry<String, InventoryItem> item: inventory.entrySet()){

            //check if any qty is 0
            if(item.getValue().getQty() == 0){
                restockItem(item.getKey());
            }
        }
    }

    public StockStatus decrementInventory(String rollKey, int qtyOrdered) {

        InventoryItem item = inventory.get(rollKey);

        StockStatus status = new StockStatus(true, 0);

        if (item != null) {
            int qty = item.getQty();

            if (qtyOrdered <= qty) { //We have enough and wont edn with 0
                if (qtyOrdered == qty) { //We will end with 0 stock
                    //Will need to order more stock
                    //check to see if all stock is out

                }
                item.setQty(qty - qtyOrdered);

                status.setIndex(status.getIndex() + 1);

                return status;
            }
            else {//We dont have stock
                status.setStockAvailible(false);

                return status;
            }
        }
        return status;
    }

    public void restockItem(String rollKey){

        this.inventory.get(rollKey).setQty(30);

    }


}
