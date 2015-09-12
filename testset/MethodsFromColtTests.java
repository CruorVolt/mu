import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromColt;
import java.util.Arrays;

public class MethodsFromColtTests extends TestClass {

    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodsFromColt", function, args);
    }    

    @Test
    public void autoCorrelation_test() {
        System.out.print("TEST: autoCorrelation");
        //second arg should be less than length of first
        int lag = getInt();
        int size = getInt() + lag;
        double[] orig = getDoubleArray(size);
        double thirdArg = getDouble();
        double fourthArg = getDouble();
        double r1 = MethodsFromColt.autoCorrelation(orig, lag, getDouble(), getDouble());

        assertTrue("add failure", testThis("add", "autoCorrelation", orig, lag, thirdArg, fourthArg));

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
        int r1 = MethodsFromColt.binarySearchFromTo(arr, secondArg, low, high);

        assertTrue("add failure", testThis("add", "binarySearchFromTo", arr, secondArg, low, high));

        assertTrue("mult failure", testThis("mult", "binarySearchFromTo", arr, secondArg, low, high));

        assertTrue("inv failure", testThis("inv", "binarySearchFromTo", arr, secondArg, low, high));
        
        System.out.println(" >>complete");
    }
    @Test
    public void covariance_test() {
        System.out.print("TEST: covariance");
        //array sizes should match and be > 0
        int size = getInt() + 1;
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        double r1 = MethodsFromColt.covariance(orig1, orig2);

        assertTrue("add failure", testThis("add", "covariance", orig1, orig2));

        assertTrue("mult failure", testThis("mult", "covariance", orig1, orig2));

        assertTrue("inv failure", testThis("inv", "covariance", orig1, orig2));

        System.out.println(" >>complete");
    }
    @Test
    public void durbinWatson_test() {
        System.out.print("TEST: durbinWatson");
        //array length should be > 2
        int size = getInt() + 2;
	double[] arg1 = getDoubleArray(size);
        double r1 = MethodsFromColt.durbinWatson(arg1);

        assertTrue("mult failure", testThis("mult", "durbinWatson", arg1));
        
        System.out.println(" >>complete");
    }
    @Test
    public void lag1_test() {
        System.out.print("TEST: lag1");
        double[] orig = getDoubleArray();
        double arg2 = getDouble();
        double r1 = MethodsFromColt.lag1(orig, arg2);

        assertTrue("add failure", testThis("add", "lag1", orig, arg2));
        
        System.out.println(" >>complete");
    }
    @Test
    public void max_test() {
        System.out.print("TEST: max");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.max(orig);

        assertTrue("add failure", testThis("add", "max", orig));

        assertTrue("mult failure", testThis("mult", "max", orig));

        assertTrue("inv failure", testThis("inv", "max", orig));
        
        System.out.println(" >>complete");
    }
    @Test
    public void meanDeviation_test() {
        System.out.print("TEST: meanDeviation");
        double[] orig = getDoubleArray();
        double secondArg = getDouble();
        double r1 = MethodsFromColt.meanDeviation(orig, secondArg);

        assertTrue("add failure", testThis("add", "meanDeviation", orig, secondArg));
        
        assertTrue("add failure", testThis("mult", "meanDeviation", orig, secondArg));
        
        assertTrue("per failure", testThis("per", "meanDeviation", orig, secondArg));

        assertTrue("inv failure", testThis("inv", "meanDeviation", orig, secondArg));

        System.out.println(" >>complete");
    }
    @Test
    public void min_test() {
        System.out.print("TEST: min");
	double[] arg1 = getDoubleArray();
        double r1 = MethodsFromColt.min(arg1);

        assertTrue("mult failure", testThis("mult", "min", arg1));

        assertTrue("inc failure", testThis("inc", "min", arg1));

        assertTrue("per failure", testThis("per", "min", arg1));

        assertTrue("inv failure", testThis("inv", "min", arg1));

        System.out.println(" >>complete");
    }
    @Test
    public void product_test() {
        System.out.print("TEST: product");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.product(orig);
        
        assertTrue("add failure", testThis("add", "product", orig));

        assertTrue("mult failure", testThis("mult", "product", orig));

        assertTrue("per failure", testThis("per", "product", orig));

        assertTrue("inv failure", testThis("inv", "product", orig));

        System.out.println(" >>complete");
    }
    @Test
    public void quantile_test() {
        System.out.print("TEST: quantile");
        //input array should be sorted, double value should be between 0 and 1
        double[] arr = getDoubleArray();
        Arrays.sort(arr);
        double secondArg = getNextDouble();
        double r1 = MethodsFromColt.quantile(arr, secondArg);

        assertTrue("add failure", testThis("add", "quantile", arr, secondArg));

        assertTrue("mult failure", testThis("mult", "quantile", arr, secondArg));

        assertTrue("inv failure", testThis("inv", "quantile", arr, secondArg));

        System.out.println(" >>complete");
    }
    @Test
    public void sampleKurtosis_test() {
        System.out.print("TEST: sampleKurtosis");
        int arg1 = getInt();
        double arg2 = getDouble();
        double arg3 = getDouble();
        double r1 = MethodsFromColt.sampleKurtosis(arg1, arg2, arg3);

        assertTrue("add failure", testThis("add", "sampleKurtosis", arg1, arg2, arg3));
        
        assertTrue("per failure", testThis("per", "sampleKurtosis", arg1, arg2, arg3));
        
        System.out.println(" >>complete");
    }
    @Test
    public void sampleKurtosisStandardError_test() {
        System.out.print("TEST: sampleKurtosisStandardError");
	int arg1 = getInt();
        double r1 = MethodsFromColt.sampleKurtosisStandardError(arg1);
        System.out.println(" >>complete");
    }
    @Test
    public void sampleSkew_test() {
        System.out.print("TEST: sampleSkew");
        int firstArg = getInt();
        double secondArg = getDouble();
        double thirdArg = getDouble();
        double r1 = MethodsFromColt.sampleSkew(firstArg, secondArg, thirdArg);

        assertTrue("add failure", testThis("add", "sampleSkew", firstArg, secondArg, thirdArg));

        assertTrue("per failure", testThis("per", "sampleSkew", firstArg, secondArg, thirdArg));

        assertTrue("inv failure", testThis("inv", "sampleSkew", firstArg, secondArg, thirdArg));

        System.out.println(" >>complete");
    }
    @Test
    public void sampleVariance_test() {
        System.out.print("TEST: sampleVariance");
        double secondArg = getDouble();
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.sampleVariance(orig, secondArg);

        assertTrue("add failure", testThis("add", "sampleVariance", orig, secondArg));

        assertTrue("mult failure", testThis("mult", "sampleVariance", orig, secondArg));

        assertTrue("per failure", testThis("per", "sampleVariance", orig, secondArg));

        assertTrue("inv failure", testThis("inv", "sampleVariance", orig, secondArg));
    }
    @Test
    public void sumOfLogarithms_test() {
        System.out.print("TEST: sumOfLogarithms");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.sumOfLogarithms(orig);

        assertTrue("add failure", testThis("add", "sumOfLogarithms", orig));

        assertTrue("mult failure", testThis("mult", "sumOfLogarithms", orig));

        assertTrue("exc failure", testThis("exc", "sumOfLogarithms", orig));

        assertTrue("inc failure", testThis("inc", "sumOfLogarithms", orig));

        assertTrue("per failure", testThis("per", "sumOfLogarithms", orig));

        assertTrue("inv failure", testThis("inv", "sumOfLogarithms", orig));
        
        System.out.println(" >>complete");
    }
    @Test
    public void trimmedMean_test() {
        System.out.print("TEST: trimmedMean");
        //input array must be sorted ascending, ints must be valid from/to indices
        int from = getInt();
        int to = getInt();
        int size = getInt() + from + to;
        double[] arr = getDoubleArray(size);
        Arrays.sort(arr);
	double arg2 = getDouble();
        double r1 = MethodsFromColt.trimmedMean(arr, arg2, from, to);
        System.out.println(" >>complete");
    }
    @Test
    public void weightedMean_test() {
        System.out.print("TEST: weightedMean");
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        double r1 = MethodsFromColt.weightedMean(orig1, orig2);

        assertTrue("add failure", testThis("add", "weightedMean", orig1, orig2));

        assertTrue("per failure", testThis("per", "weightedMean", orig1, orig2));

        assertTrue("inv failure", testThis("inv", "weightedMean", orig1, orig2));
        
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
        int r1 = MethodsFromColt.binarySearchFromTo(arg1, arg2, arg3, arg4);

        assertTrue("add failure", testThis("add", "binarySearchFromTo", arr, secondArg, low, high));

        assertTrue("mult failure", testThis("mult", "binarySearchFromTo", arr, secondArg, low, high));

        assertTrue("inv failure", testThis("inv", "binarySearchFromTo", arr, secondArg, low, high));

        System.out.println(" >>complete");
    }
    @Test
    public void binomial_test() {
        //pass small values for reasonable completion times
        int max = 100;
        System.out.print("TEST: binomial");
	double arg1 = getNextDouble();
	long arg2 = (long)getNextDouble();
        double r1 = MethodsFromColt.binomial(arg1, arg2);
        System.out.println(" >>complete");
    }
    @Test
    public void link_test() {
        System.out.print("TEST: link");
	double arg1 = getDouble();
        double r1 = MethodsFromColt.link(arg1);
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
        double r1 = MethodsFromColt.winsorizedMean(arr, from, to);

        assertTrue("add failure", testThis("add", "winsorizedMean", arr, from, to));

        assertTrue("mult failure", testThis("mult", "winsorizedMean", arr, from, to));

        System.out.println(" >>complete");
    }
    @Test
    public void geometricPdf_test() {
        System.out.print("TEST: geometricPdf");
	int arg1 = getInt();
	double arg2 = getDouble();
        double r1 = MethodsFromColt.geometricPdf(arg1, arg2);
        System.out.println(" >>complete");
    }
    @Test
    public void kurtosis_test() {
        System.out.print("TEST: kurtosis");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.kurtosis(orig);
        
        assertTrue("add failure", testThis("add", "kurtosis", orig));

        assertTrue("mult failure", testThis("mult", "kurtosis", orig));

        assertTrue("per failure", testThis("per", "kurtosis", orig));
        
        System.out.println(" >>complete");
    }
    @Test
    public void logGamma_test() {
        System.out.print("TEST: logGamma");
	double arg1 = getDouble();
        double r1 = MethodsFromColt.logGamma(arg1);
        System.out.println(" >>complete");
    }
    @Test
    public void pooledMean_test() {
        System.out.print("TEST: pooledMean");
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        double r1 = MethodsFromColt.pooledMean(orig1, orig2);

        assertTrue("add failure", testThis("add", "pooledMean", orig1, orig2));

        assertTrue("mult failure", testThis("mult", "pooledMean", orig1, orig2));

        assertTrue("per failure", testThis("per", "pooledMean", orig1, orig2));

        assertTrue("inv failure", testThis("inv", "pooledMean", orig1, orig2));

        System.out.println(" >>complete");
    }
    @Test
    public void pooledVariance_test() {
        System.out.print("TEST: pooledVariance");
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        double r1 = MethodsFromColt.pooledVariance(orig1, orig2);

        assertTrue("add failure", testThis("add", "pooledVariance", orig1, orig2));

        assertTrue("mult failure", testThis("mult", "pooledVariance", orig1, orig2));

        assertTrue("per failure", testThis("per", "pooledVariance", orig1, orig2));

        System.out.println(" >>complete");
    }
    @Test
    public void polevl_test() {
        System.out.print("TEST: polevl");
        //array needs to be length of int param
        int size = getInt();
        double[] orig = getDoubleArray(size+1);
        double first = getDouble();
        double r1 = MethodsFromColt.polevl(first, orig, size);

        assertTrue("add failure", testThis("add", "polevl", first, orig, size));

        assertTrue("mult failure", testThis("mult", "polevl", first, orig, size));

        assertTrue("exc failure", testThis("exc", "polevl", first, orig, size));

        assertTrue("inc failure", testThis("inc", "polevl", first, orig, size));

        assertTrue("inv failure", testThis("inv", "polevl", first, orig, size));
        
        System.out.println(" >>complete");
    }
    @Test
    public void rankInterpolated_test() {
        System.out.print("TEST: rankInterpolated");
        //input array should be sorted
        double[] arr = getDoubleArray();
        Arrays.sort(arr);
	double arg2 = getDouble();
	int arg3 = getInt();
        double r1 = MethodsFromColt.rankInterpolated(arr, arg2, arg3);
        System.out.println(" >>complete");
    }
    @Test
    public void sampleWeightedVariance_test() {
        System.out.print("TEST: sampleWeightedVariance");
        //arrays should be same size
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromColt.sampleWeightedVariance(arg1, arg2);
        System.out.println(" >>complete");
    }
    @Test
    public void skew_test() {
        System.out.print("TEST: skew");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.skew(orig);

        assertTrue("add failure", testThis("add", "skew", orig));

        assertTrue("mult failure", testThis("mult", "skew", orig));

        assertTrue("per failure", testThis("per", "skew", orig));
    }
    @Test
    public void standardize_test() {
        System.out.print("TEST: standardize");
        double[] orig = getDoubleArray();
        double[] r1 = MethodsFromColt.standardize(orig);

        assertTrue("add failure", testThis("add", "standardize", orig));

        assertTrue("mult failure", testThis("mult", "standardize", orig));

        assertTrue("per failure", testThis("per", "standardize", orig));

        assertTrue("inv failure", testThis("inv", "standardize", orig));

        System.out.println(" >>complete");
    }
    @Test
    public void weightedRMS_test() {
        System.out.print("TEST: weightedRMS");
        //arrays should be same size
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromColt.weightedRMS(arg1, arg2);

	assertTrue("inv failure", testThis("inv", "weightedRMS", arg1, arg2));
        System.out.println(" >>complete");
    }
    @Test
    public void harmonicMean_test() {
        System.out.print("TEST: harmonicMean");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.harmonicMean(orig);

        assertTrue("add failure", testThis("add", "harmonicMean", orig));

        assertTrue("mult failure", testThis("mult", "harmonicMean", orig));

        assertTrue("per failure", testThis("per", "harmonicMean", orig));

        assertTrue("inv failure", testThis("inv", "harmonicMean", orig));
        
        System.out.println(" >>complete");
    }
    @Test
    public void sumOfPowerOfDeviations_test() {
        System.out.print("TEST: sumOfPowerOfDeviatons");
	double[] arg1 = getDoubleArray();
	int arg2 = getInt();
	double arg3 = getDouble();
        double r1 = MethodsFromColt.sumOfPowerOfDeviations(arg1, arg2, arg3);

        assertTrue("mult failure", testThis("mult", "sumOfPowerOfDeviations", arg1, arg2, arg3));

        assertTrue("exc failure", testThis("exc", "sumOfPowerOfDeviations", arg1, arg2, arg3));

        assertTrue("inc failure", testThis("inc", "sumOfPowerOfDeviations", arg1, arg2, arg3));

        assertTrue("inv failure", testThis("inv", "sumOfPowerOfDeviations", arg1, arg2, arg3));
        
        System.out.println(" >>complete");
    }
    @Test
    public void power_test() {
        System.out.print("TEST: power");
        double[] orig = getDoubleArray();
        int secondArg = getInt();
        double[] r1 = MethodsFromColt.power(orig, secondArg);
        
        assertTrue("add failure", testThis("add", "power", orig, secondArg));

        assertTrue("inv failure", testThis("inv", "power", orig, secondArg));
        
        System.out.println(" >>complete");
    }
    @Test
    public void square_test() {
        System.out.print("TEST: square");
        double[] orig = getDoubleArray();
        double[] r1 = MethodsFromColt.square(orig);

        assertTrue("add failure", testThis("add", "square", orig));

        assertTrue("mult failure", testThis("mult", "square", orig));

        assertTrue("inv failure", testThis("inv", "square", orig));
        
        System.out.println(" >>complete");
    }

}
