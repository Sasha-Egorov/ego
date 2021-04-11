package HW_21_Hotel;

import javax.lang.model.type.IntersectionType;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelRelevance {

    public static Map<Integer, String> map = new HashMap<>();
    public static Map<Integer, Integer> result = new HashMap<>();

    public static void main(String[] args) {

        setMap(1, "This hotel has a nice view of the citycenter.The location is perfect.");
        setMap(2, "The breakfast is ok.Regaring location, it is quite fat from the citycenter." +
                "But price is cheap, so it is ok.");
        setMap(1, "Location is excellent, 5 min from citycenter." +
                "There is also a metro station pretty close to the hotel.");
        setMap(1, "They said I couldn 't take my dog. But there were other guests with dogs! That is not fair.");
        setMap(2, "Very friendly staff and good cost -benefit ratio.Its location is a bit far from citycenter.");

        setMap(33, "This hotel has a nice view of the Citycenter. The citycenter location is perfect.\n");
        setMap(1, "This hotel has a nice view of the Citycenter. The citycenter location is perfect.\n");
        setMap(2, "This hotel has a nice view of the . The citycenter location is perfect.\n");
        setMap(3, "This hotel has a nice view of the . The  location is perfect.\n");
        setMap(33, "This hotel has a nice view of the Citycenter. The citycenter location is perfect.\n");
        printMapWithPoint();
        printMap();


    }

    public static void printMap() {
        result.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.print(e.getKey() + " "));


    }

    public static void printMapWithPoint() {
        result.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(System.out::println);


    }

    public static void setMap(Integer key, String value) {
        map.computeIfPresent(key, (k, v) -> v + value);
        map.computeIfAbsent(key, (k) -> value);

        result.put(key, count(map.get(key)));
    }

    public static int count(String text) {
        text = text.toLowerCase(Locale.ROOT);
        String[] words = {"breakfast", "beach", "citycenter", "location", "metro", "view", "staff", "price"};
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            Pattern pattern = Pattern.compile(words[i]);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}
