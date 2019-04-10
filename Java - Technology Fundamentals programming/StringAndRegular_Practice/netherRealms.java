package StringAndRegular_Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class netherRealms {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] demonS= in.nextLine().split(",\\s*");

        List<demons> d = new ArrayList<>();
        Pattern patternAlphabet = Pattern.compile("([^\\d+\\+\\-*\\/\\.])");
        Pattern patternDigits = Pattern.compile("[-+]?\\d*\\.*?\\d+");

        for (String a : demonS) {
            a = a.trim();

            Matcher matcherAlphabet = patternAlphabet.matcher(a);
            Matcher matcherDigits = patternDigits.matcher(a);

            int health = 0;
            double damage = 0.0;

            while(matcherAlphabet.find()){
                health+=matcherAlphabet.group().charAt(0);
            }

            while(matcherDigits.find()){
                damage += Double.parseDouble(matcherDigits.group());
            }


            for (int i = 0; i < a.length(); i++) {

                if(a.charAt(i) == '*'){
                    damage *=2;
                }else if(a.charAt(i) == '/'){
                    if(damage != 0) {
                        damage /= 2;
                    }
                }
            }


            demons demons1 = new demons(a, health, damage);

            d.add(demons1);



        }


        d.stream().sorted(Comparator.comparing(demons::getName))
                .forEach(System.out::println);


    }
}


class demons {

    private String name;
    private Integer health;
    private Double damage;

    public demons(String name, Integer health, Double damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
       return String.format("%s - %d health, %.2f damage",this.name,this.health,this.damage);
    }
}
