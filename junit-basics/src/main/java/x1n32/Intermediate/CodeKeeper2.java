package x1n32.Intermediate;
//pg 234. Array Lists
//Creation:  ArrayList golfer = new ArrayList(30);
//Add:       golfer.add("Park");
//retrieve:  String s1 = (String) golfer.get(0);
//Insert:    golfer.add(0, "Park moved to 1st position")
//Delete:    golfer.remove(3);
//change:    golfer.set(0, "Value us changed to this")
//Clear      golfer.clear();
//in list?   boolean isThere = golfer.contains("Kirk");
//get index: int i = golfer.indexOf("Ko");
//elements:  int size = golfer.size();
//capacity:  golfer.trimToSize();
//Loop:      Iterator it = golfer.iterator();
/* Looping:
for (Iterator i = golfer.iterator(); i.hasNext();){
    String name = (String) i.next();
    System.out.println(name);
*/

//Improved using Generics
//pg 246
//Generic declaration for array list made
//Type inference figures out proper generics declaration
//Simpler for loop to display

import java.util.*;

public class CodeKeeper2 {
    ArrayList<String> list; //Array list to hold the codes

    String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta"};
    
    
    public CodeKeeper2(String[] userCodes){
        list = new ArrayList();
   
        //Load built-in codes
        for (int i = 0; i < codes.length; i++){
            addCode(codes[i]); //added using list's contains(Object) method
        }
        //Load user codes - from command line - Customise
        for (int j = 0; j <userCodes.length; j++){
            addCode(userCodes[j]);
        }
        //Display all codes - iterator replaced
        for (String code:list){
            System.out.println(code);
        }
    }
    private void addCode(String code){
        if (!list.contains(code)){
            list.add(code);
        }
    }
    
    public static void main(String[] arguments){
        CodeKeeper2 keeper = new CodeKeeper2(arguments);
    }
    
}
