class Product {
    int id;
    String name;

    void displayProduct() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}
class A extends Product {
    int count;
    String category;

    void displayA() {
        System.out.println("Count : " + count);
        System.out.println("Category : " + category);
    }
}

class SubA extends A {
    double price;

    void totalPrice() {
        double total = count * price;
        displayProduct();
        displayA();
        System.out.println("Price : " + price);
        System.out.println("Total Price : " + total);
    }
}

class B extends Product {
    int count;
    String category;

    void displayB() {
        System.out.println("Count : " + count);
        System.out.println("Category : " + category);
    }
}

class SubB extends B {
    double price;

    void totalPrice() {
        double total = count * price;
        displayProduct();
        displayB();
        System.out.println("Price : " + price);
        System.out.println("Total Price : " + total);
    }
}
class C extends Product {
    int count;
    String category;

    void displayC() {
        displayProduct();
        System.out.println("Count : " + count);
        System.out.println("Category : " + category);
    }
}
public class Test1 {
    public static void main(String[] args) {

        SubA obj1 = new SubA();
        obj1.id = 78;
        obj1.name = "amul";
        obj1.count = 50;
        obj1.category = "Butter";
        obj1.price = 30;
        obj1.totalPrice();

        SubB obj2 = new SubB();
        obj2.id = 90;
        obj2.name = "amul";
        obj2.count = 90;
        obj2.category = "Milk";
        obj2.price = 10;
        obj2.totalPrice();

        C obj3 = new C();
        obj3.id = 56;
        obj3.name = "amul";
        obj3.count = 20;
        obj3.category = "choco";
        obj3.displayC();
    }
}