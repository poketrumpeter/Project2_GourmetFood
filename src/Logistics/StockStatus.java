package Logistics;

import Food.Roll;

import java.util.ArrayList;

public class StockStatus {

    private Boolean stockAvailible;
    private int index;

    public StockStatus(Boolean stockAvailible, int index ){
        this.stockAvailible = stockAvailible;
        this.index = index;
    }

    public Boolean getStockAvailible() {
        return stockAvailible;
    }

    public int getIndex() {
        return index;
    }

    public void setStockAvailible(Boolean stockAvailible) {
        this.stockAvailible = stockAvailible;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
