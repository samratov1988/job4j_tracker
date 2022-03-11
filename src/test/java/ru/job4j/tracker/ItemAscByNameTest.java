package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ItemAscByNameTest {

    @Test
    public void whenSortAscByName() {

        List<Item> items = Arrays.asList(
                new Item(2, "EFGH"),
                new Item(1, "ABCD"),
                new Item(3, "IGKL")
        );

        List<Item> expected = Arrays.asList(
                new Item(1, "ABCD"),
                new Item(2, "EFGH"),
                new Item(3, "IGKL")
        );

        Collections.sort(items, new ItemAscByName());
        assertThat(items, is(expected));
    }
}