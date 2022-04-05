package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenComparatorByDescName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("BCD", 5),
                new Job("ABC", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByAscName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("BCD", 5),
                new Job("ABC", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAscPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("BCD", 5),
                new Job("ABC", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByDescPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("BCD", 5),
                new Job("ABC", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByDescNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("ABCD", 3),
                new Job("ABCD", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByAscNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("BCD", 3),
                new Job("ABCD", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
