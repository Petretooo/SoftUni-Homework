public class Polymorphism {
}

/*
     class Note {
        private int value;

        private Note(int val) {
            value = val;
        }

        public static final Note MIDDLE_C = new Note(0),
                C_SHARP = new Note(1),
                B_FLAT = new Note(2);
    }

    class Instrument {
        public void play(Note n) {
            System.out.println("Instrument.play()");
        }
    }

     class Wind extends Instrument {
        public void play(Note n) {
            System.out.println("Wind.play()");
        }
    }

     class Music {
        static void tune(Instrument i) {
            i.play(Note.MIDDLE_C);
        }

        public static void main(String[] args) {
            Wind flute = new Wind();
            tune(flute);
        }
    }




*/






/*



class Note {
    private int value;
    private Note(int val) {
        value = val;
    }
    public static final Note MIDDLE_C = new Note(0),
            C_SHARP = new Note(1),
            B_FLAT = new Note(2);
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}
class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play()");
    }
}
class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play()");
    }
}
class Brass extends Instrument {
    public void play(Note n) {
        System.out.println("Brass.play()");
    }
}
 class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn); }
}

*/


class Shape {
    void draw() {
    }

    void erase() {
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }

    void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }

    void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }

    void erase() {
        System.out.println("Triangle.erase()");
    }
}

class Shapes {
    public static Shape randShape() {
        switch ((int) (Math.random() * 3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++)
            s[i] = randShape();
        for (int i = 0; i < s.length; i++) s[i].draw();
    }
}


class Instrument {
    public void play() {
        System.out.println("Instrument.play()");
    }

    public String what() {
        return "Instrument";
    }

    public void adjust() {
    }
}

class Wind extends Instrument {
    public void play() {
        System.out.println("Wind.play()");
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
    }
}

class Percussion extends Instrument {
    public void play() {
        System.out.println("Percussion.play()");
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {
    }
}

class Stringed extends Instrument {
    public void play() {
        System.out.println("Stringed.play()");
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
    }
}

class Brass extends Wind {
    public void play() {
        System.out.println("Brass.play()");
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    public void play() {
        System.out.println("Woodwind.play()");
    }

    public String what() {
        return "Woodwind";
    }
}

class Music3 {
    static void tune(Instrument i) {
        i.play();
    }

    public static void tuneAll(Instrument[] e) {
        for (int i = 0; i < e.length; i++) tune(e[i]);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[5];
        int i = 0;
        orchestra[i++] = new Wind();
        orchestra[i++] = new Percussion();
        orchestra[i++] = new Stringed();
        orchestra[i++] = new Brass();
        orchestra[i++] = new Woodwind();
        tuneAll(orchestra);
    }
}


class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Sandwitch extends PortableLunch {
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();

    Sandwitch() {
        System.out.println("Sandwitch()");
    }

    public static void main(String[] args) {
        new Sandwitch();
    }
}


interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
        System.out.println("Fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    public void swim() {
        System.out.println("Swim");
    }

    public void fly() {
        System.out.println("Fly");
    }
}

class Adventure {
    static void t(CanFight x) {
        x.fight();
    }

    static void u(CanSwim x) {
        x.swim();
    }

    static void v(CanFly x) {
        x.fly();
    }

    static void w(CanFight x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}


class Calculator {
    public static Integer addInteger(Integer a, Integer b) {
        return a + b;
    }

    public static Float addFloat(Float a, Float b) {
        return a + b;
    }

    public static <N extends Number> double add(N a, N b) {
        double sum = 0;
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
}


class GenericNumberContainer<T extends Number> {
    private T obj;

    public GenericNumberContainer() {

    }

    public GenericNumberContainer(T t) {
        obj = t;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T t) {
        obj = t;
    }
}

class mainT {

    public static void main(String[] args) {
        GenericNumberContainer<Integer> gn = new GenericNumberContainer<Integer>();
        gn.setObj(3);
        //GenericNumberContainer<String> gn2 = new GenericNumberContainer<String>();
    }
}
