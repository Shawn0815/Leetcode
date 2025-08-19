package Problem_252__Meeting_Rooms.Java;

import java.util.Arrays;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        List<Interval> intervals1 = Arrays.asList(
            new Interval(0, 30),
            new Interval(5, 10),
            new Interval(15, 20));

        List<Interval> intervals2 = Arrays.asList(
            new Interval(5, 8),
            new Interval(9, 15));
        
        System.out.println("Can we attend meeting 1: " + solution.canAttendMeetings(intervals1)); // A: true
        System.out.println("Can we attend meeting 2: " + solution.canAttendMeetings(intervals2)); // A: false

    }
}
