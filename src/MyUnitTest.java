package org.junit;
import org.junit.Test;
import static org.junit.Assert.*;
import Logistics.GourmetFoodShop;
import Food.Roll;



public class MyUnitTest {

    @Test
    public void pretestDayNumber(GourmetFoodShop testStore) {        
	int result = testStore.dayNumber;

	int expectedResult = 1;
	
	try {
    	    Assert.assertEquals(result, expectedResult);
	} catch (AssertionError e) {
	    System.out.println("The Day Number pretest has failed!");
	    throw e;
}
System.out.println("The Day Number pretest has succeeded.");	
    }
    @Test
    public void testStoreOpen(GourmetFoodShop testStore) {
        try {
            Assert.assertTrue(testStore.openForBusiness);
        } catch (AssertionError e) {
            System.out.println("The Store Open test has failed!");
            throw e;
}
System.out.println("The Store Open test has succeeded.");
    }
    @Test
    public void posttestDayNumber(GourmetFoodShop testStore) {
        int result = testStore.dayNumber;

        int expectedResult = 31;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Day Number posttest has failed!");
            throw e;
}
System.out.println("The Day Number posttest has succeeded.");
    }
    @Test
    public void testStoreClose(GourmetFoodShop testStore) {
        try {
            Assert.assertFalse(testStore.openForBusiness);
        } catch (AssertionError e) {    
            System.out.println("The Store Closed test has failed!");
            throw e;
}
System.out.println("The Store Closed test has succeeded.");
    }
    @Test
    public void testBusCustomer(GourmetFoodShop testStore) {
        int result = testStore.dayNumber;

        int expectedResult = 1;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Day Number pretest has failed!");
            throw e;
}
System.out.println("The Day Number pretest has succeeded.");
    }
    @Test
    public void testCatCustomer(GourmetFoodShop testStore) {
        int result = testStore.dayNumber;

        int expectedResult = 1;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Day Number pretest has failed!");
            throw e;
}
System.out.println("The Day Number pretest has succeeded.");
    }
    @Test
    public void testOrder() {
	Order testOrder = new Order(17);
        float result = testOrder.orderNumber;

        float expectedResult = 17;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Order Number test has failed!");
            throw e;
}
System.out.println("The Order  Number test has succeeded.");
    }
    @Test
    public void testSpringRoll(GourmetFoodShop testStore) {
        int result = testStore.dayNumber;

        int expectedResult = 1;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Day Number pretest has failed!");
            throw e;
}
System.out.println("The Day Number pretest has succeeded.");
    }
    @Test
    public void testSausageToppings(GourmetFoodShop testStore) {
        int result = testStore.dayNumber;

        int expectedResult = 1;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Day Number pretest has failed!");
            throw e;
}
System.out.println("The Day Number pretest has succeeded.");
    }
    @Test
    public void testInventory(GourmetFoodShop testStore) {
        int result = testStore.dayNumber;

        int expectedResult = 1;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Day Number pretest has failed!");
            throw e;
}
System.out.println("The Day Number pretest has succeeded.");
    }
}
