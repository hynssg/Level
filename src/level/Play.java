package level;

public class Play {

   private String name;
   private int life;
   private int attack;
   private int defense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<=20) {
            this.name = name;
        }else {
            System.out.println("请你输入名字长度小于20字符");
        }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (life<=9999&& life>=1) {
            this.life = life;
        }else {
            System.out.println("请你输入一个1到9999的数");

        }
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack>=1&&attack<=999) {
            this.attack = attack;
        }else {
            System.out.println("请你输入一个1到999的数");
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense>=1&&defense<=999) {
            this.defense = defense;
        }else {
            System.out.println("请你输入一个1到999的数");
        }
    }
}
