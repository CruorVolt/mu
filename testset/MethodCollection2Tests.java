import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodCollection2;

public class MethodCollection2Tests extends TestClass {

    @Test
    public void add_values_test() {
        System.out.println("TEST: add_values");
        int[] orig = getIntArray();
        int r1 = MethodCollection2.add_values(orig);

        //add
        int[] mod = add(orig);
        int out = MethodCollection2.add_values(mod);
        assertTrue(addTest(r1,out));
        
    }

    @Test
    public void add_two_array_values_test() {
        System.out.println("TEST: add_two_array_values");
        double r1 = MethodCollection2.add_two_array_values(getIntArray(), getInt(), getInt());
        double r2 = MethodCollection2.add_two_array_values(getIntArray(), getInt(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void bubble_test() {
        System.out.println("TEST: bubble");
        int[] orig = getIntArray();
        int[] r1 = MethodCollection2.bubble(orig);

        //add
        int[] addIn = add(orig);
        int[] addOut = MethodCollection2.bubble(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void shell_sort_test() {
        System.out.println("TEST: shell_sort");
        int[] r1 = MethodCollection2.shell_sort(getIntArray());
        int[] r2 = MethodCollection2.shell_sort(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void sequential_search_test() {
        System.out.println("TEST: sequential_search");
        int r1 = MethodCollection2.sequential_search(getIntArray(), getInt());
        int r2 = MethodCollection2.sequential_search(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void selection_sort_test() {
        System.out.println("TEST: selection_sort");
        int[] orig = getIntArray();
        int[] r1 = MethodCollection2.selection_sort(orig);

        //add
        int[] addIn = add(orig);
        int[] addOut = MethodCollection2.selection_sort(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void add_values_in_two_arrays_test() {
        System.out.println("TEST: add_values_in_two_arrays");
        //Arrays should be same size
        int arraySize = getInt();
        int r1 = MethodCollection2.add_values_in_two_arrays(getIntArray(arraySize), getIntArray(arraySize), getInt());
        int r2 = MethodCollection2.add_values_in_two_arrays(getIntArray(arraySize), getIntArray(arraySize), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void dot_product_test() {
        System.out.println("TEST: dot_product");
        //Arrays should be same size
        int arraySize = getInt();
        int r1 = MethodCollection2.dot_product(getIntArray(arraySize), getIntArray(arraySize));
        int r2 = MethodCollection2.dot_product(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void array_calc1_test() {
        System.out.println("TEST: array_calc1");
        int[] r1 = MethodCollection2.array_calc1(getIntArray(), getInt());
        int[] r2 = MethodCollection2.array_calc1(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void set_min_val_test() {
        System.out.println("TEST: set_min_val");
        int[] r1 = MethodCollection2.set_min_val(getIntArray(), getInt());
        int[] r2 = MethodCollection2.set_min_val(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void get_array_value_test() {
        System.out.println("TEST: get_array_value");
        int r1 = MethodCollection2.get_array_value(getIntArray(), getInt());
        int r2 = MethodCollection2.get_array_value(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_min_test() {
        System.out.println("TEST: find_min");
        int r1 = MethodCollection2.find_min(getIntArray());
        int r2 = MethodCollection2.find_min(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_diff_test() {
        System.out.println("TEST: find_diff");
        //Arrays should be same size
        int arraySize = getInt();
        int[] r1 = MethodCollection2.find_diff(getIntArray(arraySize), getIntArray(arraySize));
        int[] r2 = MethodCollection2.find_diff(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void array_copy_test() {
        System.out.println("TEST: array_copy");
        int[] r1 = MethodCollection2.array_copy(getIntArray());
        int[] r2 = MethodCollection2.array_copy(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_euc_dist_test() {
        System.out.println("TEST: find_euc_dist");
        //Arrays should be same size
        int arraySize = getInt();
        double r1 = MethodCollection2.find_euc_dist(getIntArray(arraySize), getIntArray(arraySize));
        double r2 = MethodCollection2.find_euc_dist(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_magnitude_test() {
        System.out.println("TEST: find_magnitude");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.find_magnitude(orig);

        //add
        int[] addIn = add(orig);
        double addOut = MethodCollection2.find_magnitude(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void manhattan_dist_test() {
        System.out.println("TEST: manhattan_dist");
        //Arrays should be same size
        int arraySize = getInt();
        double r1 = MethodCollection2.manhattan_dist(getIntArray(arraySize), getIntArray(arraySize));
        double r2 = MethodCollection2.manhattan_dist(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void average_test() {
        System.out.println("TEST: average");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.average(orig);
   
        //add
        int[] addIn = add(orig);
        double addOut = MethodCollection2.average(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void dec_array_test() {
        System.out.println("TEST: dec_array");
        int[] r1 = MethodCollection2.dec_array(getIntArray(), getInt());
        int[] r2 = MethodCollection2.dec_array(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void expr1_test() {
        System.out.println("TEST: expr1");
        //First arg should be nonzero
        double r1 = MethodCollection2.expr1(getDouble(), getDouble());
        double r2 = MethodCollection2.expr1(getDouble(), getDouble());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_max_test() {
        System.out.println("TEST: find_max");
        int[] orig = getIntArray();
        int r1 = MethodCollection2.find_max(orig);

        //add
        int[] addIn = add(orig);
        int addOut = MethodCollection2.find_max(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void find_max2_test() {
        System.out.println("TEST: find_max2");
        int[] orig = getIntArray();
        int r1 = MethodCollection2.find_max2(orig);

        //add
        int[] addIn = add(orig);
        int addOut = MethodCollection2.find_max2(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void variance_test() {
        System.out.println("TEST: variance");
        double r1 = MethodCollection2.variance(getDoubleArray());
        double r2 = MethodCollection2.variance(getDoubleArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void insertion_sort_test() {
        System.out.println("TEST: insertion_sort");
        int[] r1 = MethodCollection2.insertion_sort(getIntArray());
        int[] r2 = MethodCollection2.insertion_sort(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void geometric_mean_test() {
        System.out.println("TEST: geometric_mean");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.geometric_mean(orig);

        //add
        int[] addIn = add(orig);
        double addOut = MethodCollection2.geometric_mean(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void mean_absolute_error_test() {
        System.out.println("TEST: mean_absolute_error");
        //Arrays should be same size
        int arraySize = getInt();
        double r1 = MethodCollection2.mean_absolute_error(getIntArray(arraySize), getIntArray(arraySize));
        double r2 = MethodCollection2.mean_absolute_error(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_median_test() {
        System.out.println("TEST: find_median");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.find_median(orig);

        //add
        int[] addIn = add(orig);
        double addOut = MethodCollection2.find_median(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void cartesian_product_test() {
        //This method can be quite slow - use smaller inputs
        System.out.println("TEST: cartesian_product");
        int[][] r1 = MethodCollection2.cartesian_product(getIntArray(MAX/10), getIntArray(MAX/10));
        int[][] r2 = MethodCollection2.cartesian_product(getIntArray(MAX/10), getIntArray(MAX/10));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void reverse_test() {
        System.out.println("TEST: reverse");
        int[] r1 = MethodCollection2.reverse(getIntArray());
        int[] r2 = MethodCollection2.reverse(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void check_equal_tolerance_test() {
        System.out.println("TEST: check_equal_tolerance");
        //most execution paths require same size arrays
        int arraySize = getInt();
        boolean r1 = MethodCollection2.check_equal_tolerance(getDoubleArray(arraySize), getDoubleArray(arraySize), getDouble());
        boolean r2 = MethodCollection2.check_equal_tolerance(getDoubleArray(arraySize), getDoubleArray(arraySize), getDouble());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void check_equal_test() {
        System.out.println("TEST: check_equal");
        //most execution paths require same size arrays
        int arraySize = getInt();
        boolean r1 = MethodCollection2.check_equal(getIntArray(arraySize), getIntArray(arraySize));
        boolean r2 = MethodCollection2.check_equal(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void weighted_average_test() {
        System.out.println("TEST: weighted_average");
        //Arrays should be same size
        int arraySize = getInt();
        double r1 = MethodCollection2.weighted_average(getDoubleArray(arraySize), getDoubleArray(arraySize));
        double r2 = MethodCollection2.weighted_average(getDoubleArray(arraySize), getDoubleArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void count_k_test() {
        System.out.println("TEST: count_k");
        int r1 = MethodCollection2.count_k(getIntArray(), getInt());
        int r2 = MethodCollection2.count_k(getIntArray(), getInt());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void clip_test() {
        System.out.println("TEST: clip");
        int[] orig = getIntArray();
        int secondArg = getInt();
        int thirdArg = getInt();
        int[] r1 = MethodCollection2.clip(orig, secondArg, thirdArg);

        //add
        int[] addIn = add(orig);
        int[] addOut = MethodCollection2.clip(addIn, secondArg, thirdArg);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void elementwise_max_test() {
        System.out.println("TEST: elementwise_max");
        //Arrays should be same size
        int arraySize = getInt();
        int[] r1 = MethodCollection2.elementwise_max(getIntArray(arraySize), getIntArray(arraySize));
        int[] r2 = MethodCollection2.elementwise_max(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void elementwise_min_test() {
        System.out.println("TEST: elementwise_min");
        //Arrays should be same size
        int arraySize = getInt();
        int[] r1 = MethodCollection2.elementwise_min(getIntArray(arraySize), getIntArray(arraySize));
        int[] r2 = MethodCollection2.elementwise_min(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void count_non_zeroes_test() {
        System.out.println("TEST: count_non_zeroes");
        int r1 = MethodCollection2.count_non_zeroes(getIntArray());
        int r2 = MethodCollection2.count_non_zeroes(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void cnt_zeroes_test() {
        System.out.println("TEST: cnt_zeroes");
        int r1 = MethodCollection2.cnt_zeroes(getIntArray());
        int r2 = MethodCollection2.cnt_zeroes(getIntArray());
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void elementwise_equal_test() {
        System.out.println("TEST: elementwise_equal");
        //Arrays should be same size
        int arraySize = getInt();
        boolean[] r1 = MethodCollection2.elementwise_equal(getIntArray(arraySize), getIntArray(arraySize));
        boolean[] r2 = MethodCollection2.elementwise_equal(getIntArray(arraySize), getIntArray(arraySize));
        assertTrue("SHOULD BE TRUE", true);
    }

    /*
    @Test
    public void elementwise_not_equal_test() {
        System.out.println("TEST: elementwise_not_equal");
        //Arrays should be same size
        int arraySize = getInt();
        int[] orig1 = getIntArray(arraySize);
        int[] orig2 = getIntArray(arraySize);
        boolean[] r1 = MethodCollection2.elementwise_not_equal(orig1, orig2);

        //add - does this make any sense?
        //int[] addIn1 = add(orig1);
        //int[] addIn2 = add(orig2);
        //boolean[] addOut = MethodCollection2.elementwise_not_equal(addIn1, addIn2);
        //assertTrue("add failure", r1, addOut);

    }
    */

    @Test
    public void hamming_dist_test() {
        System.out.println("TEST: hamming_dist");
        //Arrays should be same size
        int arraySize = getInt();
        int[] orig1 = getIntArray(arraySize);
        int[] orig2 = getIntArray(arraySize);
        int r1 = MethodCollection2.hamming_dist(orig1, orig2);

        //add
        int[] addIn1 = add(orig1);
        int[] addIn2 = add(orig2);
        int addOut = MethodCollection2.hamming_dist(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));
    }

}
