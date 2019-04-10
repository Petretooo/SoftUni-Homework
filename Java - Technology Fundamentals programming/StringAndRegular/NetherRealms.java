package StringAndRegular;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(",\\s*");

        Pattern patternAlphabet = Pattern.compile("[^\\d\\-+*\\/.]");
        Pattern patternDigits = Pattern.compile("[-+]?\\d*\\.?\\d+");

        List<Demon> demons = new ArrayList<>();

        for (String text : input) {
            text = text.trim();
            Matcher matcherAlphabet = patternAlphabet.matcher(text);
            Matcher matcherDigits = patternDigits.matcher(text);

            int healthSum = 0;
            double damage = 0.0;

            while (matcherAlphabet.find()) {
                healthSum += matcherAlphabet.group().charAt(0);
            }


            while (matcherDigits.find()) {
                damage += Double.parseDouble(matcherDigits.group());
            }


            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '*') {
                    damage *= 2;
                } else if (text.charAt(i) == '/') {
                    if (damage != 0) {
                        damage /= 2;
                    }
                }
            }


            Demon demon = new Demon(text, healthSum, damage);

            demons.add(demon);

        }


        demons.stream().sorted(Comparator.comparing(Demon::getName))
                .forEach(System.out::println);

    }
}


class Demon {

    private String name;
    private Integer health;
    private Double damaga;


    public Demon(String name, Integer health, Double damaga) {
        this.name = name;
        this.health = health;
        this.damaga = damaga;
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

    public Double getDamaga() {
        return damaga;
    }

    public void setDamaga(Double damaga) {
        this.damaga = damaga;
    }


    @Override
    public String toString() {
        return String.format("%s - %d health, %.2f damage", this.name, this.health, this.damaga);
    }
}