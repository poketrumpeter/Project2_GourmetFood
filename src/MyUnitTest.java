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
    public void pretestDayNumber3(GourmetFoodShop testStore) {
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
    public void pretestDayNumber4(GourmetFoodShop testStore) {
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
    public void pretestDayNumber5(GourmetFoodShop testStore) {
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
    public void pretestDayNumber6(GourmetFoodShop testStore) {
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
    public void pretestDayNumber7(GourmetFoodShop testStore) {
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
    public void pretestDayNumber8(GourmetFoodShop testStore) {
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
    public void pretestDayNumber9(GourmetFoodShop testStore) {
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
    public void pretestDayNumber10(GourmetFoodShop testStore) {
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
