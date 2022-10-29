package MapHashMap;

import java.util.TreeMap;

public class TryMapes {
    public static void main(String[] args ) {
        TreeMap<Integer, Student> studentTreeMap=new TreeMap<Integer, Student>(new OrderByNoComperator().reversed());

        Student student1=new Student("name",1,60);
        Student Student1=new Student("Murat",2,70);
        Student Student2=new Student("Nihat",3,80);
        studentTreeMap.put(1,student1);
        studentTreeMap.put(2,  Student1);
        studentTreeMap.put(3, Student2);

        for (Student student:studentTreeMap.values()
             ) {
            System.out.println(student.getName());


        }



    }
}
