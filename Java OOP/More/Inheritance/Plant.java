package Inheritance;

/*
class Plant {
    Plant() {
    System.out.println("Plant constructor");
}
}

class Tree extends Plant {
    Tree() {
        System.out.println("Tree constructor");
    }
}
class Elm extends Tree {
    Elm() {
        System.out.println("Elm constructor");
    }
    public static void main(String[ ] args) {
        Elm e = new Elm();
    }
}




*/




/*





class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
    Game(){
        System.out.println("Hey");
    }

}
class BordGame extends Game {
    BordGame(int i) {
        System.out.println("BordGameconstructor");
}
}
class Chess extends BordGame {
    Chess(int i) {
        super(i);
        System.out.println("Chess constructor");
    }
public static void main(String[ ] args) {
        Chess x = new Chess(5);
    }
}


*/


class Box {
    double width, height, depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String arg[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}

class RefDemo {
    public static void main(String arg[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();
        weightbox = (BoxWeight) plainbox;
        vol = plainbox.volume();
        System.out.println("Volume of plainbox is " + vol);
        System.out.println("Weight of plainbox is " + plainbox);
    }
}


class Plate {
    Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Knife constructor");
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Custom constructor");
    }
}

class PlaceSetting extends Custom {
    Spoon sp;
    Fork frk;
    Knife kn;
    DinnerPlate pl;

    PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}


class Instrument {
    public void play() {
    }

    static void tune(Instrument i) {
        i.play();
    }
}

class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}


class WithFinals {
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // Можем да извършим преобразувание нагоре
        OverridingPrivate op = op2;
        // но не можем да извикаме следните методи:
        // ! op.f();
        // ! op.g();
        // same here
        WithFinals wf = op2;
        //! wf.f();
        // ! wf.g();
    }
}


