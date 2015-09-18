import org.junit.*;
import static org.junit.Assert.*;
import Test.MethodCollection2;

public class MethodCollection2Tests extends TestClass {

    public static int[] find_max_arr;

    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodCollection2", function, args);
    }

    @Test
    public void add_values_test() {
        //int r1 = MethodCollection2.add_values(orig);

        assertTrue("add failure", testThis("add", "add_values", iarr1));
        assertTrue("mult failure", testThis("mult", "add_values", iarr1));
        assertTrue("exc failure", testThis("exc", "add_values", iarr1));
        assertTrue("inc failure", testThis("inc", "add_values", iarr1));
        assertTrue("perm failure", testThis("perm", "add_values", iarr1));
        assertTrue("inv failure", testThis("inv", "add_values", iarr1));
    }

    @Test
    public void bubble_test() {
        //int[] r1 = MethodCollection2.bubble(orig);

        assertTrue("add failure", testThis("add", "bubble", iarr1));
        assertTrue("mult failure", testThis("mult", "bubble", iarr1));
        assertTrue("inv failure", testThis("inv", "bubble", iarr1));
    }

    @Test
    public void shell_sort_test() {
        //int[] r1 = MethodCollection2.shell_sort(arg1);

        assertTrue("mult failure", testThis("mult", "shell_sort", iarr1));
        assertTrue("inv failure", testThis("inv", "shell_sort", iarr1));
    }

    //@Test
    public void sequential_search_test() {
        //int r1 = MethodCollection2.sequential_search(arg1, arg2);

	assertTrue("exc failure", testThis("exc", "sequential_search", iarr1, iarg1));
	assertTrue("inc failure", testThis("inc", "sequential_search", iarr1, iarg1));
	assertTrue("perm failure", testThis("perm", "sequential_search", iarr1, iarg1));
    }

    @Test
    public void selection_sort_test() {
        //int[] r1 = MethodCollection2.selection_sort(orig);

        assertTrue("add failure", testThis("add", "selection_sort", iarr1));
        assertTrue("mult failure", testThis("mult", "selection_sort", iarr1));
        assertTrue("inv failure", testThis("inv", "selection_sort", iarr1));
    }

    @Test
    public void dot_product_test() {
        //Arrays should be same size
        //int r1 = MethodCollection2.dot_product(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "dot_product", ipair1, ipair2));
        assertTrue("exc failure", testThis("exc", "dot_product", ipair1, ipair2));
        assertTrue("inc failure", testThis("inc", "dot_product", ipair1, ipair2));
    }

    //@Test
    public void array_calc1_test() {
        //int[] r1 = MethodCollection2.array_calc1(arg1, arg2);

        assertTrue("add failure", testThis("add", "array_calc1", iarr1, iarg1));
    }

    @Test
    public void set_min_val_test() {
        //int[] r1 = MethodCollection2.set_min_val(arg1, arg2);
        
        assertTrue("add failure", testThis("add", "set_min_val", iarr1, iarg1));
        assertTrue("mult failure", testThis("mult", "set_min_val", iarr1, iarg1));
        assertTrue("perm failure", testThis("perm", "set_min_val", iarr1, iarg1)); //okay to fail on original
        assertTrue("inv failure", testThis("inv", "set_min_val", iarr1, iarg1));
    }

    @Test
    public void find_min_test() {
        //int r1 = MethodCollection2.find_min(orig);

        assertTrue("add failure", testThis("add", "find_min", iarr1)); //okay to fail on original
        assertTrue("mult failure", testThis("mult", "find_min", iarr1));
        assertTrue("inc failure", testThis("inc", "find_min", iarr1));
        assertTrue("perm failure", testThis("perm", "find_min", iarr1));
        assertTrue("inv failure", testThis("inv", "find_min", iarr1));
    }

    @Test
    public void array_copy_test() {
        //int[] r1 = MethodCollection2.array_copy(orig);

        assertTrue("add failure", testThis("add", "array_copy", iarr1));
        assertTrue("mult failure", testThis("mult", "array_copy", iarr1));
        assertTrue("inv failure", testThis("inv", "array_copy", iarr1));
    }

    @Test
    public void find_euc_dist_test() {
        //Arrays should be same size
        //double r1 = MethodCollection2.find_euc_dist(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "find_euc_dist", ipair1, ipair2));
        assertTrue("exc failure", testThis("exc", "find_euc_dist", ipair1, ipair2));
        assertTrue("inc failure", testThis("inc", "find_euc_dist", ipair1, ipair2));
        assertTrue("inv failure", testThis("inv", "find_euc_dist", ipair1, ipair2));
    }

    @Test
    public void find_magnitude_test() {
        //double r1 = MethodCollection2.find_magnitude(orig);

        assertTrue("add failure", testThis("add", "find_magnitude", iarr1));
        assertTrue("mult failure", testThis("mult", "find_magnitude", iarr1));
        assertTrue("inc failure", testThis("inc", "find_magnitude", iarr1));
        assertTrue("inv failure", testThis("inv", "find_magnitude", iarr1));
    }

    @Test
    public void manhattan_dist_test() {
        //Arrays should be same size
        //double r1 = MethodCollection2.manhattan_dist(arg1, arg2);

	assertTrue("mult failure", testThis("mult", "manhattan_dist", ipair1, ipair2));
	assertTrue("exc failure", testThis("exc", "manhattan_dist", ipair1, ipair2));
	assertTrue("inc failure", testThis("inc", "manhattan_dist", ipair1, ipair2));
	assertTrue("inv failure", testThis("inv", "manhattan_dist", ipair1, ipair2));
    }

    @Test
    public void average_test() {
        //double r1 = MethodCollection2.average(orig);
   
        assertTrue("add failure", testThis("add", "average", iarr1));
        assertTrue("mult failure", testThis("mult", "average", iarr1));
        assertTrue("perm failure", testThis("perm", "average", iarr1));
        assertTrue("inv failure", testThis("inv", "average", iarr1));
    }

    @Test
    public void find_max_test() {
        //int r1 = MethodCollection2.find_max(orig);

        assertTrue("add failure", testThis("add", "find_max", iarr1));
        assertTrue("mult failure", testThis("mult", "find_max", iarr1));
        assertTrue("perm failure", testThis("perm", "find_max", iarr1));
        assertTrue("inv failure", testThis("inv", "find_max", iarr1));
    }

    @Test
    public void find_max2_test() {
        //array should have at least 3 elements
        //int r1 = MethodCollection2.find_max2(orig);

        assertTrue("add failure", testThis("add", "find_max2", iarr1));
        assertTrue("mult failure", testThis("mult", "find_max2", iarr1));
        assertTrue("exc failure", testThis("exc", "find_max2", iarr1));
        assertTrue("inc failure", testThis("inc", "find_max2", iarr1));
        assertTrue("perm failure", testThis("perm", "find_max2", iarr1));
        assertTrue("inv failure", testThis("inv", "find_max2", iarr1));
    }

    @Test
    public void variance_test() {
        //double r1 = MethodCollection2.variance(orig);

        assertTrue("add failure", testThis("add", "variance", darr1));
        assertTrue("mult failure", testThis("mult", "variance", darr1));
        assertTrue("perm failure", testThis("perm", "variance", darr1));
        assertTrue("inv failure", testThis("inv", "variance", darr1));
    }

    @Test
    public void insertion_sort_test() {
        //int[] r1 = MethodCollection2.insertion_sort(orig);

        assertTrue("add failure", testThis("add", "insertion_sort", iarr1));
        assertTrue("mult failure", testThis("mult", "insertion_sort", iarr1));
        assertTrue("inv failure", testThis("inv", "insertion_sort", iarr1));
    }

    @Test
    public void geometric_mean_test() {
        //double r1 = MethodCollection2.geometric_mean(orig);

        assertTrue("add failure", testThis("add", "geometric_mean", iarr1));
        assertTrue("mult failure", testThis("mult", "geometric_mean", iarr1));
        assertTrue("exc failure", testThis("exc", "geometric_mean", iarr1));
        assertTrue("inc failure", testThis("inc", "geometric_mean", iarr1)); //okay to fail
        assertTrue("perm failure", testThis("perm", "geometric_mean", iarr1));
        assertTrue("inv failure", testThis("inv", "geometric_mean", iarr1));
    }

    @Test
    public void mean_absolute_error_test() {
        //double r1 = MethodCollection2.mean_absolute_error(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "mean_absolute_error", ipair1, ipair2));
        assertTrue("inv failure", testThis("inv", "mean_absolute_error", ipair1, ipair2));
    }

    @Test
    public void find_median_test() {
        //double r1 = MethodCollection2.find_median(orig);

        assertTrue("add failure", testThis("add", "find_median", iarr1));
        assertTrue("mult failure", testThis("mult", "find_median", iarr1));
        assertTrue("perm failure", testThis("perm", "find_median", iarr1));
        assertTrue("inv failure", testThis("inv", "find_median", iarr1));
    }

    @Test
    public void reverse_test() {
        //int[] r1 = MethodCollection2.reverse(orig);
        
        assertTrue("add failure", testThis("add", "reverse", iarr1));
        assertTrue("mult failure", testThis("mult", "reverse", iarr1));
        assertTrue("inv failure", testThis("inv", "reverse", iarr1));
    }

    @Test
    public void weighted_average_test() {
        //Arrays should be same size
        //double r1 = MethodCollection2.weighted_average(orig1, orig2);

        assertTrue("add failure", testThis("add", "weighted_average", dpair1, dpair2));
        assertTrue("mult failure", testThis("mult", "weighted_average", dpair1, dpair2));
    }

    //@Test
    public void count_k_test() {
        //int r1 = MethodCollection2.count_k(arg1, arg2);

	assertTrue("exc failure", testThis("exc", "count_k", iarr1, iarg1));
	assertTrue("inc failure", testThis("inc", "count_k", iarr1, iarg1));
	assertTrue("perm failure", testThis("perm", "count_k", iarr1, iarg1));
    }

    @Test
    public void clip_test() {
        //int[] r1 = MethodCollection2.clip(orig, secondArg, thirdArg);

        assertTrue("add failure", testThis("add", "clip", iarr1, iarg1, iarg2));
        assertTrue("mult failure", testThis("mult", "clip", iarr1, iarg1, iarg2));
        assertTrue("inv failure", testThis("inv", "clip", iarr1, iarg1, iarg2));
    }

    @Test
    public void elementwise_max_test() {
        //Arrays should be same size
        //int[] r1 = MethodCollection2.elementwise_max(arg1, arg2);
	
	assertTrue("mult failure", testThis("mult", "elementwise_max", ipair1, ipair2));
    }

    @Test
    public void elementwise_min_test() {
        //Arrays should be same size
        //int[] r1 = MethodCollection2.elementwise_min(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "elementwise_min", ipair1, ipair2));
    }

    //@Test
    public void count_non_zeroes_test() {
        //int r1 = MethodCollection2.count_non_zeroes(arg1);

	assertTrue("exc failure", testThis("exc", "count_non_zeroes", iarr1));
	assertTrue("inc failure", testThis("inc", "count_non_zeroes", iarr1));
	assertTrue("perm failure", testThis("perm", "count_non_zeroes", iarr1));
	assertTrue("inv failure", testThis("inv", "count_non_zeroes", iarr1));
    }

    //@Test
    public void cnt_zeroes_test() {
        //int r1 = MethodCollection2.cnt_zeroes(arg1);

	assertTrue("exc failure", testThis("exc", "cnt_zeroes", iarr1));
	assertTrue("inc failure", testThis("inc", "cnt_zeroes", iarr1));
	assertTrue("perm failure", testThis("perm", "cnt_zeroes", iarr1));
    }

    //@Test
    public void elementwise_equal_test() {
        //Arrays should be same size
        //boolean[] r1 = MethodCollection2.elementwise_equal(arg1, arg2);

	assertTrue("inv failure", testThis("inv", "elementwise_equal", ipair1, ipair2));
    }

    @Test
    public void hamming_dist_test() {
        //int r1 = MethodCollection2.hamming_dist(orig1, orig2);

        assertTrue("add failure", testThis("add", "hamming_dist", ipair1, ipair2));
        assertTrue("mult failure", testThis("mult", "hamming_dist", ipair1, ipair2));
        assertTrue("exc failure", testThis("exc", "hamming_dist", ipair1, ipair2));
        assertTrue("inc failure", testThis("inc", "hamming_dist", ipair1, ipair2));
        assertTrue("inv failure", testThis("inv", "hamming_dist", ipair1, ipair2));
    }

}
