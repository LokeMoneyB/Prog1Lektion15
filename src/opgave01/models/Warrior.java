package opgave01.models;
import java.util.ArrayList;

public class Warrior extends Character{
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level) {
        super(name,level);
        weapons = new ArrayList<>();
    }

    public Warrior() {
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }
    public void printWeapons(){
        for (Weapon weapon : weapons) {
            System.out.println(weapon);
        }
    }
}
