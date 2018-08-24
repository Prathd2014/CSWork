 /* Dylan Prah
 * Problem 3
 */
public class P3 {
    public static void main(String[] args) {
    int f = 0, s = 1, t, n ;
    System.out.print(s + " ");
    for(n = 2; n<13; n++) {
    t = f + s;
    System.out.print(t + " ");
    f = s ;
    s = t ;
    }
    }
    }