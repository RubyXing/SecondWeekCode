public class Knife extends Arms {
    protected double length,thickness,wear;


    public Knife(double aPwoer, double defense, double length, double thickness, double wear) {
        super(aPwoer, defense);
        this.length = length;
        this.thickness = thickness;
        this.wear = wear;
    }

    public Knife(double length, double thickness, double wear) {
        this.length = length;
        this.thickness = thickness;
        this.wear = wear;
    }
    public Knife(){}

    public String repair(double wear){
        this.wear+=wear;
        return "修复了：" + wear + ",剩余耐久：" + this.wear;
    }
    @Override
    protected String attact(String str) {
        wear--;
        return "攻击了："+str+"，武器耐久-1.0";

    }

    @Override
    protected String ultimateskil(String str) {
        wear-=5;
        return "对"+str+"释放终极技能，武器耐久-5.0";
    }
}
