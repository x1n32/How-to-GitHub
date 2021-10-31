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

//Warning may appear for "unchecked or unsafe operations" hinting there is a better way to work with array lists
import java.util.*;

public class CodeKeeper {
    ArrayList list; //Array list to hold the codes
    //Built in codes read from an array to list
    String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta"};
    public CodeKeeper(String[] userCodes){
        list = new ArrayList();
        //Load built-in codes
        for (int i = 0; i < codes.length; i++){
            addCode(codes[i]); //added using list's contains(Object) method
        }
        //Load user codes - from command line - Customise
        for (int j = 0; j <userCodes.length; j++){
            addCode(userCodes[j]);
        }
        //Display all codes
        //Iterator Interface to add new text code if it is not already present
        //Iterator is a simpler for loop. Form: for(var:structure)
        for (Iterator ite = list.iterator(); ite.hasNext();){
            String output = (String) ite.next();
            System.out.println(output);
        }
    }
    private void addCode(String code){
        if (!list.contains(code)){
            list.add(code);
        }
    }
    
    public static void main(String[] arguments){
        CodeKeeper keeper = new CodeKeeper(arguments);
    }
    
}
