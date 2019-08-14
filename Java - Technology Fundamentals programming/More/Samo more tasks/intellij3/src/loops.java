import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i <= 9 ; i++){
            for(int j = 0 ; j <= 9 ; j++){
                for(int k = 0 ; k <= 9 ; k++){
                    for(int l = 0 ; l <= 9 ; l++){
                        for(int p = 0 ; p <= 9 ; p++){
                            for(int v = 0 ; v <= 9 ; v++){
                                if(i*j*k*l*p*v == n){
                                    System.out.printf("%d%d%d%d%d%d ", i,j,k,l,p,v);
                                }
                            }
                        }
                    }
                }
            }
        }
       */

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
