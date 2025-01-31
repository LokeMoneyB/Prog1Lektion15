package opgave01.models;

import javax.naming.Name;

public class Weapon {

    public String getName() {
        return name;
    }

    private String name;

    public Weapon(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
