package GenereicClass;

public class Generic  <T>{
    public  final T value;

    public Generic(T value) {
        this.value = value;
    }

    public T getValue(){

        return this.value;
    }
    public  T isNull(T value){

         if (this.value==null){
             return null;
         }
         else{

             return this.value;
         }


    }

}
