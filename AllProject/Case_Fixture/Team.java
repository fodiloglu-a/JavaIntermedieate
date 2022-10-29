package Case_Fixture;

import java.util.List;
import java.util.Scanner;

public class Team {
    Scanner input=new Scanner(System.in);
    private String name;
    private int size;

    public Team() {

    }


    public void createTeamList(List<String> team){
        System.out.println("Please enter the number of Team:");
          this.size=input.nextInt();

        for (int i=0;i<size;i++){
            System.out.println("Pleasse enter "+i+".)Team Name: ");
            this.name=input.next();


            team.add( getName());
        }
        if (size%2!=0){
            team.add("Pas");
        }
    }


    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
