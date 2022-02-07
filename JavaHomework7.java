/**
 * Java 1. Homework 7
 * @author Oleg
 * @version 07.02.21
 */
class JavaHomework7 { 
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat ("Barsik", 5);
            new Cat ("Hammer", 3)
            new Cat ("Boom", 4)
        }
        Plate plate = new Plate (10);
        for (Cat cat : cats) {
            System.out.println (cat);
            System.out.println (plate);
            cat.eat(plate);
            System.out.println (plate);
        }
        System.out.println ("Cats were created: ") + Animal.getCountOfCats());
    }
}

class Cat { 
    private String name;
    private int appetite;
    private boolean isFull;
    protected static int countOfCats=0;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
        countOfCats++;
    }

    @Override
    public void eat (Plate plate) {
        if (appetite > plate || appetite > food || isFull = true) {
            return "sorry the cat is already full or there is not enough food on the plate  ";
        } else {
            return plate.decreaseFood (appetite) + isFull = true + "Cat: " + name + " is full";
        }
    }

    @Override
    public String toString () {
        return name + ", appetite: " + appetite;
    }
}

class Plate { 
    private int food;

    Plate (int food) {
        if (food > plate) {
            return "Too much food for the plate, please enter another value: " + int food;
        } else {
            return this.food = food;
        }

    }

    public void decreaseFood (int food) {
        this.food -= food;
    }

    public void addFood (Cat cat) {
        if (appetite < plate && appetite < food ) {
            return "There is not enough food for the cat, add food to the plate: " + int food ;
        } else {
            return "all cats is full";
        }
    }

    @Override
    public String toString () {
        return "Plate: " + food;
    }
}