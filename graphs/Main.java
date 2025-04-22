package graphs;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.of;

public class Main {
    public static void main(String[] args) {
        Map<Character, HashMap<Character, Integer>> distancesGraph = new HashMap<>();
        distancesGraph.put('A', new HashMap<>(of('B', 1, 'C', 4)));
        distancesGraph.put('B', new HashMap<>(of('A', 1, 'C', 2, 'D', 5)));
        distancesGraph.put('C', new HashMap<>(of('A', 4, 'B', 2, 'D', 1)));
        distancesGraph.put('D', new HashMap<>(of('B', 5, 'C', 1)));

        Graph graph = new Graph(distancesGraph);

        Character start = 'A';

        Map<Character, Integer> betterWayToA = graph.dijkstra(start);

        System.out.printf("The better way to %s point is %s", start, betterWayToA.toString());
    }
}
