package com.raqib91.search;

import java.util.*;

public class Graph {
    private final Map<Character, List<Character>> map;

    public Graph() {
        map = new HashMap<>();
    }

    public void addEdge(char u, char v) {
        List<Character> list1 = map.computeIfAbsent(u, k -> new ArrayList<>());
        list1.add(v);

        List<Character> list2 = map.computeIfAbsent(v, k -> new ArrayList<>());
        list2.add(u);
    }

    public List<Character> BFS(char src) {
        List<Character> out = new ArrayList<>();

        Map<Character, Boolean> visited = new HashMap<>();
        for (Character key : map.keySet())
            visited.put(key, false);

        Queue<Character> q = new LinkedList<>();
        q.add(src);
        visited.put(src, true);

        while (!q.isEmpty()) {
            char item = q.poll();
            out.add(item);
            for (Character ch : map.get(item)) {
                if (!visited.get(ch)) {
                    q.add(ch);
                    visited.put(ch, true);
                }
            }
        }

        return out;
    }
}
