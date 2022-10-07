package Composition;

//This packagefor Composition


public class Main {
    public static void main(String[] args) {
        Composition comOne=new Composition("Captain","Black",000);
        CompositionTwo comTwoOne=new CompositionTwo("Belgium","Den Hag",comOne);

        System.out.println(comTwoOne.getComposition().getName());//Call Compositiion

    }




}
