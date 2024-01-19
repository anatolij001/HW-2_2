public class Hogwarts {
    String name, surname;
    int magicPowerLevel = 0, transgressionDistance = 0;

    public Hogwarts(String name, String surname, int magicPowerLevel, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPowerLevel = magicPowerLevel;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPowerLevel() {
        return magicPowerLevel;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
