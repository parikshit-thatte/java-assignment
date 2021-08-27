interface Car {
    public void start();
    public void applyBreaks();
    public void honk();
}

class Maruti implements Car {
    public void start() {
        System.out.println("Car started");
    }
    public void applyBreaks() {
        System.out.println("Breaks applied");
    }
    public void honk() {
        System.out.println("Honk honk");
    }
}


abstract class Book {
    public void setNumberOfPages(int num) {
        System.out.println("Number of pages set to " + num);
    }

    public abstract void readBook();
}


class HarryPotter extends Book {
    public void readBook() {
        setNumberOfPages(565);
        System.out.println("Reading Harry Potter...");
    }
}


public class Question_1 {
    public static void main (String[] args) {
        Car maruti = new Maruti();
        maruti.start();
        maruti.applyBreaks();
        maruti.honk();

        System.out.println();

        Book newBook = new HarryPotter();
        newBook.readBook();
    }
}