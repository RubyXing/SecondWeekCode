package interpractest;/*
 * @author Xingqilin
 *
 *
 *
 */

public class Ihpone implements SmartPhone {
    private String useme = "用苹果手机";

    @Override
    public String playGame(String str) {
        return useme + "玩了" + str + "游戏";
    }

    @Override
    public String takePhoto(String str) {

        return useme + "给" + str + "拍照";
    }

    @Override
    public String listenMusic(String str) {

        return useme + "听" + str + "歌";
    }

    @Override
    public String call(String str) {

        return useme + "给" + str + "打电话";
    }

    @Override
    public String sendmes(String str) {

        return useme + "给" + str + "发短信";
    }

}
