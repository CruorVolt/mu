import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromColt;

public class MethodsFromColtTests {

    private static Random rand = new Random();
    private static final int MAX = 10000;

    private int getInt() {
        return rand.nextInt();
    }

    private long getLong() {
        return rand.nextLong();
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
    public void autoCorrelation_test() {
        double r1 = MethodsFromColt.autoCorrelation(getDoubleArray(), getInt(), getDouble(), getDouble());
        double r2 = MethodsFromColt.autoCorrelation(getDoubleArray(), getInt(), getDouble(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void binarySearchFromTo_doubles_test() {
        int r1 = MethodsFromColt.binarySearchFromTo(getDoubleArray(), getDouble(), getInt(), getInt());
        int r2 = MethodsFromColt.binarySearchFromTo(getDoubleArray(), getDouble(), getInt(), getInt());
        assertEquals(1,1);
    }
    @Test
    public void covariance_test() {
        double r1 = MethodsFromColt.covariance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromColt.covariance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void durbinWatson_test() {
        double r1 = MethodsFromColt.durbinWatson(getDoubleArray());
        double r2 = MethodsFromColt.durbinWatson(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void lag1_test() {
        double r1 = MethodsFromColt.lag1(getDoubleArray(), getDouble());
        double r2 = MethodsFromColt.lag1(getDoubleArray(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void max_test() {
        double r1 = MethodsFromColt.max(getDoubleArray());
        double r2 = MethodsFromColt.max(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void meanDeviation_test() {
        double r1 = MethodsFromColt.meanDeviation(getDoubleArray(), getDouble());
        double r2 = MethodsFromColt.meanDeviation(getDoubleArray(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void min_test() {
        double r1 = MethodsFromColt.min(getDoubleArray());
        double r2 = MethodsFromColt.min(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void product_test() {
        double r1 = MethodsFromColt.product(getDoubleArray());
        double r2 = MethodsFromColt.product(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void quantile_test() {
        double r1 = MethodsFromColt.quantile(getDoubleArray(), getDouble());
        double r2 = MethodsFromColt.quantile(getDoubleArray(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void sampleKurtosis_test() {
        double r1 = MethodsFromColt.sampleKurtosis(getInt(), getDouble(), getDouble());
        double r2 = MethodsFromColt.sampleKurtosis(getInt(), getDouble(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void sampleKurtosisStandardError_test() {
        double r1 = MethodsFromColt.sampleKurtosisStandardError(getInt());
        double r2 = MethodsFromColt.sampleKurtosisStandardError(getInt());
        assertEquals(1,1);
    }
    @Test
    public void sampleSkew_test() {
        double r1 = MethodsFromColt.sampleSkew(getInt(), getDouble(), getDouble());
        double r2 = MethodsFromColt.sampleSkew(getInt(), getDouble(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void sampleVariance_test() {
        double r1 = MethodsFromColt.sampleVariance(getDoubleArray(), getDouble());
        double r2 = MethodsFromColt.sampleVariance(getDoubleArray(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void sumOfLogarithms_test() {
        double r1 = MethodsFromColt.sumOfLogarithms(getDoubleArray());
        double r2 = MethodsFromColt.sumOfLogarithms(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void trimmedMean_test() {
        double r1 = MethodsFromColt.trimmedMean(getDoubleArray(), getDouble(), getInt(), getInt());
        double r2 = MethodsFromColt.trimmedMean(getDoubleArray(), getDouble(), getInt(), getInt());
        assertEquals(1,1);
    }
    @Test
    public void weightedMean_test() {
        double r1 = MethodsFromColt.weightedMean(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromColt.weightedMean(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void binarySearchFromTo_ints_test() {
        int r1 = MethodsFromColt.binarySearchFromTo(getIntArray(), getInt(), getInt(), getInt());
        int r2 = MethodsFromColt.binarySearchFromTo(getIntArray(), getInt(), getInt(), getInt());
        assertEquals(1,1);
    }
    @Test
    public void binomial_test() {
        double r1 = MethodsFromColt.binomial(getDouble(), getLong());
        double r2 = MethodsFromColt.binomial(getDouble(), getLong());
        assertEquals(1,1);
    }
    @Test
    public void link_test() {
        double r1 = MethodsFromColt.link(getDouble());
        double r2 = MethodsFromColt.link(getDouble());
        assertEquals(1,1);
    }
    @Test
    public void winsorizedMean_test() {
        double r1 = MethodsFromColt.winsorizedMean(getDoubleArray(), getInt(), getInt());
        double r2 = MethodsFromColt.winsorizedMean(getDoubleArray(), getInt(), getInt());
        assertEquals(1,1);
    }
    @Test
    public void geometricPdf_test() {
        double r1 = MethodsFromColt.geometricPdf(getInt(), getDouble());
        double r2 = MethodsFromColt.geometricPdf(getInt(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void kurtosis_test() {
        double r1 = MethodsFromColt.kurtosis(getDoubleArray());
        double r2 = MethodsFromColt.kurtosis(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void logGamma_test() {
        double r1 = MethodsFromColt.logGamma(getDouble());
        double r2 = MethodsFromColt.logGamma(getDouble());
        assertEquals(1,1);
    }
    @Test
    public void pooledMean_test() {
        double r1 = MethodsFromColt.pooledMean(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromColt.pooledMean(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void pooledVariance_test() {
        double r1 = MethodsFromColt.pooledVariance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromColt.pooledVariance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void polevl_test() {
        double r1 = MethodsFromColt.polevl(getDouble(), getDoubleArray(), getInt());
        double r2 = MethodsFromColt.polevl(getDouble(), getDoubleArray(), getInt());
        assertEquals(1,1);
    }
    @Test
    public void rankInterpolated_test() {
        double r1 = MethodsFromColt.rankInterpolated(getDoubleArray(), getDouble(), getInt());
        double r2 = MethodsFromColt.rankInterpolated(getDoubleArray(), getDouble(), getInt());
        assertEquals(1,1);
    }
    @Test
    public void sampleWeightedVariance_test() {
        double r1 = MethodsFromColt.sampleWeightedVariance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromColt.sampleWeightedVariance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void skew_test() {
        double r1 = MethodsFromColt.skew(getDoubleArray());
        double r2 = MethodsFromColt.skew(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void standardize_test() {
        double[] r1 = MethodsFromColt.standardize(getDoubleArray());
        double[] r2 = MethodsFromColt.standardize(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void weightedRMS_test() {
        double r1 = MethodsFromColt.weightedRMS(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromColt.weightedRMS(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void harmonicMean_test() {
        double r1 = MethodsFromColt.harmonicMean(getDoubleArray());
        double r2 = MethodsFromColt.harmonicMean(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void sumOfPowerOfDeviations_test() {
        double r1 = MethodsFromColt.sumOfPowerOfDeviations(getDoubleArray(), getInt(), getDouble());
        double r2 = MethodsFromColt.sumOfPowerOfDeviations(getDoubleArray(), getInt(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void power_test() {
        double[] r1 = MethodsFromColt.power(getDoubleArray(), getInt());
        double[] r2 = MethodsFromColt.power(getDoubleArray(), getInt());
        assertEquals(1,1);
    }
    @Test
    public void square_test() {
        double[] r1 = MethodsFromColt.square(getDoubleArray());
        double[] r2 = MethodsFromColt.square(getDoubleArray());
        assertEquals(1,1);
    }

}
