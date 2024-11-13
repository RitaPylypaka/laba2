package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

   
    private final Map<String, Node> nodeMap;

    public Graph() {
        nodeMap = new HashMap<>();
    }

   
    public void addNode(String label, int data) {
        if (!nodeMap.containsKey(label)) {
            nodeMap.put(label, new Node(label, data));
        } else {
            System.out.println("Node with this label already exists.");
        }
    }


    public void createLink(String fromLabel, String toLabel, boolean bidirectional) {
        if (nodeMap.containsKey(fromLabel) && nodeMap.containsKey(toLabel)) {
            Node fromNode = nodeMap.get(fromLabel);
            Node toNode = nodeMap.get(toLabel);

            if (!fromNode.isLinkedTo(toNode)) {
                fromNode.addLink(toNode);
            }

            if (bidirectional && !toNode.isLinkedTo(fromNode)) {
                toNode.addLink(fromNode);
            }
        } else {
            System.out.println("One or both of the nodes do not exist.");
        }
    }


    public void showGraph() {
        for (Node node : nodeMap.values()) {
            System.out.print(node.label + " [" + node.data + "] ");
            if (node.hasLinks()) {
                System.out.print("-> ");
                for (Node linkedNode : node.getLinks()) {
                    System.out.print(linkedNode.label + " [" + linkedNode.data + "], ");
                }
            }
            System.out.println();
        }
    }

 
    private static class Node {
        String label;
        int data;
        private final List<Node> links;

        public Node(String label, int data) {
            this.label = label;
            this.data = data;
            this.links = new ArrayList<>();
        }

   
        public void addLink(Node node) {
            links.add(node);
        }


        public boolean isLinkedTo(Node node) {
            return links.contains(node);
        }

      
        public List<Node> getLinks() {
            return links;
        }

        
        public boolean hasLinks() {
            return !links.isEmpty();
        }
    }
}