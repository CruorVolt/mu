import org.junit.Test;
import static org.junit.Assert.*;
//import Test.MethodsFromApacheMath;
import java.util.Arrays;
import static org.hamcrest.Matchers.equalTo;

public class MethodsFromApacheMathTests extends TestClass {

    public boolean testThis(String test, String function, Object... args) {
        String testType = System.getProperty("test");
        if (testType.equals("mr")) {
            return super.testThis(test, "MethodsFromApacheMath", function, args);
        } else if (testType.equals("pre")) {
            return super.testThisPre(test, "MethodsFromApacheMath", function, args);
        } else if (testType.equals("post")) {
            return super.testThisPost(test, "MethodsFromApacheMath", function, args);
        }
        return true;
    }    
	 
    @Test
    public void distance1_test() {
        //arrays should be same size
        int size = getInt() + 1;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromApacheMath.distance1(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "distance1", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "distance1", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "distance1", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "distance1", arg1, arg2), equalTo(true));
    }

    @Test
    public void distanceInf_test() {
        //arrays should be same size
        int size = getInt() + 1;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromApacheMath.distanceInf(arg1, arg2);

        String fail = "";
	collector.checkThat(fail += "mult&", testThis("mult", "distanceInf", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "exc&", testThis("exc", "distanceInf", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "inc&", testThis("inc", "distanceInf", arg1, arg2), equalTo(true));
	collector.checkThat(fail += "inv&", testThis("inv", "distanceInf", arg1, arg2), equalTo(true));
    }

    @Test
    public void ebeAdd_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] orig1 = getDoubleArray(arraySize);
        double[] orig2 = getDoubleArray(arraySize);
        //double[] r1 = MethodsFromApacheMath.ebeAdd(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "ebeAdd", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "ebeAdd", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "ebeAdd", orig1, orig2), equalTo(true));
    }

    @Test
    public void ebeDivide_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] orig1 = getDoubleArray(arraySize);
        double[] orig2 = getDoubleArray(arraySize);
        //double[] r1 = MethodsFromApacheMath.ebeDivide(orig1, orig2);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "ebeDivide", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "ebeDivide", orig1, orig2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "ebeDivide", orig1, orig2), equalTo(true));
    }

    @Test
    public void ebeMultiply_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] firstArg = getDoubleArray(arraySize);
        double[] secondArg = getDoubleArray(arraySize);
        //double[] r1 = MethodsFromApacheMath.ebeMultiply(firstArg, secondArg);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "ebeMultiply", firstArg, secondArg), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "ebeMultiply", firstArg, secondArg), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "ebeMultiply", firstArg, secondArg), equalTo(true));
    }

    @Test
    public void safeNorm_test() {
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromApacheMath.safeNorm(orig);
        
        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "safeNorm", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "safeNorm", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "safeNorm", orig), equalTo(true));
    }

    @Test
    public void scale_test() {
        double arg1 = getDouble();
        double[] orig = getDoubleArray();
        //double[] r1 = MethodsFromApacheMath.scale(arg1, orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "scale", arg1, orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "scale", arg1, orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "scale", arg1, orig), equalTo(true));
    }

    @Test
    public void entropy_test() {
        double[] orig = getDoubleArray();
        //double r1 = MethodsFromApacheMath.entropy(orig);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "entropy", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "entropy", orig), equalTo(true));
        collector.checkThat(fail += "perm&", testThis("perm", "entropy", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "entropy", orig), equalTo(true));
    }

    @Test
    public void g_test() {
        //Input arrays must be same length and length must be >= 2
        int size = getInt() + 2;
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromApacheMath.g(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "g", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "g", arg1, arg2), equalTo(true));
        
    }

    @Test
    public void calculateAbsoluteDifferences_test() {
        //length cannot be zero
        double[] orig = getDoubleArray();
        //double[] r1 = MethodsFromApacheMath.calculateAbsoluteDifferences(orig);
        
        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "calculateAbsoluteDifferences", orig), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "calculateAbsoluteDifferences", orig), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "calculateAbsoluteDifferences", orig), equalTo(true));
    }

    @Test
    public void computeCanberraDistance_test() {
        //Arrays must be same length
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromApacheMath.computeCanberraDistance(arg1, arg2);

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "computeCanberraDistance", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "computeCanberraDistance", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "computeCanberraDistance", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "computeCanberraDistance", arg1, arg2), equalTo(true));
    }

    @Test
    public void evaluateHoners_test() {
        //Array length must be at least 1
        double[] orig = getDoubleArray();
        double secondArg = getDouble();
        //double r1 = MethodsFromApacheMath.evaluateHoners(orig, secondArg);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "evaluateHoners", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "evaluateHoners", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "evaluateHoners", orig, secondArg), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "evaluateHoners", orig, secondArg), equalTo(true));
    }

    @Test
    public void evaluateInternal_test() {
        //First array arg must be at least length 2 and be monotonically increasing
        int length = getInt() + 2;
        double[] firstArg = getDoubleArray(length);
        Arrays.sort(firstArg);
        double[] secondArg = getDoubleArray(length);
        double thirdArg = getDouble();
        //double r1 = MethodsFromApacheMath.evaluateInternal(firstArg, secondArg, thirdArg);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "evaluateInternal", firstArg, secondArg, thirdArg), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "evaluateInternal", firstArg, secondArg, thirdArg), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "evaluateInternal", firstArg, secondArg, thirdArg), equalTo(true));
    }

   @Test
   public void evaluateNewton_test() {
       //First arg and second arg must have length difference of 1, each must be at least length 1
       int size = getInt() + 2;
       double[] firstArg = getDoubleArray(size);
       double[] secondArg = getDoubleArray(size - 1);
       double thirdArg = getDouble();
       //double r1 = MethodsFromApacheMath.evaluateNewton(firstArg, secondArg, thirdArg);

        String fail = "";
       collector.checkThat(fail += "add&", testThis("add", "evaluateNewton", firstArg, secondArg, thirdArg), equalTo(true));
       collector.checkThat(fail += "mult&", testThis("mult", "evaluateNewton", firstArg, secondArg, thirdArg), equalTo(true));
       collector.checkThat(fail += "exc&", testThis("exc", "evaluateNewton", firstArg, secondArg, thirdArg), equalTo(true));
       collector.checkThat(fail += "inc&", testThis("inc", "evaluateNewton", firstArg, secondArg, thirdArg), equalTo(true));
       collector.checkThat(fail += "inv&", testThis("inv", "evaluateNewton", firstArg, secondArg, thirdArg), equalTo(true));
   }

   @Test
   public void meanDifference_test() {
       //inputs must have matching and positive lengths
       int size = getInt() + 1;
       double[] arg1 = getDoubleArray(size);
       double[] arg2 = getDoubleArray(size);
       //double r1 = MethodsFromApacheMath.meanDifference(arg1, arg2);

        String fail = "";
       collector.checkThat(fail += "mult&", testThis("mult", "meanDifference", arg1, arg2), equalTo(true));
       collector.checkThat(fail += "inv&", testThis("inv", "meanDifference", arg1, arg2), equalTo(true));
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

        String fail = "";
        collector.checkThat(fail += "mult&", testThis("mult", "chiSquare", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "exc&", testThis("exc", "chiSquare", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inc&", testThis("inc", "chiSquare", arg1, arg2), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "chiSquare", arg1, arg2), equalTo(true));
   }

  @Test
  public void partition_test() {
        int begin = getInt() + 5;
        int end = begin + getInt() + 5;
        int pivot =  end - begin;
        int size = end + begin + getInt();
        double[] arr = getDoubleArray(size);
        //int r1 = MethodsFromApacheMath.partition(arr, begin, end, pivot);

        String fail = "";
        collector.checkThat(fail += "add&", testThis("add", "partition", arr, begin, end, pivot), equalTo(true));
        collector.checkThat(fail += "mult&", testThis("mult", "partition", arr, begin, end, pivot), equalTo(true));
        collector.checkThat(fail += "inv&", testThis("inv", "partition", arr, begin, end, pivot), equalTo(true));
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

        String fail = "";
	collector.checkThat(fail += "mult&", testThis("mult", "evaluateWeightedProduct", arg1, arg2, start, length), equalTo(true));
	collector.checkThat(fail += "exc&", testThis("exc", "evaluateWeightedProduct", arg1, arg2, start, length), equalTo(true));
	collector.checkThat(fail += "inc&", testThis("inc", "evaluateWeightedProduct", arg1, arg2, start, length), equalTo(true));
  }

}
