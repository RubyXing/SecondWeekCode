package qilin.xing;/*
 * @author Xingqilin
 */

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.Arrays;

public class GeneralArrays {
    private Object[] a = new Object[10];
    private int size = 10; //数组的大小
    private int nElem = 0; //数组中有多少项


    @Override
    public String toString() {
        return Arrays.toString(a);
    }

    public void add(Object o) {
        if (nElem < size) {
            a[nElem] = o;
            nElem++;
        } else {
            extand(o);
        }
    }


    private void extand(Object o) {
        Object temp[] = new Object[size + 10];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
        size += 10;
        add(o);
    }

    public int find(Object o) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(a)) {
                return i;
            }
        }
        return -1;
    }

    public boolean delate(Object o) {
        if (find(o) != -1) {
            if (find(0) != size - 1) {
                for (int i = find(o); i < size - 1; i++) {
                    a[i] = a[i + 1];
                }
            }
            a[size - 1] = null;
            nElem--;
            return true;
        } else {
            return false;
        }
    }
}
