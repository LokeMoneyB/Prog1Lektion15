package opgave01;

import opgave01.models.*;

public class Main {
    public static void main(String[] args) {
        Warrior Fofstelr = new Barbarian("Fof-stelr",5);
        Weapon longsword = new Weapon("Longsword");
        Spell fireball = new Spell(50,Duration.INSTANTANEOUS);
        Fofstelr.addWeapon(longsword);
        Spellcaster troldmand = new Wizard("troldmand",5);
        troldmand.addSpell(fireball);
        Ranged bow = new Ranged("Bow",80);
        Fofstelr.addWeapon(bow);
        Fofstelr.printWeapons();
    }
}
