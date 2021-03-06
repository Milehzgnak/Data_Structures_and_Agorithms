import java.io.*; 
import java.util.*; 
  
class DisjointUnionSets { 
    int[] rank, parent; 
    int n; 
  
    public DisjointUnionSets(int n) 
    { 
        rank = new int[n]; 
        parent = new int[n]; 
        this.n = n; 
        makeSet(); 
    } 
  
    void makeSet() 
    { 
        for (int i = 0; i < n; i++) { 
            parent[i] = i; 
        } 
    } 
  
    int find(int x) 
    { 
        if (parent[x] != x) { 
            parent[x] = find(parent[x]); 
  
        } 
  
        return parent[x]; 
    } 
  
    void union(int x, int y) 
    { 
        int xRoot = find(x), yRoot = find(y); 
  
        if (xRoot == yRoot) 
            return; 
  
        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot; 
        } else {
            if (rank[xRoot] == rank[yRoot]) {
              rank[xRoot] = rank[xRoot] + 1;
            }
            parent[yRoot] = xRootl
        }
    }
}
