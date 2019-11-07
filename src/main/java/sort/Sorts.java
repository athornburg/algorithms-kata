package sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sorts {

    public static Integer[] mergeSort(Integer[] numbers, Integer low, Integer high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(numbers, low, middle);
            mergeSort(numbers, middle + 1, low);
            merge(numbers, low, middle, high);
        }

        return numbers;
    }

    private static void merge(Integer[] numbers, Integer low, Integer middle, Integer high) {
        Queue<Integer> buffer1 = new PriorityQueue<>(Arrays.asList(numbers).subList(low, middle + 1));
        Queue<Integer> buffer2 = new PriorityQueue<>(Arrays.asList(numbers).subList(middle + 1, high + 1));

        int i = low;
        while (!(buffer1.isEmpty() || buffer2.isEmpty())) {
            if (buffer1.peek() <= buffer2.peek()) {
                numbers[i++] = buffer1.poll();
            } else {
                numbers[i++] = buffer2.poll();
            }
        }

        while (!buffer1.isEmpty()) {
            numbers[i++] = buffer1.poll();
        }

        while (!buffer2.isEmpty()) {
            numbers[i++] = buffer2.poll();
        }
    }
}
