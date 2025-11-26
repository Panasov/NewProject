package testgroup;

public class Car {
    String brand, model;
    int cost, year;

    public Car(String brand, String model, int cost, int year) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.year = year;
    }

    public static void main(String[] args) {
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        probel();
        audi.info();
        probel();
        bmw.info();
        probel();
    }

    public void info() {
        System.out.println("Марка: " + brand + '\n' + "Модель: " + model + '\n' + "Год выпуска: " + year + '\n' + "Цена: " + cost);
    }

    public static void probel() {
        System.out.println("============");
    }
}

class Audi extends Car {
    public Audi() {
        super("Audi", "А6", 100_000, 2025);
    }
}

class Bmw extends Car {
    public Bmw() {
        super("BMW", "5 series", 150_000, 2025);
    }
}