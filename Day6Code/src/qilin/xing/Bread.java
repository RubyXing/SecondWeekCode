package qilin.xing;/*
 * @author Xingqilin
 */

public class Bread extends Food {

    public Bread(String name, double energy) {
        this.energy=energy;
        this.name=name;
    }

    public Bread() {
    }

    @Override
    public String deteriorate() {

        energy--;
        return "面包放置过久，能量减1";
    }

    @Override
    public String toString() {
        return "Bread{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }
}
