//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
package hackerrank;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        int[] path = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(path));
//        System.out.println(path.length - 3);
    }

    static int jumpingOnClouds(int[] c) {
        int angka = 0;

        int i = 0;
        while (i < c.length) {
            System.out.println(i + ":" + c[i] + ":" + angka);
            if (i + 2 < c.length && c[i + 2] == 0) {
                System.out.println("a");
                i += 1;
                angka += 1;
            } else if(i + 1 < c.length && c[i + 1] == 0){
                System.out.println("b");
                angka += 1;
            }
            i += 1;
        }

        return angka;
    }
}


//0 1 0 0 0 1 0
