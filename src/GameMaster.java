public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("アベル", 100, "銅の剣");
        Slime s = new Slime("スライムA", 30);
        System.out.println("冒険が始まる...!");
        h.showStatus();
        s.showStatus();
        System.out.println("戦闘開始!");
        h.attack(s);
        s.showStatus();
        s.attack(h);
        h.showStatus();
        h.heal();
        h.showStatus();
        for(int i=0;i<3;i++){
            h.attack(s);
        }
        h.showStatus();
        if(h.isAlive()){
            System.out.println(h.name+":生存中");
        } else {
            System.out.println(h.name+":死亡中");
        }
        s.showStatus();
        if(s.isAlive()){
            System.out.println(s.name+":生存中");
        } else {
            System.out.println(s.name+":死亡中");
        }
    }
}
