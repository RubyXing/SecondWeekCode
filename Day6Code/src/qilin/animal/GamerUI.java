package qilin.animal;/*
 * @author Xingqilin
 */

import java.util.Scanner;

public class GamerUI {
    //启动方法
    public void start() {
        firstChose();
    }

    //初始化人和动物数组
    Person person = new Person("madman", 60, 30);
    Fish fish[] = new Fish[5];
    Cat cat[] = new Cat[5];

    //首页
    public void firstChose() {
        //初始化宠物
        cat[0] = new Cat("cat0", 2, 30);
        cat[1] = new Cat("cat1", 2, 30);
        cat[2] = new Cat("cat2", 2, 30);
        fish[0] = new Fish("fish0", 4, 30);
        fish[1] = new Fish("fish1", 4, 30);
        fish[2] = new Fish("fish2", 4, 30);

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            if (flag) {
                System.out.println(person.toString());
            }
            System.out.println("输入操作：1.喂食，2.吃饭，3.买宠物");
            System.out.print("请输入你的操作：");
            if (scanner.hasNextInt()) {
                flag = false;
                int a = scanner.nextInt();
                if (a == 0) {
                    System.out.println("退出游戏");
                    break;
                } else {
                    choiseCkeck(person, a);
                    break;
                }

            } else {
                flag = false;
                System.out.println("无效选择");
                String a = scanner.nextLine();//刷新输入流
            }


        }

    }

    //选择分支方法,happy判断重复，可优化
    public void choiseCkeck(Person person, int i) {
        switch (i) {
            case 1://喂食
                if (person.checkHappy()) {
                    feedAnimal();
                    firstChose();
                }
                break;
            case 2://吃饭
                if (person.checkHappy()) {
                    eatFood();
                    firstChose();
                }
                break;
            case 3://买宠物
                if (person.checkHappy()) {
                    shopping();
                    firstChose();
                }
                break;
            default:
                System.out.println("操作错误");
                break;
        }
    }

    //宠物商店
    public void shopping() {
        System.out.println("---------------------");
        if (person.checkEnergy()) {
            person.energyLost(5);
            if (person.isAnimaleater()) {
                System.out.println("由于你吃过宠物，被商店老板赶出来了");
            } else {
                System.out.println("没钱买宠物，自己回去");
            }
        }
    }

    //喂食
    public void feedAnimal() {
        System.out.println("---------------------");
        person.energyLost(1);
        System.out.print("请选择你要喂的宠物");
        showAnimal();
    }

    //吃饭
    public void eatFood() {
        System.out.println("---------------------");
        System.out.println("请选择：1.吃饭，2.料理动物吃");
        Scanner scanner = new Scanner(System.in);
        int eatCheck = Integer.parseInt(scanner.nextLine());
        if (eatCheck == 1) {
            person.eat();
        } else if (eatCheck == 2) {
            catcheata();
        } else {
            System.out.println("吃饭错误，好好输入，别乱搞");
        }

    }

    //吃动物方法,可优化
    public void catcheata() {
        System.out.println("---------------------");
        System.out.println("你选择了料理动物吃，请选择要抓获的动物:1.猫，2.鱼");
        Scanner scanner = new Scanner(System.in);
        int eatCheck = Integer.parseInt(scanner.nextLine());
        if (eatCheck == 1) {
            if (Math.random() < 0.4) {
                System.out.print("你成功的抓住了猫，它使出泪眼汪汪，你不忍心吃掉。");
                person.energyLost(2);
            } else {
                System.out.print("你没抓住猫,");
                person.energyLost(4);
            }
        } else if (eatCheck == 2) {
            boolean hasfash = false;
            for (Fish fish1 : fish) {
                if (fish1 != null) {
                    hasfash = true;
                }
            }
            if (Math.random() < 0.9 && hasfash) {
                System.out.print("你成功的抓住了鱼。");
                for (int i = 0; i < fish.length; i++) {
                    if (fish[i] != null)
                        person.eat(fish[i]);
                    fish[i] = null;
                }
            } else if (!hasfash) {
                System.out.println("你没鱼了");
            } else {
                System.out.print("你没抓住鱼,");
                person.energyLost(2);
            }
        } else {
            System.out.println("抓获动物错误，别乱搞");
        }

    }

    //展示已有宠物,并喂食。可优化
    public void showAnimal() {
        System.out.println("1.猫，2.鱼");
        Scanner scanner = new Scanner(System.in);
        int chose = Integer.parseInt(scanner.nextLine());
        int bound = 0;
        if (chose == 1) {
            System.out.println("你拥有猫：");
            for (Cat cat1 : cat) {
                if (cat1 != null) {
                    System.out.print(bound + ":" + cat1 + "   ");
                    bound++;
                }
            }
            System.out.println();
            System.out.print("请选择你要喂的猫:");
            int feedwho = Integer.parseInt(scanner.nextLine());
            person.feed(cat[feedwho], "猫粮");
        } else if (chose == 2) {
            System.out.println("你拥有鱼：");
            for (Fish fish1 : fish) {
                if (fish1 != null) {
                    System.out.print(bound + ":" + fish1 + "   ");
                    bound++;
                }
            }
            System.out.println();
            System.out.print("请选择你要喂的鱼:");
            int feedwho = Integer.parseInt(scanner.nextLine());
            person.feed(fish[feedwho], "猫粮");
        } else {
            System.out.println("展示宠物错误,别乱录入");
        }
    }

}
