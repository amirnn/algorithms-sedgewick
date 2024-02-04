package org.bluecpp;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        if (args.length != 0) {
            double probability = 1.0 / args.length;
            String champion = null;
            while (!StdIn.isEmpty()) {
                String candidate = StdIn.readString();
                if (StdRandom.bernoulli(probability)) {
                    champion = candidate;
                }
            }
            if (champion != null) {
                System.out.println(champion);
            }
        }
    }
}
