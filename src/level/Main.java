package level;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Play play = new Play();
        LongRangeArmy a1 = new LongRangeArmy();
        ShortRangeArmy a2 = new ShortRangeArmy();
        ArrayList<Army> army1=new ArrayList<>();
        army1.add(a1);
        army1.add(a2);
        out:while (true) {
            System.out.println("请你进行如下操作");
            System.out.println("录入英雄和小兵信息：add");
            System.out.println("进行战斗：start(如果数据没有添加完则重新添加）");
            Scanner sc = new Scanner(System.in);
            System.out.println("请你输入命令");
            String command=sc.next();
            switch (command){
                case "add":
                    addThings(play,a1,a2,sc);
                    break ;


                case "start":

                    Fight f=new Fight(play,a1,a2);
                    break out;
                default:
                    System.out.println("没有该功能");
            }
        }
    }
    public static void addThings(Play play,LongRangeArmy a1 ,ShortRangeArmy a2,Scanner sc){
        System.out.println("请你输入英雄属性");
        System.out.println("请你输入名称");
        String name=sc.next();
        System.out.println("请你输入生命:");
      int life= sc.nextInt();
        System.out.println("请你输入攻击力:");
        int attack=sc.nextInt();
        System.out.println("请你输入防御力：");
        int defense= sc.nextInt();
        play.setName(name);
        play.setLife(life);
        play.setAttack(attack);
        play.setDefense(defense);
        System.out.println("......................");
        System.out.println("请你输入远程小兵属性");
        System.out.println("请你输入名称");
        String name1=sc.next();
        System.out.println("请你输入生命:");
        int life1= sc.nextInt();
        System.out.println("请你输入攻击力:");
        int attack1=sc.nextInt();

        a1.setName(name1);
        a1.setLife(life1);
        a1.setAttack(attack1);
        System.out.println("...........................");
        System.out.println("请你输入近战小兵属性");
        System.out.println("请你输入名称");
        String name2=sc.next();
        System.out.println("请你输入生命:");
        int life2= sc.nextInt();
        System.out.println("请你输入攻击力:");
        int attack2=sc.nextInt();

        a2.setName(name2);
        a2.setLife(life2);
       a2.setAttack(attack2);




    }

}