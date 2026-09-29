class Pizza {
    String size;
    int toppings;

    Pizza() {
        size = "Medium";
        toppings = 1;
    }

    Pizza(String size) {
        this.size = size;
        toppings = 2;
    }

    Pizza(String size, int toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    void show() {
        System.out.println(size + " pizza with " + toppings + " toppings");
    }
}

public class OverloadedConstructors {
    public static void main(String[] args) {
        new Pizza().show();
        new Pizza("Large").show();
        new Pizza("Small", 4).show();
    }
}
