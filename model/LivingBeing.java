
package OOP1.JavaOOP1.model;

import java.io.Serializable;

public abstract class LivingBeing implements Serializable {
    private String name;
    private int birthDate;

    public LivingBeing(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getBirthDate() {
        return birthDate;
    }
}
