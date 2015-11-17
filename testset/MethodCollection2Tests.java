import org.junit.Test;
import static org.junit.Assert.*;
//import Test.MethodCollection2;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.Matchers.equalTo;

public class MethodCollection2Tests extends TestClass {

    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodCollection2", function, args);
    }    

    @Test
    public void add_values_test() {
        //System.out.print("<add_values>");
        int[] orig = getIntArray();
        //int r1 = MethodCollection2.add_values(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "add_values", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "add_values", orig), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "add_values", orig), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "add_values", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "add_values", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "add_values", orig), equalTo(true));
    }

    @Test
    public void bubble_test() {
        //System.out.println("TEST: bubble");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.bubble(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "bubble", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "bubble", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "bubble", orig), equalTo(true));
    }

    @Test
    public void shell_sort_test() {
        //System.out.println("TEST: shell_sort");
	int[] arg1 = getIntArray();
        //int[] r1 = MethodCollection2.shell_sort(arg1);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "shell_sort", arg1), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "shell_sort", arg1), equalTo(true));
    }

    @Test
    public void sequential_search_test() {
        //System.out.println("TEST: sequential_search");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        //int r1 = MethodCollection2.sequential_search(arg1, arg2);

        String fail = "";
	collector.checkThat(fail += "exc&", testThis("exc", "sequential_search", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "inc&", testThis("inc", "sequential_search", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "perm&", testThis("perm", "sequential_search", arg1, arg2), equalTo(true));
    }

    @Test
    public void selection_sort_test() {
        //System.out.println("TEST: selection_sort");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.selection_sort(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "selection_sort", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "selection_sort", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "selection_sort", orig), equalTo(true));
    }

    @Test
    public void dot_product_test() {
        //System.out.println("TEST: dot_product");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //int r1 = MethodCollection2.dot_product(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "dot_product", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "dot_product", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "dot_product", arg1, arg2), equalTo(true));
    }

    @Test
    public void array_calc1_test() {
        //System.out.println("TEST: array_calc1");
        int[] arg1 = getIntArray();
        int arg2 = getInt();
        //int[] r1 = MethodCollection2.array_calc1(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "array_calc1", arg1, arg2), equalTo(true));
    }

    @Test
    public void set_min_val_test() {
        //System.out.println("TEST: set_min_val");
        int[] arg1 = getIntArray();
        int arg2 = getInt();
        //int[] r1 = MethodCollection2.set_min_val(arg1, arg2);
        
        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "set_min_val", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "set_min_val", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "set_min_val", arg1, arg2), equalTo(true)); //okay to fail on original
        collector.checkThat(fail += "inv&", testThis("inv", "set_min_val", arg1, arg2), equalTo(true));
    }

    @Test
    public void find_min_test() {
        //System.out.println("TEST: find_min");
        int[] orig = getIntArray();
        //int r1 = MethodCollection2.find_min(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "find_min", orig), equalTo(true)); //okay to fail on original
        collector.checkThat(fail += "mult&", testThis("mult", "find_min", orig), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "find_min", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "find_min", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "find_min", orig), equalTo(true));
    }

    @Test
    public void array_copy_test() {
        //System.out.println("TEST: array_copy");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.array_copy(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "array_copy", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "array_copy", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "array_copy", orig), equalTo(true));
    }

    @Test
    public void find_euc_dist_test() {
        //System.out.println("TEST: find_euc_dist");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //double r1 = MethodCollection2.find_euc_dist(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "find_euc_dist", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "find_euc_dist", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "find_euc_dist", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "find_euc_dist", arg1, arg2), equalTo(true));
    }

    @Test
    public void find_magnitude_test() {
        //System.out.println("TEST: find_magnitude");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.find_magnitude(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "find_magnitude", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "find_magnitude", orig), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "find_magnitude", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "find_magnitude", orig), equalTo(true));
    }

    @Test
    public void manhattan_dist_test() {
        //System.out.println("TEST: manhattan_dist");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //double r1 = MethodCollection2.manhattan_dist(arg1, arg2);

        String fail = "";
	collector.checkThat(fail += "mult&", testThis("mult", "manhattan_dist", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "exc&", testThis("exc", "manhattan_dist", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "inc&", testThis("inc", "manhattan_dist", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "inv&", testThis("inv", "manhattan_dist", arg1, arg2), equalTo(true));
    }

    @Test
    public void average_test() {
        //System.out.println("TEST: average");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.average(orig);
   
        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "average", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "average", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "average", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "average", orig), equalTo(true));
    }

    @Test
    public void find_max_test() {
        //System.out.println("TEST: find_max");
        int[] orig = getIntArray();
        //int r1 = MethodCollection2.find_max(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "find_max", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "find_max", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "find_max", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "find_max", orig), equalTo(true));
    }

    @Test
    public void find_max2_test() {
        //array should have at least 3 elements
        //System.out.println("TEST: find_max2");
        int[] orig = getIntArray(getInt() + 3);
        //int r1 = MethodCollection2.find_max2(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "find_max2", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "find_max2", orig), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "find_max2", orig), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "find_max2", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "find_max2", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "find_max2", orig), equalTo(true));
    }

    @Test
    public void variance_test() {
        //System.out.println("TEST: variance");
        double[] orig = getDoubleArray();
        //double r1 = MethodCollection2.variance(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "variance", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "variance", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "variance", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "variance", orig), equalTo(true));
    }

    @Test
    public void insertion_sort_test() {
        //System.out.println("TEST: insertion_sort");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.insertion_sort(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "insertion_sort", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "insertion_sort", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "insertion_sort", orig), equalTo(true));
    }

    @Test
    public void geometric_mean_test() {
        //System.out.println("TEST: geometric_mean");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.geometric_mean(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "geometric_mean", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "geometric_mean", orig), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "geometric_mean", orig), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "geometric_mean", orig), equalTo(true)); //okay to fail
        collector.checkThat(fail += "perm&", testThis("perm", "geometric_mean", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "geometric_mean", orig), equalTo(true));
    }

    @Test
    public void mean_absolute_error_test() {
        //System.out.println("TEST: mean_absolute_error");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //double r1 = MethodCollection2.mean_absolute_error(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "mean_absolute_error", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "mean_absolute_error", arg1, arg2), equalTo(true));
    }

    @Test
    public void find_median_test() {
        //System.out.println("TEST: find_median");
        int[] orig = getIntArray();
        //double r1 = MethodCollection2.find_median(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "find_median", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "find_median", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "find_median", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "find_median", orig), equalTo(true));
    }

    @Test
    public void reverse_test() {
        //System.out.println("TEST: reverse");
        int[] orig = getIntArray();
        //int[] r1 = MethodCollection2.reverse(orig);
        
        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "reverse", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "reverse", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "reverse", orig), equalTo(true));
    }

    @Test
    public void weighted_average_test() {
        //System.out.println("TEST: weighted_average");
        //Arrays should be same size
        int arraySize = getInt();
        double[] orig1 = getDoubleArray(arraySize);
        double[] orig2 = getDoubleArray(arraySize);
        //double r1 = MethodCollection2.weighted_average(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "weighted_average", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "weighted_average", orig1, orig2), equalTo(true));
    }

    @Test
    public void count_k_test() {
        //System.out.println("TEST: count_k");
	int[] arg1 = getIntArray();
	int arg2 = getInt();
        //int r1 = MethodCollection2.count_k(arg1, arg2);

        String fail = "";
	collector.checkThat(fail += "exc&", testThis("exc", "count_k", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "inc&", testThis("inc", "count_k", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "perm&", testThis("perm", "count_k", arg1, arg2), equalTo(true));
    }

    @Test
    public void clip_test() {
        //System.out.println("TEST: clip");
        int[] orig = getIntArray();
        int secondArg = getInt();
        int thirdArg = getInt();
        //int[] r1 = MethodCollection2.clip(orig, secondArg, thirdArg);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "clip", orig, secondArg, thirdArg), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "clip", orig, secondArg, thirdArg), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "clip", orig, secondArg, thirdArg), equalTo(true));
    }

    @Test
    public void elementwise_max_test() {
        //System.out.println("TEST: elementwise_max");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //int[] r1 = MethodCollection2.elementwise_max(arg1, arg2);
	
        String fail = "";
	collector.checkThat(fail += "mult&", testThis("mult", "elementwise_max", arg1, arg2), equalTo(true));
    }

    @Test
    public void elementwise_min_test() {
        //System.out.println("TEST: elementwise_min");
        //Arrays should be same size
        int arraySize = getInt();
	int[] arg1 = getIntArray(arraySize);
	int[] arg2 = getIntArray(arraySize);
        //int[] r1 = MethodCollection2.elementwise_min(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "elementwise_min", arg1, arg2), equalTo(true));
    }

    @Test
    public void count_non_zeroes_test() {
        //System.out.println("TEST: count_non_zeroes");
	int[] arg1 = getIntArray();
        //int r1 = MethodCollection2.count_non_zeroes(arg1);

        String fail = "";
	collector.checkThat(fail += "exc&", testThis("exc", "count_non_zeroes", arg1), equalTo(true));
	collector.checkThat(fail += "inc&", testThis("inc", "count_non_zeroes", arg1), equalTo(true));
	collector.checkThat(fail += "perm&", testThis("perm", "count_non_zeroes", arg1), equalTo(true));
	collector.checkThat(fail += "inv&", testThis("inv", "count_non_zeroes", arg1), equalTo(true));
    }

    @Test
    public void cnt_zeroes_test() {
        //System.out.println("TEST: cnt_zeroes");
	int[] arg1 = getIntArray();
        //int r1 = MethodCollection2.cnt_zeroes(arg1);

        String fail = "";
	collector.checkThat(fail += "exc&", testThis("exc", "cnt_zeroes", arg1), equalTo(true));
	collector.checkThat(fail += "inc&", testThis("inc", "cnt_zeroes", arg1), equalTo(true));
	collector.checkThat(fail += "perm&", testThis("perm", "cnt_zeroes", arg1), equalTo(true));
    }

    @Test
    public void hamming_dist_test() {
        //System.out.println("TEST: hamming_dist");
        //Arrays should be same size
        int arraySize = getInt();
        int[] orig1 = getIntArray(arraySize);
        int[] orig2 = getIntArray(arraySize);
        //int r1 = MethodCollection2.hamming_dist(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "hamming_dist", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "hamming_dist", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "hamming_dist", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "hamming_dist", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "hamming_dist", orig1, orig2), equalTo(true));
    }

}
