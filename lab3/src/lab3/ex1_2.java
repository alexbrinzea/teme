package lab3;

import static lab3.Parabola.mijloc;
import static lab3.Parabola.segment;

public class ex1_2 {
    public static void main(String[] args) {
        Parabola p = new Parabola(3,5,2);
        Parabola a = new Parabola(10,5,1);
        Parabola c = new Parabola(3,2,9);
        System.out.println(p.toString());
        System.out.println(p.mijloc(a));
        System.out.println(mijloc(c,a));
        System.out.println(p.segment(c));
        System.out.println(segment(p,a));
    }
}
