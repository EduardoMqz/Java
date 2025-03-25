import java.util.ArrayList;
import java.util.Arrays;

import Lists.*;
public class VII_List {
    public static void main(String... args) {
        List1();

    }

    public static void List1(){
        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("milk");
        groceryArray[1] = new GroceryItems("apples","PRODUCE",6);
        groceryArray[2] = new GroceryItems("oranges","PRODUCE",5);
        System.out.println(Arrays.deepToString(groceryArray));

        ArrayList objecList = new ArrayList();
        objecList.add(new GroceryItems("Butter"));
        objecList.add("Yogurt");

        ArrayList<GroceryItems> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItems("Butter"));
        


    }

}
