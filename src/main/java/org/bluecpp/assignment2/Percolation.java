package org.bluecpp.assignment2;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

import java.lang.reflect.Array;

public class Percolation {

    private final Integer[][] m_grid;
    private Integer m_openSitesCount;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        m_grid = new Integer[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                m_grid[i][j] = 0;
            }
        }
        m_openSitesCount = 0;
    }

    // test client (optional)
    public static void main(String[] args) {
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (m_grid[row][col] != 1) {
            m_grid[row][col] = 1;
            m_openSitesCount++;
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return m_grid[row][col] == 1;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return m_openSitesCount == m_grid.length;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return m_openSitesCount;
    }

    // does the system percolate?
    public boolean percolates() {
        return true;
    }

    private class Node {
        private Node m_next;


    }
    private class WeightedQuickUnionFind {
        private int[] id;
        private int[] sizes;
        private int count;

        public WeightedQuickUnionFind(int count) {
            this.count = count;
            sizes = new int[count];
            id = new int[count];
            for (int i = 0; i < count; i++) {
                id[i] = i;
                sizes[i] = 1;
            }
        }

        public int getCount() {
            return count;
        }
    }

}
