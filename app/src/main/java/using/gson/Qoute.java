package using.gson;

import java.util.*;

public class Qoute {
    String author;
    String text;
    ArrayList<String> tags = new ArrayList<>();



    public Qoute(String author, String text, ArrayList<String> tags) {
        this.author = author;
        this.text = text;
        this.tags = tags;
    }

    public ArrayList<String> getTags() {
        return tags;
    }



    @Override
    public String toString() {
        return "Qoute{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", tags=" + tags +
                '}';
    }

}
