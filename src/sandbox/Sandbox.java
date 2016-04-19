package sandbox;

import java.util.ArrayList;

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }
    
}



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
