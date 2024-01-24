// факультет Пуффендуй
public class Hufflepuff extends Hogwarts{
    // hardworking - трудолюбие, loyalty - верность, honesty - честность
    private final int hardworking, loyalty, honesty;

    public Hufflepuff(String name, String surname, int magicPowerLevel, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, surname, magicPowerLevel, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + super.toString() +
                ", трудолюбие = " + hardworking +
                ", верность = " + loyalty +
                ", честность = " + honesty;
    }
}
