import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromApacheMath;
import java.util.Arrays;

public class MethodsFromApacheMathTests extends TestClass {

    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodsFromApacheMath", function, args);
    }    

    @Test
    public void distance1_test() {
        //arrays should be same size
        //double r1 = MethodsFromApacheMath.distance1(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "distance", dpair1, dpair2));
        assertTrue("exc failure", testThis("exc", "distance", dpair1, dpair2));
        assertTrue("inc failure", testThis("inc", "distance", dpair1, dpair2));
        assertTrue("inv failure", testThis("inv", "distance", dpair1, dpair2));
    }

    @Test
    public void distanceInf_test() {
        //arrays should be same size
        //double r1 = MethodsFromApacheMath.distanceInf(arg1, arg2);

	assertTrue("mult failure", testThis("mult", "distanceInf", dpair1, dpair2));
	assertTrue("exc failure", testThis("exc", "distanceInf", dpair1, dpair2));
	assertTrue("inc failure", testThis("inc", "distanceInf", dpair1, dpair2));
	assertTrue("inv failure", testThis("inv", "distanceInf", dpair1, dpair2));
    }

    @Test
    public void ebeAdd_test() {
        //Most execution paths require arrays of matching size
        //double[] r1 = MethodsFromApacheMath.ebeAdd(orig1, orig2);

        assertTrue("add failure", testThis("add", "ebeAdd", dpair1, dpair2));
        assertTrue("mult failure", testThis("mult", "ebeAdd", dpair1, dpair2));
        assertTrue("inv failure", testThis("inv", "ebeAdd", dpair1, dpair2));
    }

    @Test
    public void ebeDivide_test() {
        //Most execution paths require arrays of matching size
        //double[] r1 = MethodsFromApacheMath.ebeDivide(orig1, orig2);

        assertTrue("add failure", testThis("add", "ebeDivide", dpair1, dpair2));
        assertTrue("mult failure", testThis("mult", "ebeDivide", dpair1, dpair2));
        assertTrue("inv failure", testThis("inv", "ebeDivide", dpair1, dpair2));
    }

    @Test
    public void ebeMultiply_test() {
        //Most execution paths require arrays of matching size
        //double[] r1 = MethodsFromApacheMath.ebeMultiply(firstArg, secondArg);

        assertTrue("add failure", testThis("add", "ebeMultiply", dpair1, dpair2));
        assertTrue("mult failure", testThis("mult", "ebeMultiply", dpair1, dpair2));
        assertTrue("inv failure", testThis("inv", "ebeMultiply", dpair1, dpair2));
    }

    @Test
    public void safeNorm_test() {
        //double r1 = MethodsFromApacheMath.safeNorm(orig);
        
        assertTrue("add failure", testThis("add", "safeNorm", darr1));
        assertTrue("mult failure", testThis("mult", "safeNorm", darr1));
        assertTrue("perm failure", testThis("perm", "safeNorm", darr1));
    }

    @Test
    public void scale_test() {
        double arg1 = getDouble();
        double[] orig = getDoubleArray();
        //double[] r1 = MethodsFromApacheMath.scale(arg1, orig);

        assertTrue("add failure", testThis("add", "scale", arg1, orig));
        assertTrue("mult failure", testThis("mult", "scale", arg1, orig));
        assertTrue("inv failure", testThis("inv", "scale", arg1, orig));
    }

    @Test
    public void entropy_test() {
        //double r1 = MethodsFromApacheMath.entropy(orig);

        assertTrue("add failure", testThis("add", "entropy", darr1));
        assertTrue("mult failure", testThis("mult", "entropy", darr1));
        assertTrue("perm failure", testThis("perm", "entropy", darr1));
        assertTrue("inv failure", testThis("inv", "entropy", darr1));
    }

    @Test
    public void g_test() {
        //Input arrays must be same length and length must be >= 2
        //double r1 = MethodsFromApacheMath.g(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "g", dpair1, dpair2));
        assertTrue("inv failure", testThis("inv", "g", dpair1, dpair2));
    }

    @Test
    public void calculateAbsoluteDifferences_test() {
        //length cannot be zero
        //double[] r1 = MethodsFromApacheMath.calculateAbsoluteDifferences(orig);
        
        assertTrue("add failure", testThis("add", "calculateAbsoluteDifferences", darr1));
        assertTrue("mult failure", testThis("mult", "calculateAbsoluteDifferences", darr1));
        assertTrue("inv failure", testThis("inv", "calculateAbsoluteDifferences", darr1));
    }

    @Test
    public void computeCanberraDistance_test() {
        //Arrays must be same length
        //double r1 = MethodsFromApacheMath.computeCanberraDistance(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "computeCanberraDistance", dpair1, dpair2));
        assertTrue("exc failure", testThis("exc", "computeCanberraDistance", dpair1, dpair2));
        assertTrue("inc failure", testThis("inc", "computeCanberraDistance", dpair1, dpair2));
        assertTrue("inv failure", testThis("inv", "computeCanberraDistance", dpair1, dpair2));
    }

    @Test
    public void evaluateHoners_test() {
        //Array length must be at least 1
        //double r1 = MethodsFromApacheMath.evaluateHoners(orig, secondArg);

        assertTrue("add failure", testThis("add", "evaluateHoners", darr1, darg1));
        assertTrue("mult failure", testThis("mult", "evaluateHoners", darr1, darg1));
        assertTrue("inc failure", testThis("inc", "evaluateHoners", darr1, darg1));
        assertTrue("inv failure", testThis("inv", "evaluateHoners", darr1, darg1));
    }

    @Test
    public void evaluateInternal_test() {
        //First array arg must be at least length 2 and be monotonically increasing
        //double r1 = MethodsFromApacheMath.evaluateInternal(firstArg, secondArg, thirdArg);

        assertTrue("add failure", testThis("add", "evaluateInternal", dsortedpair1, dsortedpair2, darg1)); //okay to fail
        assertTrue("mult failure", testThis("mult", "evaluateInternal", dsortedpair1, dsortedpair2, darg1));
        assertTrue("inv failure", testThis("inv", "evaluateInternal", dsortedpair1, dsortedpair2, darg1));
    }

   @Test
   public void evaluateNewton_test() {
       //First arg and second arg must have length difference of 1, each must be at least length 1
       //double r1 = MethodsFromApacheMath.evaluateNewton(firstArg, secondArg, thirdArg);

       double[] dpairminus1 = new double[dpair2.length];
       for (int i = 0; i < dpair1.length - 1; i++) {
           dpairminus1[i] = dpair1[i];
       }

       assertTrue("add failure", testThis("add", "evaluateNewton", dpair2, dpairminus1, darg1));
       assertTrue("mult failure", testThis("mult", "evaluateNewton", dpair2, dpairminus1, darg1));
       assertTrue("exc failure", testThis("exc", "evaluateNewton", dpair2, dpairminus1, darg1));
       assertTrue("inc failure", testThis("inc", "evaluateNewton", dpair2, dpairminus1, darg1));
       assertTrue("inv failure", testThis("inv", "evaluateNewton", dpair2, dpairminus1, darg1));
   }

   @Test
   public void meanDifference_test() {
       //inputs must have matching and positive lengths
       //double r1 = MethodsFromApacheMath.meanDifference(arg1, arg2);

       assertTrue("mult failure", testThis("mult", "meanDifference", dpair1, dpair2));
       assertTrue("inv failure", testThis("inv", "meanDifference", dpair1, dpair2));
   }

   //@Test
   public void equals_test() {
        //most code paths require same-length inputs
        //boolean r1 = MethodsFromApacheMath.equals(arg1, arg2);

	assertTrue("inc failure", testThis("inc", "equals", dpair1, dpair2));
   }

   @Test
   public void chiSquare_test() {
        //zero cannot be in the first argument and both arguments must be at least length 2
        int size = getInt() + 2;
        double[] arg1 = getDoubleArray(size);
        for (int i = 0; i < arg1.length; i++) {
            arg1[i] = arg1[i] + 1; //Ensure strictly positive
        }
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromApacheMath.chiSquare(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "chiSquare", dpair1, dpair2));
        assertTrue("exc failure", testThis("exc", "chiSquare", dpair1, dpair2));
        assertTrue("inc failure", testThis("inc", "chiSquare", dpair1, dpair2));
        assertTrue("inv failure", testThis("inv", "chiSquare", dpair1, dpair2));
   }

  @Test
  public void partition_test() {
        int begin = getInt() + 5;
        int end = begin + getInt() + 5;
        int pivot =  end - begin;
        int size = end + begin + getInt();
        double[] arr = getDoubleArray(size);
        //int r1 = MethodsFromApacheMath.partition(arr, begin, end, pivot);

        assertTrue("add failure", testThis("add", "partition", arr, begin, end, pivot));
        assertTrue("mult failure", testThis("mult", "partition", arr, begin, end, pivot));
        assertTrue("inv failure", testThis("inv", "partition", arr, begin, end, pivot));
  }

  @Test
  public void evaluateWeightedProduct_test() {
        //First two args must be same length and have one or more elements, second two args must be valid start and length indices
        int start = getInt();
        int length = getInt() + 2;
        int size = getInt() + start + length + 1;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromApacheMath.evaluateWeightedProduct(arg1, arg2, start, length);

	assertTrue("mult failure", testThis("mult", "evaluateWeightedProduct", arg1, arg2, start, length)); //Array out of bounds okay
	assertTrue("exc failure", testThis("exc", "evaluateWeightedProduct", arg1, arg2, start, length));
	assertTrue("inc failure", testThis("inc", "evaluateWeightedProduct", arg1, arg2, start, length));
  }

}
