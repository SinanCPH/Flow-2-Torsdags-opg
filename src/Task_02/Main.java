package Task_02;

public class Main {
    public static void main(String[] args) {
        Cafe kaffe = new Cafe();
        kaffe.loadMenuData();

        for (String caffeeItem : kaffe.coffeeMenu) {
            System.out.println(caffeeItem);
        }
    }
}
