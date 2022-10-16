package RentCar;

import java.util.ArrayList;
import java.util.List;

public class RentCarServis {
    private Costumer costumer;
    static List <Car> carList;

    public RentCarServis(Costumer costumer) {
        this.costumer=costumer;

        createCarRepo();


    }
    public RentCarServis(){
        createCarRepo();
    }


    public  List<Car>  getCarlist( ) {
        List<Car> carCutomerType = new ArrayList<>();
        for (Car car : carList) {
            if (costumer instanceof Individual) {

                if (car instanceof Hatchback) {
                    carCutomerType.add(car);


                } else {
                    carCutomerType.add(car);
                }




            }return  carCutomerType;

        }

        return  carCutomerType;
    }







    public void createCarRepo(){
        carList=new ArrayList<>();

        Suv suv1=new Suv(10,"Opel","Blue");
        Suv suv2=new Suv(15,"Mercedes","Black");
        carList.add(suv1);
        carList.add(suv2);
        //
        Sedan sedan1=new Sedan(5,"Volvo","Black");
        Sedan sedan2=new Sedan(7,"Audi","Yellow");
        carList.add(sedan1);
        carList.add(sedan2);
        //
        Hatchback hatchback1=new Hatchback(12,"Reno","White");
        Hatchback hatchback2=new Hatchback(13,"BMW","lila");
        carList.add(hatchback1);
        carList.add(hatchback2);



    }
}
