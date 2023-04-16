// UnionFind.class
class UnionFind {
    private int[] root;

    public UnionFind(int size) {
        root = new int[size];
        for (int i=0; i < size; i++) {
            root[i]=i;
        }
    }

    public int find(int x) {
        if (root[x] == x) return x;
        return find (root[x]);
    }

    public void union(int x, int y) {
        root[y] = x;
    }

    public boolean connected(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        return (rootX == rootY) ;
    }
}