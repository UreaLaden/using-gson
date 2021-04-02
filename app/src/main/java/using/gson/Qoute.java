package using.gson;

public class Qoute {
    String author;
    String text;
    String quote;
    String[] tags;


    public Qoute(String author, String text, String quote, String[] tags) {
        this.author = author;
        this.text = text;
        this.quote = quote;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Qoute{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", quote='" + quote + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }

    public  String getAuthor() {
        return author;
    }


}
