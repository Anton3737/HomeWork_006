import java.util.Scanner;

public enum Animals {

    Leonardo(20), Michelangelo(22), Donatello(25), Raphael(30);          // Enam - іменовані константи - присвоєно вік черепашок


    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_YELLOW = "\u001B[33m";     // Ппосто добавив кольори черепашок =)
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    private int yearOld;

    public static void main(String[] args) {
//            Scanner turtle = new Scanner(System.in);
//            String tmnt = turtle.nextLine();
            Animals Leo = Animals.Leonardo;
            Animals Mike = Animals.Michelangelo;        // створюємо об'єкт для черепашки
            Animals Dony = Animals.Donatello;
            Animals Rarf = Animals.Raphael;

//            System.out.println("Leonardo " + Leo.yearOld);
//            System.out.println("Michelangelo " + Mike.yearOld);
//            System.out.println("Donatello " + Dony.yearOld);
//            System.out.println("Raphael " + Rarf.yearOld);
//
//
//            // можна викликати через if-else конкретну черепаху
//            if (tmnt.equals("Leo")) {
//                System.out.println(ANSI_BLUE + "Черепаха має 2 гострі катани "+ ANSI_RESET);
//            } else if (tmnt.equals("Mike")) {
//                System.out.println(ANSI_YELLOW + "Черепашка яка лупашить нунчаками "+ ANSI_RESET);
//            } else if (tmnt.equals("Dony")) {
//                System.out.println(ANSI_PURPLE + "Черепаха яка вправно володіє посохом "+ ANSI_RESET);
//            } else if (tmnt.equals("Rarf")) {
//                System.out.println(ANSI_RED + "Агресивна черепаха яка володіє парою гострих Сай "+ ANSI_RESET);
//            } else {
//                System.out.println("Немає такої черепашки");
//            }


        System.out.println("Raphael " + toString(30));
        System.out.println("Michelangelo " + toString(22));   // присвоюємо вік черепашок через метод з параметром
        System.out.println("Leonardo " + toString(20));
        System.out.println("Donatello " + toString(25));
    }

    Animals(int yearOld) {
        this.yearOld = yearOld;
    }

    public static int toString(int yearOld) {   //  створений метод з параметром віку і прокидуєм в Main
        return yearOld;
    }

}
