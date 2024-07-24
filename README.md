# Weighted Graph

## Objective
The purpose of the project is to validate your knowledge of graph implementation with an adjacency matrix and adjacency list.

## Problem 
Do a representation of travling cost between four cities (Riyadh, Makkah, Jeddah, Neom) and display the weighted graph relations using adjacnecy matrix as below image.

## Implementation 
Do the implemenation of the follwing methods in the class `Graph`:
- Create an attribute `adjMatrix` to store the relations of the graph on integer 2D list with their cost.
- Add edge between two cities with the cost of the travel, the row is source and the column is destenation.
- Display the adjacnecy matrix of the graph with cities name and cost as below output.

```java
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
```

**Output**
```
Riaydh  Makkah  Jeddah  Neom
0       16      0       0
0       0       3       0
0       0       0       14
0       20      0       0
```

