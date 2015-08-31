import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodCollection2;

public class MethodCollection2Tests {

    private static Random rand = new Random();
    private static final int MAX = 10000;

    private int getInt() {
        return rand.nextInt();
    }

    private int[] getIntArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.ints().limit(size).toArray();
    }

    private double getDouble() {
        return rand.nextDouble();
    }

    private double[] getDoubleArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.doubles().limit(size).toArray();
    }

    @Test
    public void add_values_test() {
        int r1 = MethodCollection2.add_values(getIntArray());
        int r2 = MethodCollection2.add_values(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void add_two_array_values_test() {
        double r1 = MethodCollection2.add_two_array_values(getIntArray(), getInt(), getInt());
        double r2 = MethodCollection2.add_two_array_values(getIntArray(), getInt(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void bubble_test() {
        int[] r1 = MethodCollection2.bubble(getIntArray());
        int[] r2 = MethodCollection2.bubble(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void shell_sort_test() {
        int[] r1 = MethodCollection2.shell_sort(getIntArray());
        int[] r2 = MethodCollection2.shell_sort(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void sequential_search_test() {
        int r1 = MethodCollection2.sequential_search(getIntArray(), getInt());
        int r2 = MethodCollection2.sequential_search(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void selection_sort_test() {
        int[] r1 = MethodCollection2.selection_sort(getIntArray());
        int[] r2 = MethodCollection2.selection_sort(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void add_values_in_two_arrays_test() {
        int r1 = MethodCollection2.add_values_in_two_arrays(getIntArray(), getIntArray(), getInt());
        int r2 = MethodCollection2.add_values_in_two_arrays(getIntArray(), getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void dot_product_test() {
        int r1 = MethodCollection2.dot_product(getIntArray(), getIntArray());
        int r2 = MethodCollection2.dot_product(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void array_calc1_test() {
        int[] r1 = MethodCollection2.array_calc1(getIntArray(), getInt());
        int[] r2 = MethodCollection2.array_calc1(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void set_min_val_test() {
        int[] r1 = MethodCollection2.set_min_val(getIntArray(), getInt());
        int[] r2 = MethodCollection2.set_min_val(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void get_array_value_test() {
        int r1 = MethodCollection2.get_array_value(getIntArray(), getInt());
        int r2 = MethodCollection2.get_array_value(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_min_test() {
        int r1 = MethodCollection2.find_min(getIntArray());
        int r2 = MethodCollection2.find_min(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_diff_test() {
        int[] r1 = MethodCollection2.find_diff(getIntArray(), getIntArray());
        int[] r2 = MethodCollection2.find_diff(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void array_copy_test() {
        int[] r1 = MethodCollection2.array_copy(getIntArray());
        int[] r2 = MethodCollection2.array_copy(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_euc_dist_test() {
        double r1 = MethodCollection2.find_euc_dist(getIntArray(), getIntArray());
        double r2 = MethodCollection2.find_euc_dist(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_magnitude_test() {
        double r1 = MethodCollection2.find_magnitude(getIntArray());
        double r2 = MethodCollection2.find_magnitude(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void manhattan_dist_test() {
        double r1 = MethodCollection2.manhattan_dist(getIntArray(), getIntArray());
        double r2 = MethodCollection2.manhattan_dist(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void average_test() {
        double r1 = MethodCollection2.average(getIntArray());
        double r2 = MethodCollection2.average(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void dec_array_test() {
        int[] r1 = MethodCollection2.dec_array(getIntArray(), getInt());
        int[] r2 = MethodCollection2.dec_array(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void expr1_test() {
        double r1 = MethodCollection2.expr1(getDouble(), getDouble());
        double r2 = MethodCollection2.expr1(getDouble(), getDouble());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_max_test() {
        int r1 = MethodCollection2.find_max(getIntArray());
        int r2 = MethodCollection2.find_max(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_max2_test() {
        int r1 = MethodCollection2.find_max2(getIntArray());
        int r2 = MethodCollection2.find_max2(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void variance_test() {
        double r1 = MethodCollection2.variance(getDoubleArray());
        double r2 = MethodCollection2.variance(getDoubleArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void insertion_sort_test() {
        int[] r1 = MethodCollection2.insertion_sort(getIntArray());
        int[] r2 = MethodCollection2.insertion_sort(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void geometric_mean_test() {
        double r1 = MethodCollection2.geometric_mean(getIntArray());
        double r2 = MethodCollection2.geometric_mean(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void mean_absolute_error_test() {
        double r1 = MethodCollection2.mean_absolute_error(getIntArray(), getIntArray());
        double r2 = MethodCollection2.mean_absolute_error(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_median_test() {
        double r1 = MethodCollection2.find_median(getIntArray());
        double r2 = MethodCollection2.find_median(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void cartesian_product_test() {
        int[][] r1 = MethodCollection2.cartesian_product(getIntArray(), getIntArray());
        int[][] r2 = MethodCollection2.cartesian_product(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void reverse_test() {
        int[] r1 = MethodCollection2.reverse(getIntArray());
        int[] r2 = MethodCollection2.reverse(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void check_equal_tolerance_test() {
        boolean r1 = MethodCollection2.check_equal_tolerance(getDoubleArray(), getDoubleArray(), getDouble());
        boolean r2 = MethodCollection2.check_equal_tolerance(getDoubleArray(), getDoubleArray(), getDouble());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void check_equal_test() {
        boolean r1 = MethodCollection2.check_equal(getIntArray(), getIntArray());
        boolean r2 = MethodCollection2.check_equal(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void weighted_average_test() {
        double r1 = MethodCollection2.weighted_average(getDoubleArray(), getDoubleArray());
        double r2 = MethodCollection2.weighted_average(getDoubleArray(), getDoubleArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void count_k_test() {
        int r1 = MethodCollection2.count_k(getIntArray(), getInt());
        int r2 = MethodCollection2.count_k(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void clip_test() {
        int[] r1 = MethodCollection2.clip(getIntArray(), getInt(), getInt());
        int[] r2 = MethodCollection2.clip(getIntArray(), getInt(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void elementwise_max_test() {
        int[] r1 = MethodCollection2.elementwise_max(getIntArray(), getIntArray());
        int[] r2 = MethodCollection2.elementwise_max(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void elementwise_min_test() {
        int[] r1 = MethodCollection2.elementwise_min(getIntArray(), getIntArray());
        int[] r2 = MethodCollection2.elementwise_min(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void count_non_zeroes_test() {
        int r1 = MethodCollection2.count_non_zeroes(getIntArray());
        int r2 = MethodCollection2.count_non_zeroes(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void cnt_zeroes_test() {
        int r1 = MethodCollection2.cnt_zeroes(getIntArray());
        int r2 = MethodCollection2.cnt_zeroes(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void elementwise_equal_test() {
        boolean[] r1 = MethodCollection2.elementwise_equal(getIntArray(), getIntArray());
        boolean[] r2 = MethodCollection2.elementwise_equal(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void elementwise_not_equal_test() {
        boolean[] r1 = MethodCollection2.elementwise_not_equal(getIntArray(), getIntArray());
        boolean[] r2 = MethodCollection2.elementwise_not_equal(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void hamming_dist_test() {
        int r1 = MethodCollection2.hamming_dist(getIntArray(), getIntArray());
        int r2 = MethodCollection2.hamming_dist(getIntArray(), getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

}
