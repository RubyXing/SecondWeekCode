package qilin.xing;/*
 * @author Xingqilin
 */

public class Noodle extends Food {

    public Noodle(String name,double energy) {
        this.energy=energy;
        this.name=name;
    }

    public Noodle() {
    }

    @Override
    public String deteriorate() {
        energy--;
        return "面条放置过久，能量减1";
    }

    @Override
    public String toString() {
        return "Noodle{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }
}
