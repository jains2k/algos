package com.sj.learning.algos.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnionRankCompressFindTest {

    UnionRankCompressFind unionRankCompressFind;
    @Test
    void testCompressFind() {
        unionRankCompressFind.union(0,1);
        unionRankCompressFind.union(2,3);
        unionRankCompressFind.union(0,2);
        assertEquals(3, unionRankCompressFind.getRank(0));

        assertEquals(0, unionRankCompressFind.find(3));
        assertEquals(1, unionRankCompressFind.getRank(0));
    }

    @Test
    void testCompressFind2() {
        unionRankCompressFind.union(0,1);
        unionRankCompressFind.union(2,3);
        unionRankCompressFind.union(0,2);

        unionRankCompressFind.union(4,5);
        unionRankCompressFind.union(6,7);
        unionRankCompressFind.union(4,6);

        unionRankCompressFind.union(0,4);
        assertEquals(4, unionRankCompressFind.getRank(0));
        assertEquals(0, unionRankCompressFind.find(7));
        assertEquals(1, unionRankCompressFind.getRank(0));
    }


    @BeforeEach
    void setup() {
        unionRankCompressFind = new UnionRankCompressFind(8);
    }
}
