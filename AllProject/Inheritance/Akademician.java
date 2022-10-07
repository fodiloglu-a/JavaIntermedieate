package Inheritance;
public  class Akademician extends  Worker {
    private String episode;
    private String title;
    public Akademician(String name, String surname, String ePost,String episode,String title) {
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

    public  void enterLesson(){
        System.out.println("Enter Lesson");
    }
}



