package Question4;//
////Given a linked list containing an integer value, return the number of steps required to sort an array in
////        ascending order by eliminating elements at each step


import java.util.Arrays;
import java.util.LinkedList;

 class LinkedListSortSteps {

    public static int getSortSteps(LinkedList<Integer> list) {
        int steps = 0;
        boolean changed = true;

        while (changed) {
            changed = false;
            int i = 1;
            while (i < list.size()) {
                if (list.get(i - 1) > list.get(i)) {
                    list.remove(i);
                    changed = true;
                } else {
                    i++;
                }
            }
            if (changed) {
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 5, 2, 1, 4));
        int steps = getSortSteps(list);
        System.out.println("Number of steps required: " + steps);
    }
}