package com.codecool.tinkertailor;

import java.util.ArrayList;

public class TinkerTailor {
    private static int baseN = 5;
    private ArrayList<Integer> players = new ArrayList<>();

    private TinkerTailor() {
        resetPlayers(baseN);
    }

    private TinkerTailor(int n) {
        resetPlayers(n);
    }

    private void resetPlayers(int n) {
        for (int i = 0; i < n; i++) {
            players.add(i + 1);
        }
    }

    private int size() {
        return players.size();
    }

    private ArrayList<Integer> game(int k) {
        ArrayList<Integer> sequence = new ArrayList<>(size());
        ArrayList<Integer> tempPlayers = players;
        int out = 0;
        while (tempPlayers.size() != 0) {
            out = (out + k - 1) % tempPlayers.size();
            sequence.add(tempPlayers.get(out));
            tempPlayers.remove(out);
        }
        return sequence;
    }

    public static void main(String[] args) {
        TinkerTailor t = new TinkerTailor();
        ArrayList<Integer> result = t.game(3);
        System.out.println(result.toString());
    }
}