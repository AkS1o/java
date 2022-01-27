package OOP;

public class Book {
    private String Name;
    private String FullNameAuthor;
    private int YearOfIssue;
    private String Publisher;
    private String Genre;
    private int NumberOfPages;

    public Book(String Name, String FullNameAuthor, int YearOfIssue, String Publisher, String Genre, int NumberOfPages) {
        this.Name = Name;
        this.FullNameAuthor = FullNameAuthor;
        this.YearOfIssue = YearOfIssue;
        this.Publisher = Publisher;
        this.Genre = Genre;
        this.NumberOfPages = NumberOfPages;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setFullNameAuthor(String FullNameAuthor) {
        this.FullNameAuthor = FullNameAuthor;
    }

    public String getFullNameAuthor(){
        return FullNameAuthor;
    }

    public void setYearOfIssue(int YearOfIssue) {
        this.YearOfIssue = YearOfIssue;
    }

    public int getYearOfIssue(){
        return YearOfIssue;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getPublisher(){
        return Publisher;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getGenre(){
        return Genre;
    }

    public void setNumberOfPages(int NumberOfPages) {
        this.NumberOfPages = NumberOfPages;
    }

    public int getNumberOfPages(){
        return NumberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", FullNameAuthor='" + FullNameAuthor + '\'' +
                ", YearOfIssue='" + YearOfIssue + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", Genre='" + Genre + '\'' +
                ", NumberOfPages='" + NumberOfPages + '\'' +
                '}';
    }
}
