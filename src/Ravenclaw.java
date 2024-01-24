// факультет Когтевран
public class Ravenclaw extends Hogwarts{
    //  smart - умны, wisdom - мудры, witty - остроумны, creativity - творчество.
    private final int smart, wisdom, witty, creativity;

    public Ravenclaw(String name, String surname, int magicPowerLevel, int transgressionDistance, int smart, int wisdom, int witty, int creativity) {
        super(name, surname, magicPowerLevel, transgressionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + super.toString() +
                ", умны = " + smart +
                ", мудры = " + wisdom +
                ", остроумны = " + witty +
                ", творчество = " + creativity;
    }
}
