//From the book Java 21 Days, pg 241 - Hash maps. Great for manipulating large amounts of data.
package x1n32.Beginner;
import java.util.*;


public class ComicBooks {

    //Application class ComicBooks and helper class Comic.
    public ComicBooks(){}

    public static void main(String[] arguments){
        //Set up hash map, a Data Structure that stores key/value pairs. 
        //Which is really an ID that has a value. Our ID here is a String value, that contains a float.
        //Can have it without the <> values, but it saves time retriving objects from it as you don't have to type cast them
        HashMap<String,Float> quality = new HashMap<>();

        
        
        float price1 = 3.00F;   //Add to map with key mint.
        quality.put("mint", price1); 
        
        float price2 = 2.00F;
        quality.put("near mint", price2);
        
        float price3 = 1.50f;
        quality.put("very fine", price3);
        
        float price4 = 1.00F;
        quality.put("fine", price4);
        
        float price5 = 0.50F;
        quality.put("good", price5);
        
        float price6 = 0.25f;
        quality.put("poor", price6);
        
        //Set up collection with an array of comics to hold books for sale
        Comic[] comix = new Comic[3];
        
        //Store detail and get new price based on condition
        //.get(Strig) is called with the conition, one of the keys. Returns as an object, so we cast it to ffloat
        comix[0] = new Comic("Amazing Spider Man", "1A", "very fine",
        12_000.00F);
        //NO NEED FOR (Float) NOW, DUE TO CASTING IT IN THE GENERICS. comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[0].setPrice(quality.get(comix[0].condition));
        
        comix[1] = new Comic("Incredible Hulk", "181", "near mint",
        680.00F);
        comix[1].setPrice(quality.get(comix[1].condition));
        
        comix[2] = new Comic("Cerebus", "1A", "good",
        190.00F);
        comix[2].setPrice(quality.get(comix[2].condition));
        
        for (Comic comix1 : comix) {
            System.out.println("Title: " + comix1.title);
            System.out.println("Issue: " + comix1.issueNumber);
            System.out.println("Condition: " + comix1.condition);
            System.out.println("Price: $" + comix1.price + "\n");
        }      
    }
}
class Comic { //5 instance vars
    String title, issueNumber, condition;
    float basePrice, price;
    //Constructor method to set the values
    Comic(String inTitle, String inIssueNumber, String inCondition,
            float inBasePrice){
        
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }
    //Sets the price - set as float. 
    void setPrice(float factor){
        price = basePrice * factor;
    }
}


//Enumerations of conditions 
enum Condition {
    PRISTINE_MINT,
    MINT,
    NEAR_MINT,
    VERY_FINE,
    FINE,
    GOOD,
    POOR,
    COVERLESS 
}