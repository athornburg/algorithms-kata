package sort;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static sort.Sorts.mergeSort;

public class SortsTest {

    @Test
    public void mergeSort_sortsTheArray() {
        List<Integer> numbers = asList(5, 3, 7, 9, 1, 100, 5, 99, 600, 20, 8);
        Integer[] list = mergeSort(numbers.toArray(new Integer[11]), 0, numbers.size() - 1);

        assertThat(asList(1, 3, 5, 5, 7, 8, 9, 20, 99, 100, 600).toArray(new Integer[11]))
                .isEqualTo(list);
    }
}
