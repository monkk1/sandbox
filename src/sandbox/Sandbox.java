package sandbox;

import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        
        ArrayList<Animal> list = new ArrayList<>();
        
        list.add(new Dog("bob"));
        list.add(new Dog("fred"));
        list.add(new Dog("pete"));
        
        showList(list);

    }
    
    public static void showList(ArrayList<Animal> list) {
        
        list.stream().forEach((value) -> {
            System.out.println("Name of animal is " + value.getName());
        });
        
    }
    
}
