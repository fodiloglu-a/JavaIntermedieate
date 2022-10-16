package GenereicClass;

import javax.annotation.processing.Generated;

public class GenericMethod {

    
    @Generated({})
    public static  <T> void printArray(T [] array){
        for (T i:array
             ) {
            System.out.println(i);

        }
    }
}
