package interpractest;/*
 * @author Xingqilin
 *
 *
 *
 */

public class FeaturePhone implements Phone {

    @Override
    public String call(String str) {
        return "打电话给" + str;
    }

    @Override
    public String sendmes(String str) {

        return "发短信给" + str;
    }
}
