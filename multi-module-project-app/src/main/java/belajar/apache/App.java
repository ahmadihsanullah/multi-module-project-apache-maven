package belajar.apache.maven;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Ahmad");
        
        Gson json = new Gson();
        String jsonName = json.toJson(person);

        System.out.println(jsonName);
    }
}
