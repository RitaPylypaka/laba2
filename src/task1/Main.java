package task1;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();


        graph.addNode("A", 10);
        graph.addNode("B", 20);
        graph.addNode("C", 30);
        graph.addNode("D", 40);


        graph.createLink("A", "B", true);
        graph.createLink("A", "C", false);
        graph.createLink("B", "D", false);
        graph.createLink("C", "D", true);


        System.out.println("Graph structure:");
        graph.showGraph();
    }
}