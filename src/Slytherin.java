// факультет Слизерин
public class Slytherin extends Hogwarts{
    // cunning - хитрость, determination - решительность, ambition - амбициозность,
    // resourcefulness - находчивость, thirst for power - жажда власти
    private final int cunning, determination, ambition, resourcefulness, thirstForPower;

    public Slytherin(String name, String surname, int magicPowerLevel, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, magicPowerLevel, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + super.toString() +
                ", хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + thirstForPower;
    }
}
