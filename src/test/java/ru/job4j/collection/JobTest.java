package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortAscByName() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSortDescByName() {
        Comparator<Job> cmpNameDesc = new JobDescByName();
        int rsl = cmpNameDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortAscByPriority() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortDescByPriority() {
        Comparator<Job> cmpPriorityDesc = new JobDescByPriority();
        int rsl = cmpPriorityDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityDesc() {
        Comparator<Job> cmpNamePriorityDesc = new JobAscByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriorityDesc.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameDescAndPriorityDesc() {
        Comparator<Job> cmpNameDescPriorityDesc = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNameDescPriorityDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}