package graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Graph {

    private final Map<Character, HashMap<Character, Integer>> distancesGraph;

    public Graph(Map<Character, HashMap<Character, Integer>> graph) {this.distancesGraph = graph;}

    public Map<Character, Integer> dijkstra(Character start) {
        PriorityQueue<MinQueueDijkstra> minQueue = new PriorityQueue<>();
        HashMap<Character, Integer> distances = new HashMap<>();

        minQueue.add(new MinQueueDijkstra(0, start));
        this.distancesGraph.keySet().forEach(k -> distances.put(k, Integer.MAX_VALUE));
        distances.put(start, 0);

        while (!minQueue.isEmpty()) {
            MinQueueDijkstra currentDistance = minQueue.remove();

            if (currentDistance.distance > distances.get(currentDistance.start)) {
                continue;
            }

            this.distancesGraph.get(currentDistance.start).forEach((k, v) -> {
                Integer distance = currentDistance.distance + v;

                if (distance < distances.get(k)) {
                    distances.put(k, distance);
                    minQueue.add(new MinQueueDijkstra(distance, k));
                }
            });
        }

        return distances;
    }
}

final class MinQueueDijkstra implements Comparable<MinQueueDijkstra> {
    final Integer distance;
    final Character start;

    MinQueueDijkstra(Integer distance, Character start) {
        this.distance = distance;
        this.start = start;
    }

    @Override
    public int compareTo(MinQueueDijkstra o) {
        return Integer.compare(this.distance, o.distance);
    }
}
