package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults1() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenLinearFunctionThenLinearResults2() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(0, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(1D, 3D, 5D, 7D, 9D, 11D, 13D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenLinearFunctionThenLinearResults3() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(-8, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(-15D, -13D, -11D, -9D, -7D, -5D, -3D,
                                                -1D, 1D, 3D, 5D, 7D, 9D, 11D, 13D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults1() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x * x + 3 * x + 4);
        List<Double> expected = Arrays.asList(69D, 94D, 123D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults2() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(-8, 8, x -> 2 * x * x + 3 * x + 4);
        List<Double> expected = Arrays.asList(108D, 81D, 58D, 39D, 24D, 13D, 6D, 3D,
                                                4D, 9D, 18D, 31D, 48D, 69D, 94D, 123D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults3() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(0, 8, x -> 2 * x * x + 3 * x + 4);
        List<Double> expected = Arrays.asList(4D, 9D, 18D, 31D, 48D, 69D, 94D, 123D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenDemonstrationFunctionThenDemonstrationResults1() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenDemonstrationFunctionThenDemonstrationResults2() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(0, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(1D, 2D, 4D, 8D, 16D, 32D, 64D, 128D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenDemonstrationFunctionThenDemonstrationResults3() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(-8, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(0.00390625, 0.0078125, 0.015625, 0.03125,
                                                0.0625, 0.125, 0.25, 0.5, 1D, 2D,
                                                4D, 8D, 16D, 32D, 64D, 128D);
        assertThat(result).containsAll(expected);
    }
}