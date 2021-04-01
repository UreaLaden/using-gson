package using.gson;

public class Qoute {
    String author;
    String text;
    String quote;

    public Qoute(String author,String quote,String text) {
        this.author = author;
        this.text = text;
        this.quote = quote;
    }


    @Override
    public String toString() {

        return "Qoute{" +
                "author='" + author + '\'' +
                ", quote= " + (text != null?text:"")  + '\'' +
                (quote != null ? quote:"") + '\'' +
                '}';
    }

}
