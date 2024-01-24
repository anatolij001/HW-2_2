public class PrintService {
    public void findTheBestStudentOnFaculty(Gryffindor[] gryffindors){
        int propertiesFirstStudent = 0;
        int propertiesSecondStudent = 0;

        propertiesFirstStudent = gryffindors[0].getNobility() + gryffindors[0].getHonor() + gryffindors[0].getBravery();
        propertiesSecondStudent = gryffindors[1].getNobility() + gryffindors[1].getHonor() + gryffindors[1].getBravery();
        if (propertiesFirstStudent > propertiesSecondStudent) {
            System.out.println(gryffindors[0].getName() + " лучший Гриффиндорец, чем " + gryffindors[1].getName() + ". Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        } else if (propertiesFirstStudent < propertiesSecondStudent) {
            System.out.println(gryffindors[1].getName() + " лучший Гриффиндорец, чем " + gryffindors[0].getName() + ". Результат " + propertiesSecondStudent + " / " + propertiesFirstStudent);
        } else System.out.println("И " + gryffindors[0].getName() + ", и " + gryffindors[1].getName() + " одинаково хороши." + " Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        System.out.println();
    }

    public void findTheBestStudentOnFaculty(Slytherin[] slytherins){
        int propertiesFirstStudent = 0;
        int propertiesSecondStudent = 0;

        propertiesFirstStudent = slytherins[0].getCunning() + slytherins[0].getDetermination() + slytherins[0].getAmbition();
        propertiesSecondStudent = slytherins[1].getCunning() + slytherins[1].getDetermination() + slytherins[1].getAmbition();
        if (propertiesFirstStudent > propertiesSecondStudent) {
            System.out.println(slytherins[0].getName() + " лучший Слизеринец, чем " + slytherins[1].getName() + ". Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        } else if (propertiesFirstStudent < propertiesSecondStudent) {
            System.out.println(slytherins[1].getName() + " лучший Слизеринец, чем " + slytherins[0].getName() + ". Результат " + propertiesSecondStudent + " / " + propertiesFirstStudent);
        } else System.out.println("И " + slytherins[0].getName() + ", и " + slytherins[1].getName() + " одинаково хороши." + " Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        System.out.println();
    }

    public void findTheBestStudentOnFaculty(Hufflepuff[] hufflepuffs){
        int propertiesFirstStudent = 0;
        int propertiesSecondStudent = 0;

        propertiesFirstStudent = hufflepuffs[0].getHardworking() + hufflepuffs[0].getLoyalty() + hufflepuffs[0].getHonesty();
        propertiesSecondStudent = hufflepuffs[1].getHardworking() + hufflepuffs[1].getLoyalty() + hufflepuffs[1].getHonesty();
        if (propertiesFirstStudent > propertiesSecondStudent) {
            System.out.println(hufflepuffs[0].getName() + " лучший Пуффендуец, чем " + hufflepuffs[1].getName() + ". Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        } else if (propertiesFirstStudent < propertiesSecondStudent) {
            System.out.println(hufflepuffs[1].getName() + " лучший Пуффендуец, чем " + hufflepuffs[0].getName() + ". Результат " + propertiesSecondStudent + " / " + propertiesFirstStudent);
        } else System.out.println("И " + hufflepuffs[0].getName() + ", и " + hufflepuffs[1].getName() + " одинаково хороши." + " Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        System.out.println();
    }
    public void findTheBestStudentOnFaculty(Ravenclaw[] ravenclaws){
        int propertiesFirstStudent = 0;
        int propertiesSecondStudent = 0;

        propertiesFirstStudent = ravenclaws[0].getSmart() + ravenclaws[0].getWisdom() + ravenclaws[0].getWitty() + ravenclaws[0].getCreativity();
        propertiesSecondStudent = ravenclaws[1].getSmart() + ravenclaws[1].getWisdom() + ravenclaws[1].getWitty() + ravenclaws[1].getCreativity();
        if (propertiesFirstStudent > propertiesSecondStudent) {
            System.out.println(ravenclaws[0].getName() + " лучший Когтевранец, чем " + ravenclaws[1].getName() + ". Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        } else if (propertiesFirstStudent < propertiesSecondStudent) {
            System.out.println(ravenclaws[1].getName() + " лучший Когтевранец, чем " + ravenclaws[0].getName() + ". Результат " + propertiesSecondStudent + " / " + propertiesFirstStudent);
        } else System.out.println("И " + ravenclaws[0].getName() + ", и " + ravenclaws[1].getName() + " одинаково хороши." + " Результат " + propertiesFirstStudent + " / " + propertiesSecondStudent);
        System.out.println();
    }
    public void findTheBestStudentOnHogwarts(Gryffindor gr, Slytherin sl){
        int generalPropertiesFisrstStudent, generalPropertiesSecondStudent;
        generalPropertiesFisrstStudent = gr.getMagicPowerLevel() + gr.getTransgressionDistance();
        generalPropertiesSecondStudent = sl.getMagicPowerLevel() + sl.getTransgressionDistance();

        if (generalPropertiesFisrstStudent > generalPropertiesSecondStudent){
            System.out.println("По совокупности свойств 'сила магии' и 'расстояние трансгрессии' " + gr.getName() + " " + gr.getSurname() + " сильнее, чем " + sl.getName() + " " + sl.getSurname() + ": " +generalPropertiesFisrstStudent + " / " + generalPropertiesSecondStudent + " \n");
        } else if (generalPropertiesFisrstStudent < generalPropertiesSecondStudent) {
            System.out.println("По совокупности свойств 'сила магии' и 'расстояние трансгрессии' " + sl.getName() + " " + sl.getSurname() + " сильнее, чем " + gr.getName() + " " + gr.getSurname() + ": " +generalPropertiesSecondStudent + " / " + generalPropertiesFisrstStudent + " \n");
        } else System.out.println("По совокупности свойств 'сила магии' и 'расстояние трансгрессии' " + sl.getName() + " " + sl.getSurname() + " и " + gr.getName() + " " + gr.getSurname() + " равны: " +generalPropertiesSecondStudent + " / " + generalPropertiesFisrstStudent + " \n");
    }

}
