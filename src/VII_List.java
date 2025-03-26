import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Lists.*;
public class VII_List {
    public static void main(String... args) {
        arrayListMethods();
        arrayListSorting();
        arrayVSarrayList();

    }

    public static void arrayListMethods(){
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
        groceryItems.add(new GroceryItems("milk"));
        groceryItems.add(new GroceryItems("oranges", "PRODUCE", 10));
        groceryItems.add(0, new GroceryItems("cereal"));
        groceryItems.set(0, new GroceryItems("water"));
        groceryItems.remove(1);
        System.out.println(groceryItems);

        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        //list.add("yogurt");
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        ArrayList<String> nextList = new ArrayList<>(
            List.of("cherry", "ham", "juice"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }

    public static void arrayListSorting(){
        ArrayList<String> groceries = new ArrayList<>(
            List.of("cherry", "apple", "lemon", "meat", "strawberry", "ham", "juice", "yogurt"));
        System.out.println(groceries);
        System.out.println("Third item: "+ groceries.get(2));

        if(groceries.contains("apple")){
            System.out.println("List contains apple");
        }

        groceries.add("ham");
        System.out.println("first: " + groceries.indexOf("ham") );
        System.out.println("las index of: "+groceries.lastIndexOf("ham"));

        System.out.println(groceries);
        groceries.remove(groceries.indexOf("ham"));
        System.out.println(groceries);
        groceries.remove("ham");
        System.out.println(groceries);

        groceries.removeAll(List.of("cherry", "juice"));
        System.out.println(groceries);

        groceries.retainAll(List.of( "lemon", "meat"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty: " + groceries.isEmpty());

        groceries.addAll(List.of("apples","milk","mustard"));
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }

    public static void arrayVSarrayList(){
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: "+ originalList);
        System.out.println("array:"+Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array:" + Arrays.toString(originalArray));

        //originalList.add("fourth");
        //originalList.remove(0);

        

        }

     

}
