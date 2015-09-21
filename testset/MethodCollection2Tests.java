import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodCollection2;

public class MethodCollection2Tests extends TestClass {

    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodCollection2", function, args);
    }    

    @Test
    public void add_values_test() {
        //System.out.println("TEST: add_values");
        int[] orig = getIntArray();
        //int r1 = MethodCollection2.add_values(orig);

        assertTrue("add failure", testThis("add", "add_values", orig));
        assertTrue("mult failure", testThis("mult", "add_values", orig));
        assertTrue("exc failure", testThis("exc", "add_values", orig));
        assertTrue("inc failure", testThis("inc", "add_values", orig));
        assertTrue("perm failure", testThis("perm", "add_values", orig));
        assertTrue("inv failure", testThis("inv", "add_values", orig));
    }

    @Test
    public void bubble_test() {
        //System.out.println("TEST: bubble");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.bubble(orig);

        assertTrue("add failure", testThis("add", "bubble", orig));
        assertTrue("mult failure", testThis("mult", "bubble", orig));
        assertTrue("inv failure", testThis("inv", "bubble", orig));
    }

    @Test
    public void shell_sort_test() {
        //System.out.println("TEST: shell_sort");
	int[] arg1 = getIntArray();
        //int[] r1 = MethodCollection2.shell_sort(arg1);

        assertTrue("mult failure", testThis("mult", "shell_sort", arg1));
        assertTrue("inv failure", testThis("inv", "shell_sort", arg1));
    }

    //@Test
    public void sequential_search_test() {
        //System.out.println("TEST: sequential_search");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        //int r1 = MethodCollection2.sequential_search(arg1, arg2);

	assertTrue("exc failure", testThis("exc", "sequential_search", arg1, arg2));
	assertTrue("inc failure", testThis("inc", "sequential_search", arg1, arg2));
	assertTrue("perm failure", testThis("perm", "sequential_search", arg1, arg2));
    }

    @Test
    public void selection_sort_test() {
        //System.out.println("TEST: selection_sort");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.selection_sort(orig);

        assertTrue("add failure", testThis("add", "selection_sort", orig));
        assertTrue("mult failure", testThis("mult", "selection_sort", orig));
        assertTrue("inv failure", testThis("inv", "selection_sort", orig));
    }

    @Test
    public void dot_product_test() {
        //System.out.println("TEST: dot_product");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //int r1 = MethodCollection2.dot_product(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "dot_product", arg1, arg2));
        assertTrue("exc failure", testThis("exc", "dot_product", arg1, arg2));
        assertTrue("inc failure", testThis("inc", "dot_product", arg1, arg2));
    }

    //@Test
    public void array_calc1_test() {
        //System.out.println("TEST: array_calc1");
        int[] arg1 = getIntArray();
        int arg2 = getInt();
        //int[] r1 = MethodCollection2.array_calc1(arg1, arg2);

        assertTrue("add failure", testThis("add", "array_calc1", arg1, arg2));
    }

    @Test
    public void set_min_val_test() {
        //System.out.println("TEST: set_min_val");
        int[] arg1 = getIntArray();
        int arg2 = getInt();
        //int[] r1 = MethodCollection2.set_min_val(arg1, arg2);
        
        assertTrue("add failure", testThis("add", "set_min_val", arg1, arg2));
        assertTrue("mult failure", testThis("mult", "set_min_val", arg1, arg2));
        assertTrue("perm failure", testThis("perm", "set_min_val", arg1, arg2)); //okay to fail on original
        assertTrue("inv failure", testThis("inv", "set_min_val", arg1, arg2));
    }

    @Test
    public void find_min_test() {
        //System.out.println("TEST: find_min");
        int[] orig = getIntArray();
        //int r1 = MethodCollection2.find_min(orig);

        assertTrue("add failure", testThis("add", "find_min", orig)); //okay to fail on original
        assertTrue("mult failure", testThis("mult", "find_min", orig));
        assertTrue("inc failure", testThis("inc", "find_min", orig));
        assertTrue("perm failure", testThis("perm", "find_min", orig));
        assertTrue("inv failure", testThis("inv", "find_min", orig));
    }

    @Test
    public void array_copy_test() {
        //System.out.println("TEST: array_copy");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.array_copy(orig);

        assertTrue("add failure", testThis("add", "array_copy", orig));
        assertTrue("mult failure", testThis("mult", "array_copy", orig));
        assertTrue("inv failure", testThis("inv", "array_copy", orig));
    }

    @Test
    public void find_euc_dist_test() {
        //System.out.println("TEST: find_euc_dist");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //double r1 = MethodCollection2.find_euc_dist(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "find_euc_dist", arg1, arg2));
        assertTrue("exc failure", testThis("exc", "find_euc_dist", arg1, arg2));
        assertTrue("inc failure", testThis("inc", "find_euc_dist", arg1, arg2));
        assertTrue("inv failure", testThis("inv", "find_euc_dist", arg1, arg2));
    }

    @Test
    public void find_magnitude_test() {
        //System.out.println("TEST: find_magnitude");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.find_magnitude(orig);

        assertTrue("add failure", testThis("add", "find_magnitude", orig));
        assertTrue("mult failure", testThis("mult", "find_magnitude", orig));
        assertTrue("inc failure", testThis("inc", "find_magnitude", orig));
        assertTrue("inv failure", testThis("inv", "find_magnitude", orig));
    }

    @Test
    public void manhattan_dist_test() {
        //System.out.println("TEST: manhattan_dist");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //double r1 = MethodCollection2.manhattan_dist(arg1, arg2);

	assertTrue("mult failure", testThis("mult", "manhattan_dist", arg1, arg2));
	assertTrue("exc failure", testThis("exc", "manhattan_dist", arg1, arg2));
	assertTrue("inc failure", testThis("inc", "manhattan_dist", arg1, arg2));
	assertTrue("inv failure", testThis("inv", "manhattan_dist", arg1, arg2));
    }

    @Test
    public void average_test() {
        //System.out.println("TEST: average");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.average(orig);
   
        assertTrue("add failure", testThis("add", "average", orig));
        assertTrue("mult failure", testThis("mult", "average", orig));
        assertTrue("perm failure", testThis("perm", "average", orig));
        assertTrue("inv failure", testThis("inv", "average", orig));
    }

    @Test
    public void find_max_test() {
        //System.out.println("TEST: find_max");
        int[] orig = getIntArray();
        //int r1 = MethodCollection2.find_max(orig);

        assertTrue("add failure", testThis("add", "find_max", orig));
        assertTrue("mult failure", testThis("mult", "find_max", orig));
        assertTrue("perm failure", testThis("perm", "find_max", orig));
        assertTrue("inv failure", testThis("inv", "find_max", orig));
    }

    @Test
    public void find_max2_test() {
        //array should have at least 3 elements
        //System.out.println("TEST: find_max2");
        int[] orig = getIntArray(getInt() + 3);
        //int r1 = MethodCollection2.find_max2(orig);

        assertTrue("add failure", testThis("add", "find_max2", orig));
        assertTrue("mult failure", testThis("mult", "find_max2", orig));
        assertTrue("exc failure", testThis("exc", "find_max2", orig));
        assertTrue("inc failure", testThis("inc", "find_max2", orig));
        assertTrue("perm failure", testThis("perm", "find_max2", orig));
        assertTrue("inv failure", testThis("inv", "find_max2", orig));
    }

    @Test
    public void variance_test() {
        //System.out.println("TEST: variance");
        double[] orig = getDoubleArray();
        //double r1 = MethodCollection2.variance(orig);

        assertTrue("add failure", testThis("add", "variance", orig));
        assertTrue("mult failure", testThis("mult", "variance", orig));
        assertTrue("perm failure", testThis("perm", "variance", orig));
        assertTrue("inv failure", testThis("inv", "variance", orig));
    }

    @Test
    public void insertion_sort_test() {
        //System.out.println("TEST: insertion_sort");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.insertion_sort(orig);

        assertTrue("add failure", testThis("add", "insertion_sort", orig));
        assertTrue("mult failure", testThis("mult", "insertion_sort", orig));
        assertTrue("inv failure", testThis("inv", "insertion_sort", orig));
    }

    @Test
    public void geometric_mean_test() {
        //System.out.println("TEST: geometric_mean");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.geometric_mean(orig);

        assertTrue("add failure", testThis("add", "geometric_mean", orig));
        assertTrue("mult failure", testThis("mult", "geometric_mean", orig));
        assertTrue("exc failure", testThis("exc", "geometric_mean", orig));
        assertTrue("inc failure", testThis("inc", "geometric_mean", orig)); //okay to fail
        assertTrue("perm failure", testThis("perm", "geometric_mean", orig));
        assertTrue("inv failure", testThis("inv", "geometric_mean", orig));
    }

    @Test
    public void mean_absolute_error_test() {
        //System.out.println("TEST: mean_absolute_error");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //double r1 = MethodCollection2.mean_absolute_error(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "mean_absolute_error", arg1, arg2));
        assertTrue("inv failure", testThis("inv", "mean_absolute_error", arg1, arg2));
    }

    @Test
    public void find_median_test() {
        //System.out.println("TEST: find_median");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.find_median(orig);

        assertTrue("add failure", testThis("add", "find_median", orig));
        assertTrue("mult failure", testThis("mult", "find_median", orig));
        assertTrue("perm failure", testThis("perm", "find_median", orig));
        assertTrue("inv failure", testThis("inv", "find_median", orig));
    }

    @Test
    public void reverse_test() {
        //System.out.println("TEST: reverse");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.reverse(orig);
        
        assertTrue("add failure", testThis("add", "reverse", orig));
        assertTrue("mult failure", testThis("mult", "reverse", orig));
        assertTrue("inv failure", testThis("inv", "reverse", orig));
    }

    @Test
    public void weighted_average_test() {
        //System.out.println("TEST: weighted_average");
        //Arrays should be same size
        int arraySize = getInt();
        double[] orig1 = getDoubleArray(arraySize);
        double[] orig2 = getDoubleArray(arraySize);
        //double r1 = MethodCollection2.weighted_average(orig1, orig2);

        assertTrue("add failure", testThis("add", "weighted_average", orig1, orig2));
        assertTrue("mult failure", testThis("mult", "weighted_average", orig1, orig2));
    }

    //@Test
    public void count_k_test() {
        //System.out.println("TEST: count_k");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        //int r1 = MethodCollection2.count_k(arg1, arg2);

	assertTrue("exc failure", testThis("exc", "count_k", arg1, arg2));
	assertTrue("inc failure", testThis("inc", "count_k", arg1, arg2));
	assertTrue("perm failure", testThis("perm", "count_k", arg1, arg2));
    }

    @Test
    public void clip_test() {
        //System.out.println("TEST: clip");
        int[] orig = getIntArray();
        int secondArg = getInt();
        int thirdArg = getInt();
        //int[] r1 = MethodCollection2.clip(orig, secondArg, thirdArg);

        assertTrue("add failure", testThis("add", "clip", orig, secondArg, thirdArg));
        assertTrue("mult failure", testThis("mult", "clip", orig, secondArg, thirdArg));
        assertTrue("inv failure", testThis("inv", "clip", orig, secondArg, thirdArg));
    }

    @Test
    public void elementwise_max_test() {
        //System.out.println("TEST: elementwise_max");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //int[] r1 = MethodCollection2.elementwise_max(arg1, arg2);
	
	assertTrue("mult failure", testThis("mult", "elementwise_max", arg1, arg2));
    }

    @Test
    public void elementwise_min_test() {
        //System.out.println("TEST: elementwise_min");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //int[] r1 = MethodCollection2.elementwise_min(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "elementwise_min", arg1, arg2));
    }

    //@Test
    public void count_non_zeroes_test() {
        //System.out.println("TEST: count_non_zeroes");
	int[] arg1 = getIntArray();
        //int r1 = MethodCollection2.count_non_zeroes(arg1);

	assertTrue("exc failure", testThis("exc", "count_non_zeroes", arg1));
	assertTrue("inc failure", testThis("inc", "count_non_zeroes", arg1));
	assertTrue("perm failure", testThis("perm", "count_non_zeroes", arg1));
	assertTrue("inv failure", testThis("inv", "count_non_zeroes", arg1));
    }

    //@Test
    public void cnt_zeroes_test() {
        //System.out.println("TEST: cnt_zeroes");
	int[] arg1 = getIntArray();
        //int r1 = MethodCollection2.cnt_zeroes(arg1);

	assertTrue("exc failure", testThis("exc", "cnt_zeroes", arg1));
	assertTrue("inc failure", testThis("inc", "cnt_zeroes", arg1));
	assertTrue("perm failure", testThis("perm", "cnt_zeroes", arg1));
    }

    //@Test
    public void elementwise_equal_test() {
        //System.out.println("TEST: elementwise_equal");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //boolean[] r1 = MethodCollection2.elementwise_equal(arg1, arg2);

	assertTrue("inv failure", testThis("inv", "elementwise_equal", arg1, arg2));
    }

    @Test
    public void hamming_dist_test() {
        //System.out.println("TEST: hamming_dist");
        //Arrays should be same size
        int arraySize = getInt();
        int[] orig1 = getIntArray(arraySize);
        int[] orig2 = getIntArray(arraySize);
        //int r1 = MethodCollection2.hamming_dist(orig1, orig2);

        assertTrue("add failure", testThis("add", "hamming_dist", orig1, orig2));
        assertTrue("mult failure", testThis("mult", "hamming_dist", orig1, orig2));
        assertTrue("exc failure", testThis("exc", "hamming_dist", orig1, orig2));
        assertTrue("inc failure", testThis("inc", "hamming_dist", orig1, orig2));
        assertTrue("inv failure", testThis("inv", "hamming_dist", orig1, orig2));
    }

}
