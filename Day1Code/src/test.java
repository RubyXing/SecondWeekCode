public class test {
    public static void main(String[] args) {
//        Cars car1=new Cars();
//        Cars car2=new Cars();
//        car1.accelerate(30);
//        car1.decelerate(40);
//        car2.accelerate(10);
//        car2.decelerate(5);
//        System.out.println("car1"+car1.toString());
//        System.out.println("car2"+car2.toString());
        int[] arry=new int[]{6,3,7,2,4};
        IntArraryKit arrkit=new IntArraryKit(arry);
        System.out.println(arrkit.toString());
        arrkit.sort();
        System.out.println(arrkit.toString());
        System.out.println(arrkit.getMax());

    }
}
