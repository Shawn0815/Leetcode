package Problem_703__Kth_Largest_Element_in_a_Stream.Java;

public class TestDemo {
    public static void main(String[] args) {
        int k1 = 3;
        int[] nums1 = new int[]{4, 5, 8, 2};

        KthLargest2 obj1 = new KthLargest2(k1, nums1);

        int k2 = 4;
        int[] nums2 = new int[]{7, 7, 7, 7, 8, 3};

        KthLargest2 obj2 = new KthLargest2(k2, nums2);

        int k3 = 3;
        int[] nums3 = new int[]{1, 2, 3, 3};

        KthLargest2 obj3 = new KthLargest2(k3, nums3);


        System.out.print("[");
        System.out.print(obj1.add(3) + ", ");
        System.out.print(obj1.add(5) + ", ");
        System.out.print(obj1.add(10) + ", ");
        System.out.print(obj1.add(9) + ", ");
        System.out.print(obj1.add(4));
        System.out.print("]"); // A: [4, 5, 5, 8, 8]

        System.out.println();

        System.out.print("[");
        System.out.print(obj2.add(2) + ", ");
        System.out.print(obj2.add(10) + ", ");
        System.out.print(obj2.add(9) + ", ");
        System.out.print(obj2.add(9));
        System.out.print("]"); // A: [7, 7, 7, 8]

        System.out.println();

        System.out.print("[");
        System.out.print(obj3.add(3) + ", ");
        System.out.print(obj3.add(5) + ", ");
        System.out.print(obj3.add(6) + ", ");
        System.out.print(obj3.add(7) + ", ");
        System.out.print(obj3.add(8));
        System.out.print("]"); // A: [3, 3, 3, 5, 6]
    }
}
