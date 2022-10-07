package Inheritance;

public class Main {
    public static void main(String[] args) {
        Worker w1=new Worker("mutalip","fodiloglu","fodiloglu@gmail.com");
        Akademician ak1=new Akademician("Furkan","Fodiloglu","furkan@gmail.com","CivilEngeneer","prof");
        Officer o1=new Officer("Nisa","Fodiloglu","nisa@gmail.com","accounting",30);
        Assistant  as1=new Assistant("Murat","Otto","otto@gmail.com","Phsik","Assistant",3);

        w1.exit();
        ak1.diningHall();
        o1.enter();
        as1.makeQuiz();





    }
}
