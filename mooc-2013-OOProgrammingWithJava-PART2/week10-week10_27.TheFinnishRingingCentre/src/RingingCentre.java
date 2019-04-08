import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> birdListMap;

    public RingingCentre() {
        this.birdListMap = new HashMap<Bird, List<String>>();
    }

    /**
     * Records the observation and its place among the bird information
     * @param bird
     * @param place the location the bird was spotted
     */
    public void observe(Bird bird, String place) {
        if (!birdListMap.containsKey(bird)) {
            birdListMap.put(bird, new ArrayList<String>());
        }
        List<String> list = birdListMap.get(bird);
        list.add(place);
        birdListMap.put(bird, list);
    }

    /**
     * Prints all the observations of the parameter bird
     * @param bird
     */
    public void observations(Bird bird) {
        System.out.print(bird.toString() + " observations: ");

        if (birdListMap.containsKey(bird)) {
            System.out.println(birdListMap.get(bird).size());
            for (String place : birdListMap.get(bird)) {
                System.out.println(place);
            }
        } else {
            System.out.println("0");
        }
    }
}
