// факультет Гриффиндор
public class Gryffindor extends Hogwarts{
    // nobility - благородство, honor - честь, bravery - храбрость
    private final int nobility, honor, bravery;
    public Gryffindor(String name, String surname, int magicPowerLevel, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, magicPowerLevel, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }



}
