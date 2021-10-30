package level;

import java.util.ArrayList;
import java.util.Scanner;

public class Fight {
    public Fight(Play play, LongRangeArmy a1,ShortRangeArmy a2) {
        ArrayList<Army> army2=new ArrayList<>();
        army2.add(a1);
        army2.add(a2);
        out:while (true) {
            System.out.println("请选择打一个小兵or一群小兵");
            System.out.println("打一个小兵：one");
            System.out.println("打一群小兵：all");
            System.out.println("请你输入命令");
            Scanner sc=new Scanner(System.in);
            String commend= sc.next();
            switch (commend){
                case "all":
                    break out;
                case "one":
                    System.out.println("请选择打远程or近战小兵");
                    System.out.println("远程：long" );
                    System.out.println("近战：short");
                    System.out.println("请选择命令");
                    String commend1=sc.next();
                    switch (commend1){
                        case "long":
                            break out;
                        case "short" :
                            break out;
                        default:
                            System.out.println("请检查命令");
                    }
                default:
                    System.out.println("请检查命令");
            }
        }


    }
    public static void fightLong(Play p,LongRangeArmy l){
        int playLife= p.getLife();
        int armyLife=l.getLife();
        int armyInjure=l.getAttack()-p.getDefense();
        int plaYInjure= p.getAttack();

        while (true) {
            if (playLife<=0||armyLife<=0){
                if (playLife<=0){
                    System.out.println("");
                }
            }else {
                System.out.println(p.getName()+"对"+l.getName()+"造成了"+plaYInjure);
            }

        }
    }


}
