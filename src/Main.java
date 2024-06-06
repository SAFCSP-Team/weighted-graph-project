class Main {
    public static void main(String[] args) {
        
        Graph graph = new Graph(4);
        
        graph.addEdge(0, 1, 16);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 14);
        graph.addEdge(3, 1, 20);

        // leave this as it is
        String [] cities = {"Riaydh", "Makkah", "Jeddah", "Neom"};
        for(int i = 0; i < cities.length; i++){
            System.out.print(cities[i] + "\t");
        }
        System.out.println();
        // _________________ //

        // do the implemenation of display adjacency matrix
        graph.display();

    }
}