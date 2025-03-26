import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import Lists.*;

public class VII_List {
    public static void main(String... args) {
        arrayListMethods();
        arrayListSorting();
        arrayVSarrayList();
        arrayListChallenge();
        linkedList();

    }

    public static void arrayListMethods() {
        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("milk");
        groceryArray[1] = new GroceryItems("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItems("oranges", "PRODUCE", 5);
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

        String[] items = { "apples", "bananas", "milk", "eggs" };
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        // list.add("yogurt");
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        ArrayList<String> nextList = new ArrayList<>(
                List.of("cherry", "ham", "juice"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }

    public static void arrayListSorting() {
        ArrayList<String> groceries = new ArrayList<>(
                List.of("cherry", "apple", "lemon", "meat", "strawberry", "ham", "juice", "yogurt"));
        System.out.println(groceries);
        System.out.println("Third item: " + groceries.get(2));

        if (groceries.contains("apple")) {
            System.out.println("List contains apple");
        }

        groceries.add("ham");
        System.out.println("first: " + groceries.indexOf("ham"));
        System.out.println("las index of: " + groceries.lastIndexOf("ham"));

        System.out.println(groceries);
        groceries.remove(groceries.indexOf("ham"));
        System.out.println(groceries);
        groceries.remove("ham");
        System.out.println(groceries);

        groceries.removeAll(List.of("cherry", "juice"));
        System.out.println(groceries);

        groceries.retainAll(List.of("lemon", "meat"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty: " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }

    public static void arrayVSarrayList() {
        String[] originalArray = new String[] { "First", "Second", "Third" };
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array:" + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array:" + Arrays.toString(originalArray));

        // originalList.add("fourth");
        // originalList.remove(0);
    }

    public static void arrayListChallenge() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> groceriesList = new ArrayList<>();
        Boolean whileFlag = true;
        while (whileFlag) {
            System.out.printf(
                    "0 - to shutdown %n1 - to add item(s) to list (comma delimited list) %n2 - to remove any items (comma delimited)%n3 - show grocery list%nEnter a number for which action you want to do:%n");
            switch (scan.nextLine().toString()) {
                case "0" -> {
                    System.out.println("your final list is: " + groceriesList);
                    whileFlag = false;
                }
                case "1" -> {
                    System.out.printf("write items to add to list (comma delimited list)%n");
                    String[] items = scan.nextLine().split(",");
                    groceriesList.addAll(Arrays.asList(items));
                    System.out.println(groceriesList);
                }
                case "2" -> {
                    System.out.printf("write items to remove them from the list (comma delimited list)%n");
                    String[] items = scan.nextLine().split(",");
                    groceriesList.removeAll(Arrays.asList(items));
                    System.out.printf(groceriesList + "%n");
                }
                case "3" -> {
                    System.out.printf("your current list is: %s", groceriesList);
                }
                default -> {
                    System.out.println("invalid option");
                }
            }
        }
        scan.close();
    }

    public static void linkedList(){
        LinkedList<String> placesToVisit = new LinkedList<>();
        //var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Tokyo");
        placesToVisit.add(0,"Seoul");
        placesToVisit.add(0,"Beijin");
        placesToVisit.addLast("London");
        placesToVisit.addFirst("Osaka");
        System.out.println(placesToVisit);

        //Queue methods
        placesToVisit.offer("Kyoto");
        placesToVisit.offerFirst("Sapporo");
        placesToVisit.offerLast("Oaxaca");
        System.out.println(placesToVisit);

        //stack
        placesToVisit.push("Veracruz");
        System.out.println(placesToVisit);

        //remove
        placesToVisit.remove(3);
        placesToVisit.remove("Tokyo");
        System.out.println(placesToVisit);
        String ele = placesToVisit.remove();
        System.out.println(ele + " was removed");
        System.out.println(placesToVisit);
        ele = placesToVisit.removeFirst();
        System.out.println(ele + " was removed");
        System.out.println(placesToVisit);
        ele = placesToVisit.removeLast();
        System.out.println(ele + " was removed");
        System.out.println(placesToVisit);

        //queue/deque poll methods
        String poll = placesToVisit.poll();
        System.out.println(poll + " was removed");
        System.out.println(placesToVisit);
        poll = placesToVisit.pollFirst();
        System.out.println(poll + " was removed");
        System.out.println(placesToVisit);
        poll = placesToVisit.pollLast();
        System.out.println(poll + " was removed");
        System.out.println(placesToVisit);

        placesToVisit.push("Germany");
        placesToVisit.push("Sydney");
        placesToVisit.push("New York");
        System.out.println(placesToVisit);

        String pop = placesToVisit.pop();
        System.out.println(pop+" was removed");
        System.out.println(placesToVisit);


    }

}
