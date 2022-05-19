package DZ3;

public class Main {
    public static void main(String[] args) {
        Box<Orange> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();

        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());

        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());

        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());

        System.out.println(box1.compare(box2));
        System.out.println("-----------------");
        System.out.println(box1.compare(box3));

        box1.pour(box2);

        System.out.println(box1.getWeight());
        System.out.println("-----------------");
        System.out.println(box3.getWeight());
    }
}
