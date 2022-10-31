package Case_Store.Marks;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Mark {
    private UUID ıd;
    private String name;
    List<Mark> markList=new ArrayList<>();

    public Mark(  String name) {
        this.ıd = UUID.randomUUID();
        this.name = name;

    }
    public void addList(Mark mark){
        markList.add(mark);

    }

    public List<Mark> getMarkList() {
        for (Mark m:markList
             ) {
            int id=1;
            System.out.println("Id: "+id+"|\t"+m.getName());id++;


        }
        return markList;
    }

    public UUID getId() {
        return ıd;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
