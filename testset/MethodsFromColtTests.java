import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromColt;
import java.util.Arrays;

public class MethodsFromColtTests extends TestClass {

    @Test
    public void autoCorrelation_test() {
        System.out.print("TEST: autoCorrelation");
        //second arg should be less than length of first
        int lag = getInt();
        int size = getInt() + lag;
        double[] orig = getDoubleArray(size);
        double r1 = MethodsFromColt.autoCorrelation(orig, lag, getDouble(), getDouble());

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.autoCorrelation(addIn, lag, getDouble(), getDouble());
        assertTrue("add failure", addTest(r1, addOut));

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

        //add
        int c = getInt();
        double[] addIn = add(arr, c);
        int addOut = MethodsFromColt.binarySearchFromTo(addIn, secondArg, low, high);
        assertTrue("add failure", addTest(r1, addOut));
        
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

        //add
        int c = getInt();
        double[] addIn1 = add(orig1, c);
        double[] addIn2 = add(orig2, c);
        double addOut = MethodsFromColt.covariance(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));

        System.out.println(" >>complete");
    }
    @Test
    public void durbinWatson_test() {
        System.out.print("TEST: durbinWatson");
        //array length should be > 2
        int size = getInt() + 2;
	double[] arg1 = getDoubleArray(size);
        double r1 = MethodsFromColt.durbinWatson(arg1);
        System.out.println(" >>complete");
    }
    @Test
    public void lag1_test() {
        System.out.print("TEST: lag1");
        double[] orig = getDoubleArray();
        double arg2 = getDouble();
        double r1 = MethodsFromColt.lag1(orig, arg2);

        //add
        int c = getInt();
        double[] add = add(orig, c);
        double addOut = MethodsFromColt.lag1(add, arg2);
        assertTrue("add failure", addTest(r1, addOut));
        
        System.out.println(" >>complete");
    }
    @Test
    public void max_test() {
        System.out.print("TEST: max");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.max(orig);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.max(addIn);
        assertTrue("add failure", addTest(r1, addOut));
        
        System.out.println(" >>complete");
    }
    @Test
    public void meanDeviation_test() {
        System.out.print("TEST: meanDeviation");
        double[] orig = getDoubleArray();
        double secondArg = getDouble();
        double r1 = MethodsFromColt.meanDeviation(orig, secondArg);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.meanDeviation(addIn, secondArg);
        assertTrue("add failure", addTest(r1, addOut));
        
        System.out.println(" >>complete");
    }
    @Test
    public void min_test() {
        System.out.print("TEST: min");
	double[] arg1 = getDoubleArray();
        double r1 = MethodsFromColt.min(arg1);
        System.out.println(" >>complete");
    }
    @Test
    public void product_test() {
        System.out.print("TEST: product");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.product(orig);
        
        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.product(addIn);
        assertTrue("add failure", addTest(r1, addOut));

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

        //add
        int c = getInt();
        double[] addIn1 = add(arr, c);
        double addIn2 = add(secondArg, c);
        double addOut = MethodsFromColt.quantile(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));

        System.out.println(" >>complete");
    }
    @Test
    public void sampleKurtosis_test() {
        System.out.print("TEST: sampleKurtosis");
        int arg1 = getInt();
        double arg2 = getDouble();
        double arg3 = getDouble();
        double r1 = MethodsFromColt.sampleKurtosis(arg1, arg2, arg3);

        //add
        int constant = getInt();
        int addIn1 = arg1 + constant;
        double addIn2 = arg2 + (double)constant;
        double addIn3 = arg3 + (double)constant;
        double addOut = MethodsFromColt.sampleKurtosis(addIn1, addIn2, addIn3);
        assertTrue("add failure", addTest(r1, addOut));
        
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

        //add
        int c = getInt();
        int addIn1 = add(firstArg, c);
        double addIn2 = add(secondArg, c);
        double addIn3 = add(thirdArg, c);
        double addOut = MethodsFromColt.sampleSkew(addIn1, addIn2, addIn3);
        assertTrue("add failure", addTest(r1, addOut));

        System.out.println(" >>complete");
    }
    @Test
    public void sampleVariance_test() {
        System.out.print("TEST: sampleVariance");
        double secondArg = getDouble();
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.sampleVariance(orig, secondArg);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.sampleVariance(addIn, secondArg);
        assertTrue("add failure", addTest(r1, addOut));
    }
    @Test
    public void sumOfLogarithms_test() {
        System.out.print("TEST: sumOfLogarithms");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.sumOfLogarithms(orig);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.sumOfLogarithms(addIn);
        assertTrue("add failure", addTest(r1, addOut));
        
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

        //add
        int c = getInt();
        double[] addIn1 = add(orig1, c);
        double[] addIn2 = add(orig2, c);
        double addOut = MethodsFromColt.weightedMean(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));
        
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

        //add
        int c = getInt();
        double[] addIn = add(arr, c);
        double addOut = MethodsFromColt.winsorizedMean(addIn, from, to);
        assertTrue("add failure", addTest(r1, addOut));

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
        
        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.kurtosis(addIn);
        assertTrue("add failure", addTest(r1, addOut));
        
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

        //add
        int c = getInt();
        double[] addIn1 = add(orig1, c);
        double[] addIn2 = add(orig2, c);
        double addOut = MethodsFromColt.pooledMean(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));

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

        //add
        int c = getInt();
        double[] addIn1 = add(orig1, c);
        double[] addIn2 = add(orig2, c);
        double addOut = MethodsFromColt.pooledVariance(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));

        System.out.println(" >>complete");
    }
    @Test
    public void polevl_test() {
        System.out.print("TEST: polevl");
        //array needs to be length of int param
        int size = getInt();
        double[] orig = getDoubleArray(size+1);
        double r1 = MethodsFromColt.polevl(getDouble(), orig, size);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.polevl(getDouble(), addIn, size);
        assertTrue("add failure", addTest(r1, addOut));
        
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

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.skew(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }
    @Test
    public void standardize_test() {
        System.out.print("TEST: standardize");
        double[] orig = getDoubleArray();
        double[] r1 = MethodsFromColt.standardize(orig);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double[] addOut = MethodsFromColt.standardize(addIn);
        assertTrue("add failure", addTest(r1, addOut));

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
        System.out.println(" >>complete");
    }
    @Test
    public void harmonicMean_test() {
        System.out.print("TEST: harmonicMean");
        double[] orig = getDoubleArray();
        double r1 = MethodsFromColt.harmonicMean(orig);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double addOut = MethodsFromColt.harmonicMean(addIn);
        assertTrue("add failure", addTest(r1, addOut));
        
        System.out.println(" >>complete");
    }
    @Test
    public void sumOfPowerOfDeviations_test() {
        System.out.print("TEST: sumOfPowerOfDeviatons");
	double[] arg1 = getDoubleArray();
	int arg2 = getInt();
	double arg3 = getDouble();
        double r1 = MethodsFromColt.sumOfPowerOfDeviations(arg1, arg2, arg3);
        System.out.println(" >>complete");
    }
    @Test
    public void power_test() {
        System.out.print("TEST: power");
        double[] orig = getDoubleArray();
        int secondArg = getInt();
        double[] r1 = MethodsFromColt.power(orig, secondArg);
        
        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double[] addOut = MethodsFromColt.power(addIn, secondArg);
        assertTrue("add failure", addTest(r1, addOut));
        
        System.out.println(" >>complete");
    }
    @Test
    public void square_test() {
        System.out.print("TEST: square");
        double[] orig = getDoubleArray();
        double[] r1 = MethodsFromColt.square(orig);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        double[] addOut = MethodsFromColt.square(addIn);
        assertTrue("add failure", addTest(r1, addOut));
        
        System.out.println(" >>complete");
    }

}
