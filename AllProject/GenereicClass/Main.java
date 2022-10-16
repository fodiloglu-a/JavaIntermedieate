package GenereicClass;

public class Main {
    public static void main(String[] args) {

        String a=null;
        Integer b=null;

        Generic <Integer> n=new Generic<>(b);
        n.isNull(b);

        String [] arrayOne=new String[]{"Java","101","Class"};
        Integer [] arrayTwo=new Integer[] {2,3,4,5};

        GenericMethod.printArray(arrayOne);//Call Generic Method
        GenericMethod.printArray(arrayTwo);

    }
}
