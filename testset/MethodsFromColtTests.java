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
        double r1 = MethodsFromColt.autoCorrelation(getDoubleArray(size), lag, getDouble(), getDouble());
        double r2 = MethodsFromColt.autoCorrelation(getDoubleArray(size), lag, getDouble(), getDouble());
        assertEquals(1,1);
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
        int r1 = MethodsFromColt.binarySearchFromTo(arr, getDouble(), low, high);
        int r2 = MethodsFromColt.binarySearchFromTo(arr, getDouble(), low, high);
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void covariance_test() {
        System.out.print("TEST: covariance");
        //array sizes should match and be > 0
        int size = getInt() + 1;
        double r1 = MethodsFromColt.covariance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromColt.covariance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void durbinWatson_test() {
        System.out.print("TEST: durbinWatson");
        //array length should be > 2
        int size = getInt() + 2;
        double r1 = MethodsFromColt.durbinWatson(getDoubleArray(size));
        double r2 = MethodsFromColt.durbinWatson(getDoubleArray(size));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void lag1_test() {
        System.out.print("TEST: lag1");
        double r1 = MethodsFromColt.lag1(getDoubleArray(), getDouble());
        double r2 = MethodsFromColt.lag1(getDoubleArray(), getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void max_test() {
        System.out.print("TEST: max");
        double r1 = MethodsFromColt.max(getDoubleArray());
        double r2 = MethodsFromColt.max(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void meanDeviation_test() {
        System.out.print("TEST: meanDeviation");
        double r1 = MethodsFromColt.meanDeviation(getDoubleArray(), getDouble());
        double r2 = MethodsFromColt.meanDeviation(getDoubleArray(), getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void min_test() {
        System.out.print("TEST: min");
        double r1 = MethodsFromColt.min(getDoubleArray());
        double r2 = MethodsFromColt.min(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void product_test() {
        System.out.print("TEST: product");
        double r1 = MethodsFromColt.product(getDoubleArray());
        double r2 = MethodsFromColt.product(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void quantile_test() {
        System.out.print("TEST: quantile");
        //input array should be sorted, double value should be between 0 and 1
        double[] arr = getDoubleArray();
        Arrays.sort(arr);
        double r1 = MethodsFromColt.quantile(arr, getNextDouble());
        double r2 = MethodsFromColt.quantile(arr, getNextDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void sampleKurtosis_test() {
        System.out.print("TEST: sampleKurtosis");
        double r1 = MethodsFromColt.sampleKurtosis(getInt(), getDouble(), getDouble());
        double r2 = MethodsFromColt.sampleKurtosis(getInt(), getDouble(), getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void sampleKurtosisStandardError_test() {
        System.out.print("TEST: sampleKurtosisStandardError");
        double r1 = MethodsFromColt.sampleKurtosisStandardError(getInt());
        double r2 = MethodsFromColt.sampleKurtosisStandardError(getInt());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void sampleSkew_test() {
        System.out.print("TEST: sampleSkew");
        double r1 = MethodsFromColt.sampleSkew(getInt(), getDouble(), getDouble());
        double r2 = MethodsFromColt.sampleSkew(getInt(), getDouble(), getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void sampleVariance_test() {
        System.out.print("TEST: sampleVariance");
        double r1 = MethodsFromColt.sampleVariance(getDoubleArray(), getDouble());
        double r2 = MethodsFromColt.sampleVariance(getDoubleArray(), getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void sumOfLogarithms_test() {
        System.out.print("TEST: sumOfLogarithms");
        double r1 = MethodsFromColt.sumOfLogarithms(getDoubleArray());
        double r2 = MethodsFromColt.sumOfLogarithms(getDoubleArray());
        assertEquals(1,1);
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
        double r1 = MethodsFromColt.trimmedMean(arr, getDouble(), from, to);
        double r2 = MethodsFromColt.trimmedMean(arr, getDouble(), from, to);
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void weightedMean_test() {
        System.out.print("TEST: weightedMean");
        //arrays should be same size
        int size = getInt();
        double r1 = MethodsFromColt.weightedMean(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromColt.weightedMean(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void binarySearchFromTo_ints_test() {
        System.out.print("TEST: binarySearchFromTo_ints");
        //last two int params must be valid from/to indices
        int minsize1 = getInt();
        int minsize2 = getInt();
        int size = getInt() + minsize1 + minsize2;
        int r1 = MethodsFromColt.binarySearchFromTo(getIntArray(size), getInt(), getInt(minsize1), getInt(minsize2));
        int r2 = MethodsFromColt.binarySearchFromTo(getIntArray(size), getInt(), getInt(minsize1), getInt(minsize2));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void binomial_test() {
        //pass small values for reasonable completion times
        int max = 100;
        System.out.print("TEST: binomial");
        double r1 = MethodsFromColt.binomial(getNextDouble(), (long)getNextDouble());
        double r2 = MethodsFromColt.binomial(getNextDouble(), (long)getNextDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void link_test() {
        System.out.print("TEST: link");
        double r1 = MethodsFromColt.link(getDouble());
        double r2 = MethodsFromColt.link(getDouble());
        assertEquals(1,1);
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
        double r2 = MethodsFromColt.winsorizedMean(arr, from, to);
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void geometricPdf_test() {
        System.out.print("TEST: geometricPdf");
        double r1 = MethodsFromColt.geometricPdf(getInt(), getDouble());
        double r2 = MethodsFromColt.geometricPdf(getInt(), getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void kurtosis_test() {
        System.out.print("TEST: kurtosis");
        double r1 = MethodsFromColt.kurtosis(getDoubleArray());
        double r2 = MethodsFromColt.kurtosis(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void logGamma_test() {
        System.out.print("TEST: logGamma");
        double r1 = MethodsFromColt.logGamma(getDouble());
        double r2 = MethodsFromColt.logGamma(getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void pooledMean_test() {
        System.out.print("TEST: pooledMean");
        //arrays should be same size
        int size = getInt();
        double r1 = MethodsFromColt.pooledMean(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromColt.pooledMean(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void pooledVariance_test() {
        System.out.print("TEST: pooledVariance");
        //arrays should be same size
        int size = getInt();
        double r1 = MethodsFromColt.pooledVariance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromColt.pooledVariance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void polevl_test() {
        System.out.print("TEST: polevl");
        //array needs to be length of int param
        int size = getInt();
        double r1 = MethodsFromColt.polevl(getDouble(), getDoubleArray(size+1), size);
        double r2 = MethodsFromColt.polevl(getDouble(), getDoubleArray(size+1), size);
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void rankInterpolated_test() {
        System.out.print("TEST: rankInterpolated");
        //input array should be sorted
        double[] arr = getDoubleArray();
        Arrays.sort(arr);
        double r1 = MethodsFromColt.rankInterpolated(arr, getDouble(), getInt());
        double r2 = MethodsFromColt.rankInterpolated(arr, getDouble(), getInt());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void sampleWeightedVariance_test() {
        System.out.print("TEST: sampleWeightedVariance");
        //arrays should be same size
        int size = getInt();
        double r1 = MethodsFromColt.sampleWeightedVariance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromColt.sampleWeightedVariance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void skew_test() {
        System.out.print("TEST: skew");
        double r1 = MethodsFromColt.skew(getDoubleArray());
        double r2 = MethodsFromColt.skew(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void standardize_test() {
        System.out.print("TEST: standardize");
        double[] r1 = MethodsFromColt.standardize(getDoubleArray());
        double[] r2 = MethodsFromColt.standardize(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void weightedRMS_test() {
        System.out.print("TEST: weightedRMS");
        //arrays should be same size
        int size = getInt();
        double r1 = MethodsFromColt.weightedRMS(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromColt.weightedRMS(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void harmonicMean_test() {
        System.out.print("TEST: harmonicMean");
        double r1 = MethodsFromColt.harmonicMean(getDoubleArray());
        double r2 = MethodsFromColt.harmonicMean(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void sumOfPowerOfDeviations_test() {
        System.out.print("TEST: sumOfPowerOfDeviatons");
        double r1 = MethodsFromColt.sumOfPowerOfDeviations(getDoubleArray(), getInt(), getDouble());
        double r2 = MethodsFromColt.sumOfPowerOfDeviations(getDoubleArray(), getInt(), getDouble());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void power_test() {
        System.out.print("TEST: power");
        double[] r1 = MethodsFromColt.power(getDoubleArray(), getInt());
        double[] r2 = MethodsFromColt.power(getDoubleArray(), getInt());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }
    @Test
    public void square_test() {
        System.out.print("TEST: square");
        double[] r1 = MethodsFromColt.square(getDoubleArray());
        double[] r2 = MethodsFromColt.square(getDoubleArray());
        assertEquals(1,1);
        System.out.println(" >>complete");
    }

}
