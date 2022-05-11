import javax.xml.namespace.QName;
import java.util.Date;

public class Film {
    private int id;
    private String title;
    private String type;
    private String author;
    private String releaseDate;

    public Film() {
    }

    public Film(int id, String title, String type, String author, String releaseDate) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void printInfor(){
        System.out.printf("%-5d %-15s %-15s %-15s %-15s",id,title, type,author,releaseDate);
    }
}
