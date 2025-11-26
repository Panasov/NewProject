package testgroup;

class Animal {
    String name;
    int age;

    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 3);
        Dog dog = new Dog("Рич",15);
/*      System.out.println("Кот по имени " + cat.name + " и его возраст " + cat.age + " г.");
        System.out.println("Собака по имени " + dog.name + " и ее возраст " + dog.age + " г.");*/
        cat.sayHi();
        dog.sayHi();
    }

    public void sayHi() {
        System.out.println("Имя: " + name + " Возраст: " + age );
    }

}

    class Cat extends Animal {

        public Cat() {
            super();
        }

        public Cat(String name, int age) {
            this.age = age;
            this.name = name;
        }
    }


    class Dog extends Animal {

        public Dog() {
            super();
        }

        public Dog(String name, int age) {
            this.age = age;
            this.name = name;
        }

}




