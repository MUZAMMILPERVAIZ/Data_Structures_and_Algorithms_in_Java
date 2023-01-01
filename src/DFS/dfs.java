package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class dfs {
    public static ArrayList<String> visited = new ArrayList<>();
    public static ArrayList<String> queue = new ArrayList<>();
    public static HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
    public static boolean isGoalAchieved = false;


    public static void main(String[] args) {

//          TODO: GRAPH 1
//        dictionary.put("A", new ArrayList<>(Arrays.asList("B", "C", "D")));
//        dictionary.put("B", new ArrayList<>(Arrays.asList("")));
//        dictionary.put("C", new ArrayList<>(Arrays.asList("E", "F")));
//        dictionary.put("D", new ArrayList<>(Arrays.asList("F")));
//        dictionary.put("E", new ArrayList<>(Arrays.asList("")));
//        dictionary.put("F", new ArrayList<>(Arrays.asList("")));

//          TODO: GRAPH 2
        dictionary.put("2", new ArrayList<>(Arrays.asList("0")));
        dictionary.put("0", new ArrayList<>(Arrays.asList("1", "2")));
        dictionary.put("1", new ArrayList<>(Arrays.asList("2", "3")));
        dictionary.put("3", new ArrayList<>(Arrays.asList("3")));


        BFS("2", "3");
    }

    public static void BFS(String node, String goal) {
        visited.add(node);
        queue.add(node);

        while (true) {
            System.out.println("-_-_-_-_-_-_-_-_-_-_-");
            String m = queue.remove(queue.size() - 1);
            System.out.println(m);
            if (m.equals(goal)) {
                isGoalAchieved = true;
                System.out.println("Goal Achieved....");
                break;
            } else if (!isGoalAchieved) {
                ArrayList<String> neighours = dictionary.get(m);
                boolean found = false;
                for (String neighbour : neighours) {
                    for (String v : visited) {
                        if (v.equals(neighbour)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        if (!neighbour.equals("")) {
                            queue.add(neighbour);
                        }
                    }
                    found = false;
                }
            }
        }
    }
}
