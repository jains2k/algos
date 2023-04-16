package com.sj.learning.algos.graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnionRankFindTest {

    UnionRankFind unionRankFind;
    @Test
    void unionRank() {
        unionRankFind.union(0, 1);
        unionRankFind.union(2, 3);
        unionRankFind.union(4, 5);
        assertEquals(1, unionRankFind.getRank(0));
        assertEquals(0, unionRankFind.getRank(1));
        assertEquals(1, unionRankFind.getRank(2));
        assertEquals(0, unionRankFind.getRank(3));
        assertEquals(1, unionRankFind.getRank(4));
        assertEquals(0, unionRankFind.getRank(5));
        unionRankFind.union(0, 2);
        assertEquals(2, unionRankFind.getRank(0));
        assertTrue(unionRankFind.connected(1, 3));
        unionRankFind.union(0, 4);
        assertEquals(2, unionRankFind.getRank(0));
        assertTrue(unionRankFind.connected(1, 4));


    }

    @BeforeEach
    void setup() {
        unionRankFind = new UnionRankFind(10);
    }
}
