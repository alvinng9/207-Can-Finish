package org.example;

import java.util.ArrayList;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prereq) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] pre : prereq) {
            adj[pre[0]].add(pre[1]);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!helper(adj, visited, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean helper(ArrayList<Integer>[] adj, int[] visited, int course) {
        if (visited[course] == 1) {
            return false;
        }

        if (visited[course] == 2) {
            return true;
        }

        visited[course] = 1;

        for (int i = 0; i < adj[course].size(); i++) {
            if(!helper(adj, visited, adj[course].get(i))) {
                return false;
            }
        }
        visited[course] = 2;
        return true;
    }
}
