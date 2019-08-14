import java.util.Scanner;

public class ifelse12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int budget = Integer.parseInt(in.nextLine());
        String season = in.nextLine();
        int numbers = Integer.parseInt(in.nextLine());

        double spring = 3000;
        double summer = 4200;
        double autumn = 4200;
        double winter = 2600;

        double procent = 0;
        double differences = 0;
        if (season.equalsIgnoreCase("spring")) {
            if (numbers <= 6) {
                procent = spring - (spring * 0.1);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 7 && numbers <= 11) {
                procent = spring - (spring * 0.15);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 12) {
                procent = spring - (spring * 0.25);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            }
        } else if (season.equalsIgnoreCase("summer")) {
            if (numbers <= 6) {
                procent = summer - (summer * 0.1);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 7 && numbers <= 11) {
                procent = summer - (summer * 0.15);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 12) {
                procent = summer - (summer * 0.25);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            }
        } else if (season.equalsIgnoreCase("autumn")) {
            if (numbers <= 6) {
                procent = summer - (summer * 0.1);
                if (true) {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 7 && numbers <= 11) {
                procent = summer - (summer * 0.15);
                if (true) {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 12) {
                procent = summer - (summer * 0.25);
                if (true) {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            }
        } else if (season.equalsIgnoreCase("winter")) {
            if (numbers <= 6) {
                procent = winter - (winter * 0.1);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 7 && numbers <= 11) {
                procent = winter - (winter * 0.15);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            } else if (numbers >= 12) {
                procent = winter - (winter * 0.25);
                if (numbers % 2 == 0) {
                    procent = procent - (procent * 0.05);
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                } else {
                    differences = Math.abs(procent - budget);
                    if (budget > procent) {
                        System.out.printf("Yes! You have %.2f leva left.", differences);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", differences);
                    }
                }
            }
        }
    }
}
