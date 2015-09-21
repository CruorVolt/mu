import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromColt;
import java.util.Arrays;
import static org.hamcrest.Matchers.equalTo;

public class MethodsFromColtTests extends TestClass {

    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodsFromColt", function, args);
    }    

    //@Test
    public void autoCorrelation_test() {
        System.out.print("TEST: autoCorrelation");
        //second arg should be less than length of first
        int lag = getInt();
        int size = getInt() + lag;
        double[] orig = getDoubleArray(size);
        double thirdArg = getDouble();
        double fourthArg = getDouble();
        //double r1 = MethodsFromColt.autoCorrelation(orig, lag, getDouble(), getDouble());

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "autoCorrelation", orig, lag, thirdArg, fourthArg), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void binarySearchFromTo_doubles_test() {
        System.out.print("TEST: binarySearchFromTo");
        //input array should be sorted, int inputs should be valid low/high indices
        int size = getInt() + 10;
        double[] arr = getDoubleArray(size);
        Arrays.sort(arr);
        int low = arr.length / 10;
        int high = arr.length - low ;
        double secondArg = getDouble();
        //int r1 = MethodsFromColt.binarySearchFromTo(arr, secondArg, low, high);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "binarySearchFromTo", arr, secondArg, low, high), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "binarySearchFromTo", arr, secondArg, low, high), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "binarySearchFromTo", arr, secondArg, low, high), equalTo(true));
        
        System.out.println(" >>complete");
    }
    @Test
    public void covariance_test() {
        System.out.print("TEST: covariance");
        //array sizes should match and be > 0
        int size = getInt() + 1;
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        //double r1 = MethodsFromColt.covariance(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "covariance", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "covariance", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "covariance", orig1, orig2), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void durbinWatson_test() {
        System.out.print("TEST: durbinWatson");
        //array length should be > 2
        int size = getInt() + 2;
	double[] arg1 = getDoubleArray(size);
        //double r1 = MethodsFromColt.durbinWatson(arg1);

        String fail = "";
        collector.checkThat(fail += "mult failure&", testThis("mult", "durbinWatson", arg1), equalTo(true));
        
        System.out.println(" >>complete");
    }
    //@Test
    public void lag1_test() {
        System.out.print("TEST: lag1");
        double[] orig = getDoubleArray();
        double arg2 = getDouble();
        //double r1 = MethodsFromColt.lag1(orig, arg2);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "lag1", orig, arg2), equalTo(true));
        
        System.out.println(" >>complete");
    }
    @Test
    public void max_test() {
        System.out.print("TEST: max");
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromColt.max(orig);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "max", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "max", orig), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "max", orig), equalTo(true));
        
        System.out.println(" >>complete");
    }
    //@Test
    public void meanDeviation_test() {
        System.out.print("TEST: meanDeviation");
        double[] orig = getDoubleArray();
        double secondArg = getDouble();
        //double r1 = MethodsFromColt.meanDeviation(orig, secondArg);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "meanDeviation", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "add failure&", testThis("mult", "meanDeviation", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "meanDeviation", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "meanDeviation", orig, secondArg), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void min_test() {
        System.out.print("TEST: min");
	double[] arg1 = getDoubleArray();
        //double r1 = MethodsFromColt.min(arg1);

        String fail = "";
        collector.checkThat(fail += "mult failure&", testThis("mult", "min", arg1), equalTo(true));
        collector.checkThat(fail += "inc failure&", testThis("inc", "min", arg1), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "min", arg1), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "min", arg1), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void product_test() {
        System.out.print("TEST: product");
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromColt.product(orig);
        
        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "product", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "product", orig), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "product", orig), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "product", orig), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void quantile_test() {
        System.out.print("TEST: quantile");
        //input array should be sorted, double value should be between 0 and 1
        double[] arr = getDoubleArray();
        Arrays.sort(arr);
        double secondArg = getNextDouble();
        //double r1 = MethodsFromColt.quantile(arr, secondArg);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "quantile", arr, secondArg), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "quantile", arr, secondArg), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "quantile", arr, secondArg), equalTo(true));

        System.out.println(" >>complete");
    }
    //@Test
    public void sampleKurtosis_test() {
        System.out.print("TEST: sampleKurtosis");
        int arg1 = getInt();
        double arg2 = getDouble();
        double arg3 = getDouble();
        //double r1 = MethodsFromColt.sampleKurtosis(arg1, arg2, arg3);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "sampleKurtosis", arg1, arg2, arg3), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "sampleKurtosis", arg1, arg2, arg3), equalTo(true));
        
        System.out.println(" >>complete");
    }

    //@Test
    public void sampleSkew_test() {
        System.out.print("TEST: sampleSkew");
        int firstArg = getInt();
        double secondArg = getDouble();
        double thirdArg = getDouble();
        //double r1 = MethodsFromColt.sampleSkew(firstArg, secondArg, thirdArg);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "sampleSkew", firstArg, secondArg, thirdArg), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "sampleSkew", firstArg, secondArg, thirdArg), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "sampleSkew", firstArg, secondArg, thirdArg), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void sampleVariance_test() {
        System.out.print("TEST: sampleVariance");
        double secondArg = getDouble();
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromColt.sampleVariance(orig, secondArg);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "sampleVariance", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "sampleVariance", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "sampleVariance", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "sampleVariance", orig, secondArg), equalTo(true));
    }
    @Test
    public void sumOfLogarithms_test() {
        System.out.print("TEST: sumOfLogarithms");
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromColt.sumOfLogarithms(orig);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "sumOfLogarithms", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "sumOfLogarithms", orig), equalTo(true));
        collector.checkThat(fail += "exc failure&", testThis("exc", "sumOfLogarithms", orig), equalTo(true));
        collector.checkThat(fail += "inc failure&", testThis("inc", "sumOfLogarithms", orig), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "sumOfLogarithms", orig), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "sumOfLogarithms", orig), equalTo(true));
        
        System.out.println(" >>complete");
    }

    //@Test
    public void weightedMean_test() {
        System.out.print("TEST: weightedMean");
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        //double r1 = MethodsFromColt.weightedMean(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "weightedMean", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "weightedMean", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "weightedMean", orig1, orig2), equalTo(true));
        
        System.out.println(" >>complete");
    }
    @Test
    public void binarySearchFromTo_ints_test() {
        System.out.print("TEST: binarySearchFromTo_ints");
        //last two int params must be valid from/to indices
        int minsize1 = getInt();
        int minsize2 = getInt();
        int size = getInt() + minsize1 + minsize2;
	int[] arg1 = getIntArray(size);
	int arg2 = getInt();
	int arg3 = getInt(minsize1);
	int arg4 = getInt(minsize2);
        //int r1 = MethodsFromColt.binarySearchFromTo(arg1, arg2, arg3, arg4);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "binarySearchFromTo", arg1, arg2, arg3, arg4), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "binarySearchFromTo", arg1, arg2, arg3, arg4), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "binarySearchFromTo", arg1, arg2, arg3, arg4), equalTo(true));

        System.out.println(" >>complete");
    }

    @Test
    public void winsorizedMean_test() {
        System.out.print("TEST: winsorizedMean");
        //input array must be sorted, ints must be valid from/to indices
        int from = getInt();
        int to = getInt();
        int size = getInt() + from + to;
        double[] arr = getDoubleArray(size);
        Arrays.sort(arr);
        //double r1 = MethodsFromColt.winsorizedMean(arr, from, to);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "winsorizedMean", arr, from, to), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "winsorizedMean", arr, from, to), equalTo(true));

        System.out.println(" >>complete");
    }

    @Test
    public void kurtosis_test() {
        System.out.print("TEST: kurtosis");
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromColt.kurtosis(orig);
        
        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "kurtosis", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "kurtosis", orig), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "kurtosis", orig), equalTo(true));
        
        System.out.println(" >>complete");
    }

    @Test
    public void pooledMean_test() {
        System.out.print("TEST: pooledMean");
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        //double r1 = MethodsFromColt.pooledMean(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "pooledMean", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "pooledMean", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "pooledMean", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "pooledMean", orig1, orig2), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void pooledVariance_test() {
        System.out.print("TEST: pooledVariance");
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        //double r1 = MethodsFromColt.pooledVariance(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "pooledVariance", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "pooledVariance", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "pooledVariance", orig1, orig2), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void polevl_test() {
        System.out.print("TEST: polevl");
        //array needs to be length of int param
        int size = getInt();
        double[] orig = getDoubleArray(size+1);
        double first = getDouble();
        //double r1 = MethodsFromColt.polevl(first, orig, size);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "polevl", first, orig, size), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "polevl", first, orig, size), equalTo(true));
        collector.checkThat(fail += "exc failure&", testThis("exc", "polevl", first, orig, size), equalTo(true));
        collector.checkThat(fail += "inc failure&", testThis("inc", "polevl", first, orig, size), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "polevl", first, orig, size), equalTo(true));
        
        System.out.println(" >>complete");
    }

    @Test
    public void skew_test() {
        System.out.print("TEST: skew");
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromColt.skew(orig);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "skew", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "skew", orig), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "skew", orig), equalTo(true));
    }
    @Test
    public void standardize_test() {
        System.out.print("TEST: standardize");
        double[] orig = getDoubleArray();
        //double[] r1 = MethodsFromColt.standardize(orig);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "standardize", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "standardize", orig), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "standardize", orig), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "standardize", orig), equalTo(true));

        System.out.println(" >>complete");
    }
    //@Test
    public void weightedRMS_test() {
        System.out.print("TEST: weightedRMS");
        //arrays should be same size
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromColt.weightedRMS(arg1, arg2);

        String fail = "";
	collector.checkThat(fail += "inv failure&", testThis("inv", "weightedRMS", arg1, arg2), equalTo(true));

        System.out.println(" >>complete");
    }
    @Test
    public void harmonicMean_test() {
        System.out.print("TEST: harmonicMean");
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromColt.harmonicMean(orig);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "harmonicMean", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "harmonicMean", orig), equalTo(true));
        collector.checkThat(fail += "perm failure&", testThis("perm", "harmonicMean", orig), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "harmonicMean", orig), equalTo(true));
        
        System.out.println(" >>complete");
    }
    @Test
    public void sumOfPowerOfDeviations_test() {
        System.out.print("TEST: sumOfPowerOfDeviatons");
	double[] arg1 = getDoubleArray();
	int arg2 = getInt();
	double arg3 = getDouble();
        //double r1 = MethodsFromColt.sumOfPowerOfDeviations(arg1, arg2, arg3);

        String fail = "";
        collector.checkThat(fail += "mult failure&", testThis("mult", "sumOfPowerOfDeviations", arg1, arg2, arg3), equalTo(true));
        collector.checkThat(fail += "exc failure&", testThis("exc", "sumOfPowerOfDeviations", arg1, arg2, arg3), equalTo(true));
        collector.checkThat(fail += "inc failure&", testThis("inc", "sumOfPowerOfDeviations", arg1, arg2, arg3), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "sumOfPowerOfDeviations", arg1, arg2, arg3), equalTo(true));
        
        System.out.println(" >>complete");
    }
    //@Test
    public void power_test() {
        System.out.print("TEST: power");
        double[] orig = getDoubleArray();
        int secondArg = getInt();
        //double[] r1 = MethodsFromColt.power(orig, secondArg);
        
        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "power", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "power", orig, secondArg), equalTo(true));
        
        System.out.println(" >>complete");
    }
    @Test
    public void square_test() {
        System.out.print("TEST: square");
        double[] orig = getDoubleArray();
        //double[] r1 = MethodsFromColt.square(orig);

        String fail = "";
        collector.checkThat(fail += "add failure&", testThis("add", "square", orig), equalTo(true));
        collector.checkThat(fail += "mult failure&", testThis("mult", "square", orig), equalTo(true));
        collector.checkThat(fail += "inv failure&", testThis("inv", "square", orig), equalTo(true));
        
        System.out.println(" >>complete");
    }

}
