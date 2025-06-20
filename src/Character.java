public abstract class Character implements Creature {
    String name;
    int hp;
    public Character(String name, int hp) {}
    public abstract void attack(Character target);
    public final boolean isAlive(){
        return this.hp>0;
    }
    public void showStatus(){
        System.out.println(name+":HP "+hp);
    }

}
