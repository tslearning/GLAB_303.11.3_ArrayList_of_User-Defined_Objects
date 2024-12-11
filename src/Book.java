public class Book {
    private int number;
    private String name;
    private String author;
    private String category;

    //Constructor with arguments
    public Book(int number, String name, String author, String category) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.number = number;
    }

    //Constructor without arguments
    public Book() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}



