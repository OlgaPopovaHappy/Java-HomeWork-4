/* Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список. */

import java.util.LinkedList;

public class HW_4_1 {
    public static void main(String[] args) {

        int[] arrNums = {1, 2, 3, 4, 5, 6, 7};
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < arrNums.length+1; i++) {
            ll.add(i);
        }
        for (int i = 1; i < ll.size(); i++) {
            System.out.print(ll.size()-i + " ");
        }

    }
}