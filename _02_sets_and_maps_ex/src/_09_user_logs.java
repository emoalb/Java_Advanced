import java.util.*;

public class _09_user_logs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Long>> citiesPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Long> country_max_pop = new LinkedHashMap<>();
        LinkedHashMap<String, Long> sorted_country = new LinkedHashMap<>();
        String input = console.nextLine();
        while (!input.equals("report")) {
            String[] parsedData = input.split("\\|");
            LinkedHashMap<String,Long> cityPop = new LinkedHashMap<>();
            citiesPopulation.putIfAbsent(parsedData[1], new LinkedHashMap<>());
            cityPop = citiesPopulation.get(parsedData[1]);
            cityPop.putIfAbsent(parsedData[0], 0L);
            cityPop.put(parsedData[0], cityPop.get(parsedData[0]) + Integer.parseInt(parsedData[2]));
            citiesPopulation.put(parsedData[1], cityPop);
            input = console.nextLine();
        }

        citiesPopulation.forEach((country, city_pop) -> {
            country_max_pop.putIfAbsent(country, 0L);

            LinkedHashMap<String, Long> sorted_cityPop = new LinkedHashMap<>();
            city_pop.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> sorted_cityPop.put(x.getKey(), x.getValue()));
            sorted_cityPop.forEach((city, population) -> {

                country_max_pop.put(country, country_max_pop.get(country) + population);
                citiesPopulation.put(country, sorted_cityPop);
            });

        });
        country_max_pop.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sorted_country.put(x.getKey(), x.getValue()));
        sorted_country.forEach((country, maxpop) -> {
            System.out.println(country + " (total population: " + maxpop + ")");
            citiesPopulation.get(country).forEach((city, pop) -> {
                System.out.println("=>" + city + ": " + pop);
            });
        });
    }
}
