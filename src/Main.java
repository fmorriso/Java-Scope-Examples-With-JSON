import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.format("Java version: %s%n", getJavaVersion());

        Gson g = getDefaultGson();

        Pet p = new Pet("Tigger", 3);
        System.out.println(p);
        System.out.println(g.toJson(p));


        Cat c = new Cat("Bob", 5);
        System.out.println(c);
        System.out.println(g.toJson(c));

    }

    private static Gson getDefaultGson() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    private static String getJavaVersion() {
        Runtime.Version rtv = Runtime.version();
        return String.format("%s.%s.%s.%s", rtv.feature(), rtv.interim(), rtv.update(), rtv.patch());
    }
}