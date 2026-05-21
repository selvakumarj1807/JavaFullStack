interface Animal {

    void eat();
}

interface Dog {

    void bark();
}

class Puppy implements Animal, Dog {

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class MultipleInheritance09 {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}