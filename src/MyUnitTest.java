import org.junit.Test;
import static org.junit.Assert.*;
import Logistics.GourmetFoodShop;
import Food.Roll;



public class MyUnitTest {

    @Test
    public void testStock() {
        GourmetFoodShop testStore = new GourmetFoodShop();

        ArrayList<Roll> result = testStore.getStock();

	//expectedResults = 

        //assertEquals(0, result);

    }
}
