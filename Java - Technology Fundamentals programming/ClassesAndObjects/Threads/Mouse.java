package ClassesAndObjects.Threads;

import java.util.Random;


public class Mouse extends Thread {

    private String name;
    private int hp;
    private int pp;
    private double as;
    private double dmg;
    private int shield = 2;

    private Mouse target;

    public Mouse(String name, int hp, int pp, double as, double dmg) {
        super();
        this.name = name;
        this.hp = hp;
        this.pp = pp;
        this.as = as;
        this.dmg = dmg;
    }

    public void setTarget(Mouse target) {
        this.target = target;
    }

    Random random = new Random();

    @Override
    public void run() {
        while (hp > 0 && target.hp > 0) {
            try {
                sleep((long) (1000 / as));

                int chance = random.nextInt(101);

                if (chance <= pp) {
                    chance = random.nextInt(101);

                    if (chance <= 20) {
                        dmg += 2;
                        System.out.println(name +
                                " got dmg boost!");
                    } else if (chance <= 50) {
                        hp -= shield;

                        System.out.println(name +
                                " got hit by SATAN for"
                                + shield + " dmg and has "
                                + hp + " left");
                    } else {
                        shield += 2;
                        hp -= target.dmg - shield;
                        System.out.println(name +
                                " blocked part of the damage" +
                                " and has " + hp + " hp left");
                        continue;
                    }
                }

                hp -= target.dmg;
                System.out.println(name + " got hit for " +
                        target.dmg + " and has " +
                        hp + " hp left");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        if (hp > 0) {
            System.out.println(name +
                    ": YES! The cheese is MINE!");
        } else {
            System.out.println(name +
                    ": CHEATERRRRR!!!!");
        }
    }
}
