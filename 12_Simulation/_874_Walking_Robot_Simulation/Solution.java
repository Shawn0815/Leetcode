package _874_Walking_Robot_Simulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        int direction = 0;
        int[] position = new int[] {0, 0};

        Set<String> set = new HashSet<>();

        for (int[] obstacle: obstacles) {
            set.add(Arrays.toString(obstacle));
        }

        int maxDistance = 0;

        for (int c: commands) {
            if (c == -1) {
                direction = (direction + 1) % 4;
                continue;
            }

            if (c == -2) {
                direction = (direction + 3) % 4;
                continue;
            }

            for (int i = 0; i < c; i++) {
                int newX = position[0] + directions[direction][0];
                int newY = position[1] + directions[direction][1];

                int[] newPosition = new int[] {newX, newY};

                if (set.contains(Arrays.toString(newPosition))) {
                    break;
                }

                position = newPosition;
            }
            
            maxDistance = Math.max(maxDistance, 
                            position[0] * position[0] + position[1] * position[1]);
        }

        return maxDistance;
    }
}
