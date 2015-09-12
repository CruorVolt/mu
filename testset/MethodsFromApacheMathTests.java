import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromApacheMath;
import java.util.Arrays;

public class MethodsFromApacheMathTests extends TestClass {

    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodsFromApacheMath", function, args);
    }    
	 
    @Test
    public void distance_test() {
        //arrays should be same size
        int size = getInt() + 1;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromApacheMath.distance(arg1, arg2);
    }

    @Test
    public void distance1_test() {
        //arrays should be same size
        int size = getInt() + 1;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromApacheMath.distance1(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "distance", arg1, arg2));

        assertTrue("exc failure", testThis("exc", "distance", arg1, arg2));

        assertTrue("inc failure", testThis("inc", "distance", arg1, arg2));
    }

    @Test
    public void distanceInf_test() {
        //arrays should be same size
        int size = getInt() + 1;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromApacheMath.distanceInf(arg1, arg2);

	assertTrue("mult failure", testThis("mult", "distanceInf", arg1, arg2));

	assertTrue("exc failure", testThis("exc", "distanceInf", arg1, arg2));

	assertTrue("inc failure", testThis("inc", "distanceInf", arg1, arg2));
    }

    @Test
    public void ebeAdd_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] orig1 = getDoubleArray(arraySize);
        double[] orig2 = getDoubleArray(arraySize);
        double[] r1 = MethodsFromApacheMath.ebeAdd(orig1, orig2);

        assertTrue("add failure", testThis("add", "ebeAdd", orig1, orig2));

        assertTrue("mult failure", testThis("mult", "ebeAdd", orig1, orig2));
    }

    @Test
    public void ebeDivide_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] orig1 = getDoubleArray(arraySize);
        double[] orig2 = getDoubleArray(arraySize);
        double[] r1 = MethodsFromApacheMath.ebeDivide(orig1, orig2);

        assertTrue("add failure", testThis("add", "ebeDivide", orig1, orig2));

        assertTrue("mult failure", testThis("mult", "ebeDivide", orig1, orig2));
    }

    @Test
    public void ebeMultiply_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] firstArg = getDoubleArray(arraySize);
        double[] secondArg = getDoubleArray(arraySize);
        double[] r1 = MethodsFromApacheMath.ebeMultiply(firstArg, secondArg);

        assertTrue("add failure", testThis("add", "ebeMultiply", firstArg, secondArg));

        assertTrue("mult failure", testThis("mult", "ebeMultiply", firstArg, secondArg));
    }

    @Test
    public void ebeSubtract_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
	double[] arg1 = getDoubleArray(arraySize);
	double[] arg2 = getDoubleArray(arraySize);
        double[] r1 = MethodsFromApacheMath.ebeSubtract(arg1, arg2);
    }

    @Test
    public void safeNorm_test() {
        double[] orig = getDoubleArray();
        double r1 = MethodsFromApacheMath.safeNorm(orig);
        
        assertTrue("add failure", testThis("add", "safeNorm", orig));
        
        assertTrue("mult failure", testThis("mult", "safeNorm", orig));
        
        assertTrue("per failure", testThis("per", "safeNorm", orig));
    }

    @Test
    public void scale_test() {
        double arg1 = getDouble();
        double[] orig = getDoubleArray();
        double[] r1 = MethodsFromApacheMath.scale(arg1, orig);

        assertTrue("add failure", testThis("add", "scale", arg1, orig));

        assertTrue("mult failure", testThis("mult", "scale", arg1, orig));
    }

    @Test
    public void entropy_test() {
        double[] orig = getDoubleArray();
        double r1 = MethodsFromApacheMath.entropy(orig);

        assertTrue("add failure", testThis("add", "entropy", orig));

        assertTrue("mult failure", testThis("mult", "entropy", orig));

        assertTrue("per failure", testThis("per", "entropy", orig));
    }

    @Test
    public void g_test() {
        //Input arrays must be same length and length must be >= 2
        int size = getInt() + 2;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromApacheMath.g(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "g", arg1, arg2));
        
    }

    @Test
    public void calculateAbsoluteDifferences_test() {
        //length cannot be zero
        double[] orig = getDoubleArray();
        double[] r1 = MethodsFromApacheMath.calculateAbsoluteDifferences(orig);
        
        assertTrue("add failure", testThis("add", "calculateAbsoluteDifferences", orig));
        
        assertTrue("mult failure", testThis("mult", "calculateAbsoluteDifferences", orig));
    }

    @Test
    public void calculateDifferences_test() {
        //Arrays must be same length
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double[] r1 = MethodsFromApacheMath.calculateDifferences(arg1, arg2);
    }

    @Test
    public void computeDividedDifference_test() {
        //Arrays must be same length
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double[] r1 = MethodsFromApacheMath.computeDividedDifference(arg1, arg2);
    }

    @Test
    public void computeCanberraDistance_test() {
        //Arrays must be same length
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromApacheMath.computeCanberraDistance(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "computeCanberraDistance", arg1, arg2));

        assertTrue("exc failure", testThis("exc", "computeCanberraDistance", arg1, arg2));

        assertTrue("inc failure", testThis("inc", "computeCanberraDistance", arg1, arg2));
    }

    @Test
    public void evaluateHoners_test() {
        //Array length must be at least 1
        double[] orig = getDoubleArray();
        double secondArg = getDouble();
        double r1 = MethodsFromApacheMath.evaluateHoners(orig, secondArg);

        assertTrue("add failure", testThis("add", "evaluateHoners", orig, secondArg));

        assertTrue("mult failure", testThis("mult", "evaluateHoners", orig, secondArg));

        assertTrue("inc failure", testThis("inc", "evaluateHoners", orig, secondArg));
    }

    @Test
    public void evaluateInternal_test() {
        //First array arg must be at least length 2 and be monotonically increasing
        int length = getInt() + 2;
        double[] firstArg = getDoubleArray(length);
        Arrays.sort(firstArg);
        double[] secondArg = getDoubleArray(length);
        double thirdArg = getDouble();
        double r1 = MethodsFromApacheMath.evaluateInternal(firstArg, secondArg, thirdArg);

        assertTrue("add failure", testThis("add", "evaluateInterval", firstArg, secondArg, thirdArg));

        assertTrue("mult failure", testThis("mult", "evaluateInterval", firstArg, secondArg, thirdArg));
    }

   @Test
   public void evaluateNewton_test() {
       //First arg and second arg must have length difference of 1, each must be at least length 1
       int size = getInt() + 2;
       double[] firstArg = getDoubleArray(size);
       double[] secondArg = getDoubleArray(size - 1);
       double thirdArg = getDouble();
       double r1 = MethodsFromApacheMath.evaluateNewton(firstArg, secondArg, thirdArg);

       assertTrue("add failure", testThis("add", "evaluateNewton", firstArg, secondArg, thirdArg));

       assertTrue("mult failure", testThis("mult", "evaluateNewton", firstArg, secondArg, thirdArg));

       assertTrue("exc failure", testThis("exc", "evaluateNewton", firstArg, secondArg, thirdArg));

       assertTrue("inc failure", testThis("inc", "evaluateNewton", firstArg, secondArg, thirdArg));
   }

   @Test
   public void meanDifference_test() {
       //inputs must have matching and positive lengths
       int size = getInt() + 1;
       double[] arg1 = getDoubleArray(size);
       double[] arg2 = getDoubleArray(size);
       double r1 = MethodsFromApacheMath.meanDifference(arg1, arg2);

       assertTrue("mult failure", testThis("mult", "meanDifference", arg1, arg2));
   }

   @Test
   public void varianceDifference_test() {
       //inputs must have matching lengths of at least 2
       int size = getInt() + 2;
       double[] arg1 = getDoubleArray(size);
       double[] arg2 = getDoubleArray(size);
       double r1 = MethodsFromApacheMath.varianceDifference(arg1, arg2);
   }

   @Test
   public void equals_test() {
        //most code paths require same-length inputs
        int size = getInt();
        double[] arg1 = getDoubleArray(size);
        double[] arg2 = getDoubleArray(size);
        boolean r1 = MethodsFromApacheMath.equals(arg1, arg2);

	assertTrue("inc failure", testThis("inc", "equals", arg1, arg2));
   }

   /* Doesn't make sense
   @Test
   public void checkNonNegative_test() {
        double[] orig = getDoubleArray();
        boolean r1 = MethodsFromApacheMath.checkNonNegative(orig);

        //add
        int c = getInt();
        double[] addIn = add(orig, c);
        boolean addOut = MethodsFromApacheMath.checkNonNegative(addIn);
        assertTrue("add failure", addTest(r1, addOut));
   }
   */

   @Test
   public void checkPositive_test() {
	double[] arg1 = getDoubleArray();
        boolean r1 = MethodsFromApacheMath.checkPositive(arg1);
	
	assertTrue("mult failure", testThis("mult", "checkPositive", arg1));
	
	assertTrue("inc failure", testThis("inc", "checkPositive", arg1));
	
	assertTrue("per failure", testThis("per", "checkPositive", arg1));
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
        double r1 = MethodsFromApacheMath.chiSquare(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "chiSquare", arg1, arg2));

        assertTrue("exc failure", testThis("exc", "chiSquare", arg1, arg2));

        assertTrue("inc failure", testThis("inc", "chiSquare", arg1, arg2));
   }

  @Test
  public void evaluateSemiVariance_test() {
        int start = getInt();
        int length = getInt() + 2;
        int size = getInt() + start + length + 1;
	double[] arg1 = getDoubleArray(size);
	double arg2 = getDouble();
	boolean arg3 = getBoolean();
	boolean arg4 = getBoolean();
        double r1 = MethodsFromApacheMath.evaluateSemiVariance(arg1, arg2, arg3, arg4, start, length);
  }

  @Test
  public void partition_test() {
        int begin = getInt() + 5;
        int end = begin + getInt() + 5;
        int pivot =  end - begin;
        int size = end + begin + getInt();
        double[] arr = getDoubleArray(size);
        int r1 = MethodsFromApacheMath.partition(arr, begin, end, pivot);

        assertTrue("add failure", testThis("add", "partition", arr, begin, end, pivot));

        assertTrue("mult failure", testThis("mult", "partition", arr, begin, end, pivot));
  }

  @Test
  public void evaluateWeightedProduct_test() {
        //First two args must be same length and have one or more elements, second two args must be valid start and length indices
        int start = getInt();
        int length = getInt() + 2;
        int size = getInt() + start + length + 1;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromApacheMath.evaluateWeightedProduct(arg1, arg2, start, length);

	assertTrue("mult failure", testThis("mult", "evaluateWeightedProduct", arg1, arg2, start, length));

	assertTrue("exc failure", testThis("exc", "evaluateWeightedProduct", arg1, arg2, start, length));

	assertTrue("inc failure", testThis("inc", "evaluateWeightedProduct", arg1, arg2, start, length));
  }

}
