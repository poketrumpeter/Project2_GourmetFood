package org.junit;
import org.junit.Test;
import static org.junit.Assert.*;
import Logistics.*;
import Food.*;



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
    public void testSpringRoll() {
	springRoll testSpring = new springRoll();

	double result = testSpring.cost();

        double expectedResult = 1.99;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {    
            System.out.println("The Spring Roll test has failed!");
            throw e;
}
System.out.println("The Spring Roll test has succeeded.");
    }
    @Test
    public void testPastryRoll() {
        pastryRoll testPastry = new pastryRoll();

        double result = testPastry.cost();

        double expectedResult = 3.29;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {
            System.out.println("The Pastry Roll test has failed!");
            throw e;
}
System.out.println("The Pastry Roll test has succeeded.");
    }
    @Test
    public void testSausageRoll() {
        sausageRoll testSausage = new sausageRoll();

        double result = testSausage.cost();

        double expectedResult = 3.99;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {
            System.out.println("The Sausage Roll test has failed!");
            throw e;
}
System.out.println("The Sauage Roll test has succeeded.");
    }
    @Test
    public void testJellyRoll() {
        jellyRoll testJelly = new jellyRoll();

        double result = testJelly.cost();

        double expectedResult = 2.69;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {
            System.out.println("The Jelly Roll test has failed!");
            throw e;
}
System.out.println("The Jelly Roll test has succeeded.");
    }

    @Test
    public void testEggRoll() {
        eggRoll testEgg = new eggRoll();

        double result = testEgg.cost();

        double expectedResult = 2.99;

        try {
            Assert.assertEquals(result, expectedResult);
        } catch (AssertionError e) {
            System.out.println("The Egg Roll test has failed!");
            throw e;
}
System.out.println("The Egg Roll test has succeeded.");
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
}
