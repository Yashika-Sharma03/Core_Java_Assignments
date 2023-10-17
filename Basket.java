import java.util.ArrayList;

public class Basket {
    public static void main(String args[]){
        // adding fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add(0, "Banana");

        // adding veggies
        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("Potato");
        veggies.add("Cabbage");
        veggies.add("Carrot");

        // merging fruits and veggies in healthyFood
        ArrayList<String> healthyFood = new ArrayList<>();
        healthyFood.addAll(fruits);
        healthyFood.addAll(veggies);

        // printing ArrayLists
        System.out.println("fruits " + fruits);
        System.out.println("veggies " + veggies);
        System.out.println("healthyFood " + healthyFood);

        // reversing healthyFood and removing zeroth index element
        System.out.println("removed element is " + healthyFood.reversed().remove(0));
        System.out.println("healthyFood now " + healthyFood);
    }
}
