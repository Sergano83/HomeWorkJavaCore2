package DZ3;

import java.util.ArrayList;

import java.util.Collection;


public class Box <T extends Fruit> {
    private final ArrayList<T> list;


    public Box() {
        this.list = new ArrayList<>();
    }




    public float getWeight() {
        float weight = 0.0f;

        for (T o : list) {
            weight += o.getWeight();
        }

        return weight;
    }

    public void pour(Box<T> another) {
        another.list.addAll(list);
        list.clear();
    }
    public void add(T fruit) {
        list.add(fruit);
    }


    public void add (Collection<T> fruit) {
        list.addAll(fruit);
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return this.list.size() * list.get(0).getWeight() == anotherBox.list.size() * anotherBox.list.get(0).getWeight();
    }


}
