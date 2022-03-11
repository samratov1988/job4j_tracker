package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ItemDescByNameTest {

    @Test
    public void whenSortDescByName() {

        List<Item> items = Arrays.asList(
                new Item(2, "EFGH"),
                new Item(3, "IGKL"),
                new Item(1, "ABCD")
        );

        List<Item> expected = Arrays.asList(
                new Item(3, "IGKL"),
                new Item(2, "EFGH"),
                new Item(1, "ABCD")
        );

        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));
    }
}