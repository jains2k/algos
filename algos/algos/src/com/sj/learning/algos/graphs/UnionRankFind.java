package com.sj.learning.algos.graphs;

public class UnionRankFind {
    private int[] root;
    private int[] rank;

    public UnionRankFind(int size) {
        root = new int[size];
        rank = new int[size];
        for (int i=0; i < size; i++) {
            root[i]=i;
            rank[i]=0;
        }
    }

    public int find(int x) {
        if (root[x] == x) return x;
        return find (root[x]);
    }

    public void union(int x, int y) {
        int rootX = root[x];
        int rootY = root[y];
        if (root[x] != root[y]) {
            if (rank[x] > rank[y]) {
                root[y] = rootX;
            } else if (rank[x] < rank[y]) {
                root[x] = rootY;
            } else {
                root[y] = rootX;
                rank[x] += 1;
            }
        }
    }

    public boolean connected(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        return (rootX == rootY) ;
    }

    public int getRank(int x) {
        return rank[x];
    }
}
