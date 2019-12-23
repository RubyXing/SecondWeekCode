import java.util.Arrays;

public class IntArraryKit {
    /*
     * 1、创建IntArrayKit类，成员属性为int数组，
     * 2、有一个无参构造，有一个有参构造，参数为一个int数组，并将该数组赋值给其成员变量
     * 3、创建成员方法(行为)toString，功能为：将成员变量的数组按“[1,2,4,6]”格式进行控制台输出(可以考虑不用控制台输出，直接作为返回值返回)；
     * 4、创建成员方法sort，功能为：将成员变量数组中数据按从小到大排序;
     * 5、创建成员方法getMax,功能为：找出成员变量数组中最大值，并将其作为该方法的返回值返回;
     */
    public int[] arry;

    public IntArraryKit() {
    }

    public IntArraryKit(int[] arry) {

        this.arry = arry;
    }

    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < arry.length; i++) {
            str+=arry[i];
            if (i<arry.length-1){
                str+=",";
            }
        }
        return "[ "+str+" ]";
//        return Arrays.toString(arry);
    }

    public int getMax() {
        int tempmax = 0;
        for (int i : arry) {
            if (tempmax < i) {
                tempmax = i;
            }
        }
        return tempmax;
    }

    public void sort() {
        for (int i = arry.length; i >0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arry[j]>arry[j+1]) {
                    arry[j]+=arry[j+1];
                    arry[j+1]=arry[j]-arry[j+1];
                    arry[j]-=arry[j+1];
                }
            }
        }
//        Arrays.sort(arry);
    }
}
