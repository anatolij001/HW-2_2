public class Main {
    public static void main(String[] args) {
     Gryffindor[] gryffindors = {
             new Gryffindor("Гарри", "Поттер", 100, 20, 65, 30, 70),
             new Gryffindor("Гермиона", "Грейнджер", 85, 60, 70, 80, 20),
             new Gryffindor("Рон", "Уизли", 8, 7, 5, 12, 37),
     };

     Slytherin[] slytherins = {
             new Slytherin("Драко", "Малфой", 62, 58, 7, 0, 15, 16, 13),
             new Slytherin("Грэхэм", "Монтегю", 28, 18, 17, 80, 75, 38, 26),
             new Slytherin("Драко", "Малфой", 61, 25, 43, 74, 9, 8, 16),
     };

     Hufflepuff[] hufflepuffs = {
             new Hufflepuff("Захария", "Смит", 4, 78, 7, 14, 11),
             new Hufflepuff("Седрик", "Диггори", 48, 17, 74, 1, 21),
             new Hufflepuff("Джастин", "Финч-Флетчли", 14, 32, 84, 17, 14),
     };

     Ravenclaw[] ravenclaws = {
             new Ravenclaw("Чжоу", "Чанг", 20, 47, 35, 41, 89, 14),
             new Ravenclaw("Падма", "Патил", 76, 14, 28, 26, 31, 4),
             new Ravenclaw("Маркус", "Белби", 96, 87, 41, 7, 5, 3),
     };

     PrintService printService = new PrintService();

     for (Gryffindor gryff : gryffindors){System.out.println(gryff);}

     printService.findTheBestStudentOnFaculty(gryffindors);

     for (Slytherin slyth : slytherins){
      System.out.println(slyth);
     }
     printService.findTheBestStudentOnFaculty(slytherins);

     for (Hufflepuff huff : hufflepuffs){
      System.out.println(huff);
     }
     printService.findTheBestStudentOnFaculty(hufflepuffs);

     for (Ravenclaw raven : ravenclaws){
      System.out.println(raven);
     }
     printService.findTheBestStudentOnFaculty(ravenclaws);

     printService.findTheBestStudentOnHogwarts(gryffindors[0], slytherins[0]);

    }
}