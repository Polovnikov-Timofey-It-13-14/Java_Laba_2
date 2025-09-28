import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> ways;

    public City(String name) {
        this.name = name;
        this.ways = new HashMap<>();
    }

    public City(String name, Map<City, Integer> roads) {
        this.name = name;
        this.ways = new HashMap<>(roads);
    }

    public void addWays(City city, int way) {
        ways.put(city, way);
    }

    @Override
    public String toString() {
        String result = name;
        if (!ways.isEmpty()) {
            result += " -> ";
            boolean first = true;
            for (Map.Entry<City, Integer> road : ways.entrySet()) {
                if (!first) result += ", ";
                result += road.getKey().name + ":" + road.getValue();
                first = false;
            }
        }
        return result;
    }
}