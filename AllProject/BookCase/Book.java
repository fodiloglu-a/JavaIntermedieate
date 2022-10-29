package BookCase;

public class Book implements Comparable<Book>   {
    private String bookName;
    private int peaperNo;
    private String writerName;
    private  int realseDate;


    public Book(String bookName, int peaperNo, String writerName, int realseDate) {
        this.bookName = bookName;
        this.peaperNo = peaperNo;
        this.writerName = writerName;
        this.realseDate = realseDate;
    }




    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPeaperNo() {
        return peaperNo;
    }

    public void setPeaperNo(int peaperNo) {
        this.peaperNo = peaperNo;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getRealseDate() {
        return realseDate;
    }

    public void setRealseDate(int realseDate) {
        this.realseDate = realseDate;
    }

    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }
}
