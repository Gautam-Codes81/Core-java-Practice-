package Training;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * graph
 */
public class graph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");

        int V = sc.nextInt();
        System.out.println("Enter the number of edges ");

        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i<V; i++){
            graph.add(new ArrayList<>());

        }

        System.out.println("enter edge");

        for(int i = 0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.println(graph);


    }
}