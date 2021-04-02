package using.gson;

public class Qoute {
//    private static
    String author;
    String text;
    String quote;

    String tags;



    public Qoute(String author,String text, String quote, String tags) {
//        this.setAuthor(author);
        this.author = author;
        this.text = text;
        this.quote = quote;

        this.tags = tags;

    }

    public  String getAuthor() {
        return author;
    }




    @Override
    public String toString() {

        return "Qoute{" +
                "author='" + getAuthor() + '\'' +
                ", quote= " + (text != null?text:"")  + '\'' +
                (quote != null ? quote:"") + '\'' +
                '}';
    }

}
