package Inheritance;
public  class Academician extends  Worker {
    private String episode;
    private String title;
    public Academician(String name, String surname, String ePost, String episode, String title) {
        super(name,surname,ePost);
        this.episode=episode;
        this.title=title;
    }





    //Get und Set


    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public  void enter(){
        System.out.println("Enter Lesson");
    }
    public void exam(){
        System.out.println(getName()+""+"exam creat");
    }
}



