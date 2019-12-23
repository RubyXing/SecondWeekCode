public class Cars {
    //    创建一个汽车类，该类拥有品牌、轮胎数、车门数、颜色、重量等属性，加速、减速等行为，并且利用构造器为每个对象设置轮胎数初始值为4，
//    车门数为4，颜色为白色，并创建两个汽车对象，分别调用其行为;
    public String brand, color = "white";
    int doorsnum = 4, tiresnum = 4;
    public double weight, speed;

    public Cars(String brand, String color, int doorsnum, int tiresnum, double weight, double speed) {
        this.brand = brand;
        this.color = color;
        this.doorsnum = doorsnum;
        this.tiresnum = tiresnum;
        this.weight = weight;
        this.speed = speed;
    }

    public Cars() {
    }

    public void decelerate(double speed) {
        this.speed -= speed;
        System.out.println(this.speed > 0 ? "前进速度" + this.speed : "后退速度" + Math.abs(this.speed));
    }

    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println(this.speed > 0 ? "前进速度" + this.speed : "后退速度" + Math.abs(this.speed));
    }

    @Override
    public String toString() {
        return " {" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", doorsnum=" + doorsnum +
                ", tiresnum=" + tiresnum +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorsnum(int doorsnum) {
        this.doorsnum = doorsnum;
    }

    public void setTiresnum(int tiresnum) {
        this.tiresnum = tiresnum;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
