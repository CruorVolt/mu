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
        int constant = getInt();
        int[] mod = add(orig, constant);
        int out = MethodCollection2.add_values(mod);
        assertTrue(addTest(r1,out));
        
    }

    @Test
    public void add_two_array_values_test() {
        System.out.println("TEST: add_two_array_values");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
	int arg3 = getInt();
        double r1 = MethodCollection2.add_two_array_values(arg1, arg2, arg3);
    }

    @Test
    public void bubble_test() {
        System.out.println("TEST: bubble");
        int[] orig = getIntArray();
        int[] r1 = MethodCollection2.bubble(orig);

        //add
        int constant = getInt();
        int[] addIn = add(orig, constant);
        int[] addOut = MethodCollection2.bubble(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void shell_sort_test() {
        System.out.println("TEST: shell_sort");
	int[] arg1 = getIntArray();
        int[] r1 = MethodCollection2.shell_sort(arg1);

        //mult
        int m = getInt();
        int[] m1 = mult(arg1, m);
        int[] multOut = MethodCollection2.shell_sort(m1);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void sequential_search_test() {
        System.out.println("TEST: sequential_search");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        int r1 = MethodCollection2.sequential_search(arg1, arg2);
    }

    @Test
    public void selection_sort_test() {
        System.out.println("TEST: selection_sort");
        int[] orig = getIntArray();
        int[] r1 = MethodCollection2.selection_sort(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int[] addOut = MethodCollection2.selection_sort(addIn);
        assertTrue("add failure", addTest(r1, addOut));

        //mult
        int m = getInt();
        int[] m1 = mult(orig, m);
        int[] multOut = MethodCollection2.selection_sort(m1);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void add_values_in_two_arrays_test() {
        System.out.println("TEST: add_values_in_two_arrays");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
	int arg3 = getInt();
        int r1 = MethodCollection2.add_values_in_two_arrays(arg1, arg2, arg3);
    }

    @Test
    public void dot_product_test() {
        System.out.println("TEST: dot_product");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        int r1 = MethodCollection2.dot_product(arg1, arg2);

        //mult
        int m = getInt();
        int[] m1 = mult(arg1, m);
        int[] m2 = mult(arg2, m);
        int multOut = MethodCollection2.dot_product(m1, m2);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void array_calc1_test() {
        System.out.println("TEST: array_calc1");
        int[] arg1 = getIntArray();
        int arg2 = getInt();
        int[] r1 = MethodCollection2.array_calc1(arg1, arg2);

        //add
        int c = getInt();
        int[] a1 = add(arg1, c);
        int a2 = add(arg2, c);
        int[] addOut = MethodCollection2.array_calc1(a1, a2);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void set_min_val_test() {
        System.out.println("TEST: set_min_val");
        int[] arg1 = getIntArray();
        int arg2 = getInt();
        int[] r1 = MethodCollection2.set_min_val(arg1, arg2);
        
        //add
        int c = getInt();
        int[] a1 = add(arg1, c);
        int a2 = add(arg2, c);
        int[] addOut = MethodCollection2.set_min_val(a1, a2);
        assertTrue("add failure", addTest(r1, addOut));
        
        //mult
        int m = getInt();
        int[] m1 = mult(arg1, m);
        int m2 = mult(arg2, m);
        int[] multOut = MethodCollection2.set_min_val(m1, m2);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void get_array_value_test() {
        System.out.println("TEST: get_array_value");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        int r1 = MethodCollection2.get_array_value(arg1, arg2);
        assertTrue("SHOULD BE TRUE", true);
    }

    @Test
    public void find_min_test() {
        System.out.println("TEST: find_min");
        int[] orig = getIntArray();
        int r1 = MethodCollection2.find_min(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int addOut = MethodCollection2.find_min(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void find_diff_test() {
        System.out.println("TEST: find_diff");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        int[] r1 = MethodCollection2.find_diff(arg1, arg2);
    }

    @Test
    public void array_copy_test() {
        System.out.println("TEST: array_copy");
        int[] orig = getIntArray();
        int[] r1 = MethodCollection2.array_copy(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int[] addOut = MethodCollection2.array_copy(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void find_euc_dist_test() {
        System.out.println("TEST: find_euc_dist");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        double r1 = MethodCollection2.find_euc_dist(arg1, arg2);

        //mult
        int m = getInt();
	int[] m1 = mult(arg1, m);
	int[] m2 = mult(arg2, m);
        double multOut = MethodCollection2.find_euc_dist(m1, m2);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void find_magnitude_test() {
        System.out.println("TEST: find_magnitude");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.find_magnitude(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        double addOut = MethodCollection2.find_magnitude(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void manhattan_dist_test() {
        System.out.println("TEST: manhattan_dist");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        double r1 = MethodCollection2.manhattan_dist(arg1, arg2);
    }

    @Test
    public void average_test() {
        System.out.println("TEST: average");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.average(orig);
   
        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        double addOut = MethodCollection2.average(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void dec_array_test() {
        System.out.println("TEST: dec_array");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        int[] r1 = MethodCollection2.dec_array(arg1, arg2);
    }

    @Test
    public void expr1_test() {
        System.out.println("TEST: expr1");
        //First arg should be nonzero
	double arg1 = getDouble();
	double arg2 = getDouble();
        double r1 = MethodCollection2.expr1(arg1, arg2);
    }

    @Test
    public void find_max_test() {
        System.out.println("TEST: find_max");
        int[] orig = getIntArray();
        int r1 = MethodCollection2.find_max(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int addOut = MethodCollection2.find_max(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void find_max2_test() {
        System.out.println("TEST: find_max2");
        int[] orig = getIntArray();
        int r1 = MethodCollection2.find_max2(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int addOut = MethodCollection2.find_max2(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void variance_test() {
        System.out.println("TEST: variance");
        double[] orig = getDoubleArray();
        double r1 = MethodCollection2.variance(orig);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodCollection2.variance(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void insertion_sort_test() {
        System.out.println("TEST: insertion_sort");
        int[] orig = getIntArray();
        int[] r1 = MethodCollection2.insertion_sort(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int[] addOut = MethodCollection2.insertion_sort(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void geometric_mean_test() {
        System.out.println("TEST: geometric_mean");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.geometric_mean(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        double addOut = MethodCollection2.geometric_mean(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void mean_absolute_error_test() {
        System.out.println("TEST: mean_absolute_error");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        double r1 = MethodCollection2.mean_absolute_error(arg1, arg2);

        //mult
        int m = getInt();
	int[] m1 = mult(arg1, m);
	int[] m2 = mult(arg2, m);
        double multOut = MethodCollection2.mean_absolute_error(m1,m2);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void find_median_test() {
        System.out.println("TEST: find_median");
        int[] orig = getIntArray();
        double r1 = MethodCollection2.find_median(orig);

        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        double addOut = MethodCollection2.find_median(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void cartesian_product_test() {
        //This method can be quite slow - use smaller inputs
        System.out.println("TEST: cartesian_product");
	int[] arg1 = getIntArray(MAX/10);
	int[] arg2 = getIntArray(MAX/10);
        int[][] r1 = MethodCollection2.cartesian_product(arg1, arg2);
    }

    @Test
    public void reverse_test() {
        System.out.println("TEST: reverse");
        int[] orig = getIntArray();
        int[] r1 = MethodCollection2.reverse(orig);
        
        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int[] addOut = MethodCollection2.reverse(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void check_equal_tolerance_test() {
        System.out.println("TEST: check_equal_tolerance");
        //most execution paths require same size arrays
        int arraySize = getInt();
	double[] arg1 = getDoubleArray(arraySize);
	double[] arg2 = getDoubleArray(arraySize);
	double arg3 = getDouble();
        boolean r1 = MethodCollection2.check_equal_tolerance(arg1, arg2, arg3);
    }

    @Test
    public void check_equal_test() {
        System.out.println("TEST: check_equal");
        //most execution paths require same size arrays
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        boolean r1 = MethodCollection2.check_equal(arg1, arg2);
    }

    @Test
    public void weighted_average_test() {
        System.out.println("TEST: weighted_average");
        //Arrays should be same size
        int arraySize = getInt();
        double[] orig1 = getDoubleArray(arraySize);
        double[] orig2 = getDoubleArray(arraySize);
        double r1 = MethodCollection2.weighted_average(orig1, orig2);

        //add
        int c = getInt();
        double[] addIn1 = add(orig1, c);
        double[] addIn2 = add(orig2, c);
        double addOut = MethodCollection2.weighted_average(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void count_k_test() {
        System.out.println("TEST: count_k");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        int r1 = MethodCollection2.count_k(arg1, arg2);
    }

    @Test
    public void clip_test() {
        System.out.println("TEST: clip");
        int[] orig = getIntArray();
        int secondArg = getInt();
        int thirdArg = getInt();
        int[] r1 = MethodCollection2.clip(orig, secondArg, thirdArg);

        //add
        int c = getInt();
        int[] addIn1 = add(orig, c);
        int addIn2 = add(secondArg, c);
        int addIn3 = add(thirdArg, c);
        int[] addOut = MethodCollection2.clip(addIn1, addIn2, addIn3);
        assertTrue("add failure", addTest(r1, addOut));

        //mult
        int m = getInt();
        int[] m1 = mult(orig, m);
        int m2 = mult(secondArg, m);
        int m3 = mult(thirdArg, m);
        int[] multOut = MethodCollection2.clip(m1, m2, m3);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void elementwise_max_test() {
        System.out.println("TEST: elementwise_max");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        int[] r1 = MethodCollection2.elementwise_max(arg1, arg2);
    }

    @Test
    public void elementwise_min_test() {
        System.out.println("TEST: elementwise_min");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        int[] r1 = MethodCollection2.elementwise_min(arg1, arg2);

        //mult
        int m = getInt();
	int[] m1 = mult(arg1, m);
	int[] m2 = mult(arg2, m);
        int[] multOut = MethodCollection2.elementwise_min(m1, m2);
        assertTrue("mult failure", multTest(r1, multOut));
    }

    @Test
    public void count_non_zeroes_test() {
        System.out.println("TEST: count_non_zeroes");
	int[] arg1 = getIntArray();
        int r1 = MethodCollection2.count_non_zeroes(arg1);
    }

    @Test
    public void cnt_zeroes_test() {
        System.out.println("TEST: cnt_zeroes");
	int[] arg1 = getIntArray();
        int r1 = MethodCollection2.cnt_zeroes(arg1);
    }

    @Test
    public void elementwise_equal_test() {
        System.out.println("TEST: elementwise_equal");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        boolean[] r1 = MethodCollection2.elementwise_equal(arg1, arg2);
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
        //int c = getInt();
        //int[] addIn1 = add(orig1, c);
        //int[] addIn2 = add(orig2, c);
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
        int c = getInt();
        int[] addIn1 = add(orig1, c);
        int[] addIn2 = add(orig2, c);
        int addOut = MethodCollection2.hamming_dist(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));

        //mult
        int m = getInt();
        int[] m1 = add(orig1, m);
        int[] m2 = add(orig2, m);
        int multOut = MethodCollection2.hamming_dist(m1, m2);
        assertTrue("mult failure", addTest(r1, multOut));
    }

}
