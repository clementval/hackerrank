import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static class Graph {
        
        List<List<Integer>> adjLst; 
        int size;
        public Graph(int size) {
            adjLst = new ArrayList<>();
            this.size = size;
            while(size-- > 0)
                adjLst.add(new ArrayList<Integer>());
        }

        public void addEdge(int first, int second) {
            adjLst.get(first).add(second);
            adjLst.get(second).add(first); 
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            int[] distances = new int[size];
            HashSet<Integer> visited = new HashSet<>();
            Queue<Integer> nextToVisit = new LinkedList<>();
            
            // Init all to -1 unreachable
            Arrays.fill(distances, -1);
            // Init startId to 0
            distances[startId] = 0;
            
            // Add first node
            nextToVisit.add(startId);
            visited.add(startId);
            while(!nextToVisit.isEmpty()){
                Integer crtNode = nextToVisit.poll();
                for(Integer child : adjLst.get(crtNode)){
                    if(!visited.contains(child)){
                        nextToVisit.add(child); 
                        visited.add(child);
                        distances[child] = distances[crtNode] + 6;
                    }

                }   
            }
            
            return distances;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            
            
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}

