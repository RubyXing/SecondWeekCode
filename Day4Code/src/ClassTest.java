import abcpackage.Cylinder;

import java.text.DecimalFormat;

public class ClassTest {
    public static void main(String[] args) {
        ConstantsImpl cons=new ConstantsImpl();
        System.out.println(cons.getNum());
        System.out.println(cons.add(2.5, 4.7));
        System.out.println(new DecimalFormat("0.00").format(cons.divide(7, 3)));
        System.out.println(cons.moltiply(7, 3));
        System.out.println(cons.substract(7, 3));

        Cylinder cyl=new Cylinder(3,4,"紫色");
        System.out.println(cyl.toString());
    }
}
