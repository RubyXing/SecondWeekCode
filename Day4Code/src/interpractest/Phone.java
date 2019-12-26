package interpractest;/*
 * @author Xingqilin
 *
 *
 *
 */

//二.接口练习
//1.定义接口Phone,定义手机功能标准，要求所有手机都必须有打电话、发短信功能，且最大重量为250克;
//2.定义Phone子类FeaturePhone ,实现Phone所有抽象方法;
//3.定义SmartPhone接口 ，继承Phone接口,且拥拍照、播放音频、玩游戏抽象方法
//4.定义Apple的SmartPhone子类 ，实现SmartPhone所有抽象方法
//5.定义HuaWei的SmartPhone子类，实现SmartPhone所有抽象方法
public interface Phone {
    int MAX_WEIGHT = 250;

    String call(String str);

    String sendmes(String str);


}
