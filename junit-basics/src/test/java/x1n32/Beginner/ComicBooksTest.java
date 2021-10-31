package x1n32.Beginner;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ComicBooksTest {
    	


	@BeforeEach
	void initEach() {
		System.out.println("Now running tests");

        
	}

	@Nested
	class AddTest {

        void hashMapTest(){
            HashMap<String,Float> qualityHashMap = new HashMap<>();
            float priceExample = 1.00F;   //Add to map with key mint.
            qualityHashMap.put("fine", priceExample); 
            
            float priceExample2 = 2.00F;   //Add to map with key mint.
            qualityHashMap.put("mint", priceExample2); 

            assertEquals(2, qualityHashMap.size(), "2 Items have been put into the hashmap. It should return true if the expected size is 2.");
     
        }

        @Test
		void fineQualityTest() {
            float expectedPrice = 1000.00f;
            Comic fineComic =  new Comic("A Fine Comic", "1A", "fine", 1000.00F);

            System.out.println("Fine Quality Test Info: base price of 1000.00 * 1.00 should result in the same price.");


            assertEquals(expectedPrice, fineComic.basePrice,
            "Testing base price. Should remain unchanged.");

            fineComic.setPrice(1.00F);
            assertEquals(expectedPrice, fineComic.price,
            "setPrice affects the base price by that much. Fine quality is *1, so 1000 * 1 = 1000");
            
            System.out.println("Fine Quality Test Report: Base Price: " + fineComic.basePrice +
             " , New Price: " + fineComic.price);


        }
		
    }
}





	
