/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package using.gson;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {

//        System.out.println(App.getQuoteFromAPI());// why do hate me correitio
//        getQuoteFromAPI();
        Qoute newQoute = new Qoute("jim","hello hello hello","never trust a fart","tag1");

        System.out.println("hello world");
        addToJSON(newQoute);


    }

    public static String getQuoteFromJSON() throws FileNotFoundException {
        Gson gson = new Gson();
        String path = "/mnt/Ubuntu_Data/CodeFellows/Labs/java/using-gson/app/src/main/resources/quotes.json";
        File file = new File(path);
        FileReader reader = new FileReader(file);
        Qoute[] qoutes = gson.fromJson(reader, Qoute[].class);
        int max = qoutes.length;
        int rand = (int)(Math.random()*max);
        return qoutes[rand].toString();
    }

    public static <Quote> String getQuoteFromAPI() throws IOException {
        String starWarsURL = "https://swapi.dev/api/people/?search=r2";
        String pokeUrl  = "https://pokeapi.co/api/v2/pokemon/ditto";
        String programmerURL = "http://quotes.stormconsultancy.co.uk/popular.json";
        URL url = new URL(programmerURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        System.out.println(connection);
        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
        System.out.println(inputStreamReader);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String jsonLine = bufferedReader.readLine();
//        System.out.println(jsonLine);
        Gson gson = new Gson();
        Qoute[] results = gson.fromJson(jsonLine,Qoute[].class);
        System.out.println(Arrays.toString(results));
        System.out.println(results[0]);
//        String res = results.toString();




        return programmerURL;
    }


    public static void addToJSON(Qoute qoute) throws IOException {
        Gson gson = new Gson();
        String newPath = "/home/owner/codefellows/using-gson/app/src/main/resources/miniQuotes.json";
//        ArrayList<Qoute> qouteArrayList = new  ArrayList<>();


//        saveQuote = new Quote[] {new Qoute("jim","hello hello hello","never trust a fart")};
        File file = new File(newPath );
        try {
            FileReader fileRead = new FileReader(file);
            Qoute newQ = gson.fromJson(fileRead, Qoute.class);

            System.out.println(newQ);
        }
        catch (Exception MalformedJsonException ){
            System.out.println("dont work bro");
        }
        FileWriter fileWriter = new FileWriter(file,true);
        gson.toJson(qoute, fileWriter);
        fileWriter.close();
//        System.out.println(qoute);

    }


}
