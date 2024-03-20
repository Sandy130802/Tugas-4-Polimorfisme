class LivingBeing {
    public void eat() {
        System.out.println("Makhluk hidup sedang makan...");
    }
}

class Human extends LivingBeing {
    @Override
    public void eat() {
        System.out.println("Manusia sedang makan dengan menggunakan tangan...");
    }
}

class Animal extends LivingBeing {
    @Override
    public void eat() {
        System.out.println("Hewan sedang makan dengan menggunakan mulut...");
    }
}

public class Main {
    public static void main(String[] args) {
        LivingBeing human = new Human();
        LivingBeing animal = new Animal();

        human.eat(); // Akan memanggil method eat() dari Human
        animal.eat(); // Akan memanggil method eat() dari Animal
    }
}
