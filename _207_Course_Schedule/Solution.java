package _207_Course_Schedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegrees = new int[numCourses];
        List<Integer> adj[] = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int preCourse = prerequisite[1];

            inDegrees[course]++;
            adj[preCourse].add(course);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        int done = 0;

        while (!queue.isEmpty()) {
            int course = queue.poll();

            for (int depCourse : adj[course]) {
                inDegrees[depCourse]--;

                if (inDegrees[depCourse] == 0) {
                    queue.offer(depCourse);
                }
            }

            done++;
        }

        return done == numCourses;
    }
}
