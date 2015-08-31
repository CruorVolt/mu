package Test;

public class MethodsFromApacheMath {
	 
    /**
     * Calculates the L<sub>2</sub> (Euclidean) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>2</sub> distance between the two points
     */
    public static double distance(double[] p1, double[] p2) {
        double sum = 0;
        for (int i = 0; i < p1.length; i++) {
            final double dp = p1[i] - p2[i];
            sum += dp * dp;
        }
        return Math.sqrt(sum);
    }
    
    /**
     * Calculates the L<sub>1</sub> (sum of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>1</sub> distance between the two points
     */
    public static double distance1(double[] p1, double[] p2) {
        double sum = 0;
        for (int i = 0; i < p1.length; i++) {
            sum += Math.abs(p1[i] - p2[i]);
        }
        return sum;
    }
    /**
     * Calculates the L<sub>&infin;</sub> (max of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>&infin;</sub> distance between the two points
     */
    public static double distanceInf(double[] p1, double[] p2) {
        double max = 0;
        for (int i = 0; i < p1.length; i++) {
            max = Math.max(max, Math.abs(p1[i] - p2[i]));
        }
        return max;
    }
    /**
     * Creates an array whose contents will be the element-by-element
     * addition of the arguments.
     *
     * @param a First term of the addition.
     * @param b Second term of the addition.
     * @return a new array {@code r} where {@code r[i] = a[i] + b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeAdd(double[] a, double[] b) {
        if (a.length != b.length) {
            return null;
        }

        final double[] result = a.clone();
        for (int i = 0; i < a.length; i++) {
            result[i] += b[i];
        }
        return result;
    }
    
    /**
     * Creates an array whose contents will be the element-by-element
     * division of the first argument by the second.
     *
     * @param a Numerator of the division.
     * @param b Denominator of the division.
     * @return a new array {@code r} where {@code r[i] = a[i] / b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeDivide(double[] a, double[] b) {
        if (a.length != b.length) {
            return null;
        }

        final double[] result = a.clone();
        for (int i = 0; i < a.length; i++) {
            result[i] /= b[i];
        }
        return result;
    }
    /**
     * Creates an array whose contents will be the element-by-element
     * multiplication of the arguments.
     *
     * @param a First factor of the multiplication.
     * @param b Second factor of the multiplication.
     * @return a new array {@code r} where {@code r[i] = a[i] * b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeMultiply(double[] a, double[] b) {
        if (a.length != b.length) {
            return null;
        }

        final double[] result = a.clone();
        for (int i = 0; i < a.length; i++) {
            result[i] *= b[i];
        }
        return result;
    }
    /**
     * Creates an array whose contents will be the element-by-element
     * subtraction of the second argument from the first.
     *
     * @param a First term.
     * @param b Element to be subtracted.
     * @return a new array {@code r} where {@code r[i] = a[i] - b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeSubtract(double[] a, double[] b)
        {
        if (a.length != b.length) {
            return null;
        }

        final double[] result = a.clone();
        for (int i = 0; i < a.length; i++) {
            result[i] -= b[i];
        }
        return result;
    }
    
    public static double safeNorm(double[] v) {
        double rdwarf = 3.834e-20;
        double rgiant = 1.304e+19;
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        double x1max = 0;
        double x3max = 0;
        double floatn = v.length;
        double agiant = rgiant / floatn;
        for (int i = 0; i < v.length; i++) {
            double xabs = Math.abs(v[i]);
            if (xabs < rdwarf || xabs > agiant) {
                if (xabs > rdwarf) {
                    if (xabs > x1max) {
                        double r = x1max / xabs;
                        s1= 1 + s1 * r * r;
                        x1max = xabs;
                    } else {
                        double r = xabs / x1max;
                        s1 += r * r;
                    }
                } else {
                    if (xabs > x3max) {
                        double r = x3max / xabs;
                        s3= 1 + s3 * r * r;
                        x3max = xabs;
                    } else {
                        if (xabs != 0) {
                            double r = xabs / x3max;
                            s3 += r * r;
                        }
                    }
                }
            } else {
                s2 += xabs * xabs;
            }
        }
        double norm;
        if (s1 != 0) {
            norm = x1max * Math.sqrt(s1 + (s2 / x1max) / x1max);
        } else {
            if (s2 == 0) {
                norm = x3max * Math.sqrt(s3);
            } else {
                if (s2 >= x3max) {
                    norm = Math.sqrt(s2 * (1 + (x3max / s2) * (x3max * s3)));
                } else {
                    norm = Math.sqrt(x3max * ((s2 / x3max) + (x3max * s3)));
                }
            }
        }
        return norm;
    }
    /**
     * Create a copy of an array scaled by a value.
     *
     * @param arr Array to scale.
     * @param val Scalar.
     * @return scaled copy of array with each entry multiplied by val.
     * @since 3.2
     */
    public static double[] scale(double val, final double[] arr) {
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * val;
        }
        return newArr;
    }
    
    
    /**
     * Calculates the <a href=
     * "http://en.wikipedia.org/wiki/Entropy_%28information_theory%29">Shannon
     * entropy</a> for 2 Dimensional Matrix.  The value returned is the entropy
     * of the vector formed by concatenating the rows (or columns) of {@code k}
     * to form a vector. See {@link #entropy(long[])}.
     *
     * @param k 2 Dimensional Matrix of long values (for ex. the counts of a
     * trials)
     * @return Shannon Entropy of the given Matrix
     *
     */
    /*
    private static double entropy(final long[][] k) {
        double h = 0d;
        double sum_k = 0d;
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                sum_k += (double) k[i][j];
            }
        }
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                if (k[i][j] != 0) {
                    final double p_ij = (double) k[i][j] / sum_k;
                    h += p_ij * Math.log(p_ij);
                }
            }
        }
        return -h;
    }*/
    /**
     * Calculates the <a href="http://en.wikipedia.org/wiki/Entropy_%28information_theory%29">
     * Shannon entropy</a> for a vector.  The values of {@code k} are taken to be
     * incidence counts of the values of a random variable. What is returned is <br/>
     * &sum;p<sub>i</sub>log(p<sub>i</sub><br/>
     * where p<sub>i</sub> = k[i] / (sum of elements in k)
     *
     * @param k Vector (for ex. Row Sums of a trials)
     * @return Shannon Entropy of the given Vector
     *
     */
    public static double entropy(final double[] k) {
        double h = 0d;
        double sum_k = 0d;
        for (int i = 0; i < k.length; i++) {
            sum_k += (double) k[i];
        }
        for (int i = 0; i < k.length; i++) {
            if (k[i] != 0) {
                final double p_i = (double) k[i] / sum_k;
                h += p_i * Math.log(p_i);
            }
        }
        return -h;
    }
    /**
     * Computes the <a href="http://en.wikipedia.org/wiki/G-test">G statistic
     * for Goodness of Fit</a> comparing {@code observed} and {@code expected}
     * frequency counts.
     *
     * <p>This statistic can be used to perform a G test (Log-Likelihood Ratio
     * Test) evaluating the null hypothesis that the observed counts follow the
     * expected distribution.</p>
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>Expected counts must all be positive. </li>
     * <li>Observed counts must all be &ge; 0. </li>
     * <li>The observed and expected arrays must have the same length and their
     * common length must be at least 2. </li></ul></p>
     *
     * <p>If any of the preconditions are not met, a
     * {@code MathIllegalArgumentException} is thrown.</p>
     *
     * <p><strong>Note:</strong>This implementation rescales the
     * {@code expected} array if necessary to ensure that the sum of the
     * expected and observed counts are equal.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @return G-Test statistic
     * @throws NotPositiveException if {@code observed} has negative entries
     * @throws NotStrictlyPositiveException if {@code expected} has entries that
     * are not strictly positive
     * @throws DimensionMismatchException if the array lengths do not match or
     * are less than 2.
     */
    public static double g(final double[] expected, final double[] observed){
            //throws NotPositiveException, NotStrictlyPositiveException,
           // DimensionMismatchException {

        /*if (expected.length < 2) {
            throw new DimensionMismatchException(expected.length, 2);
        }
        if (expected.length != observed.length) {
            throw new DimensionMismatchException(expected.length, observed.length);
        }
        MathArrays.checkPositive(expected);
        MathArrays.checkNonNegative(observed);*/

        double sumExpected = 0d;
        double sumObserved = 0d;
        for (int i = 0; i < observed.length; i++) {
            sumExpected += expected[i];
            sumObserved += observed[i];
        }
        double ratio = 1d;
        boolean rescale = false;
        if (Math.abs(sumExpected - sumObserved) > 10E-6) {
            ratio = sumObserved / sumExpected;
            rescale = true;
        }
        double sum = 0d;
        for (int i = 0; i < observed.length; i++) {
            final double dev = rescale ?
                    Math.log((double) observed[i] / (ratio * expected[i])) :
                        Math.log((double) observed[i] / expected[i]);
            sum += ((double) observed[i]) * dev;
        }
        return 2d * sum;
    }
    /**
     * Calculates |z[i]| for all i
     *
     * @param z sample
     * @return |z|
     * @throws NullArgumentException if {@code z} is {@code null}
     * @throws NoDataException if {@code z} is zero-length.
     */
    public static double[] calculateAbsoluteDifferences(double[] z){
       // throws NullArgumentException, NoDataException {

        if (z == null) {
            return null;
        }

        if (z.length == 0) {
        	return null;
        }

        final double[] zAbs = new double[z.length];

        for (int i = 0; i < z.length; ++i) {
            zAbs[i] = Math.abs(z[i]);
        }

        return zAbs;
    }
    /**
     * Calculates y[i] - x[i] for all i
     *
     * @param x first sample
     * @param y second sample
     * @return z = y - x
     */
    public static double[] calculateDifferences(final double[] x, final double[] y) {

        final double[] z = new double[x.length];

        for (int i = 0; i < x.length; ++i) {
            z[i] = y[i] - x[i];
        }

        return z;
    }
    

    /**
     * Return a copy of the divided difference array.
     * <p>
     * The divided difference array is defined recursively by <pre>
     * f[x0] = f(x0)
     * f[x0,x1,...,xk] = (f[x1,...,xk] - f[x0,...,x[k-1]]) / (xk - x0)
     * </pre></p>
     * <p>
     * The computational complexity is O(N^2).</p>
     *
     * @param x Interpolating points array.
     * @param y Interpolating values array.
     * @return a fresh copy of the divided difference array.
     * @throws DimensionMismatchException if the array lengths are different.
     * @throws NumberIsTooSmallException if the number of points is less than 2.
     * @throws NonMonotonicSequenceException
     * if {@code x} is not sorted in strictly increasing order.
     */
    public static double[] computeDividedDifference(final double x[], final double y[]){
        //throws DimensionMismatchException,
        //       NumberIsTooSmallException,
         //      NonMonotonicSequenceException {
        //PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y, true);

        final double[] divdiff = y.clone(); // initialization

        final int n = x.length;
        final double[] a = new double [n];
        a[0] = divdiff[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                final double denominator = x[j+i] - x[j];
                divdiff[j] = (divdiff[j+1] - divdiff[j]) / denominator;
            }
            a[i] = divdiff[0];
        }

        return a;
    }
    /** {@inheritDoc} */
    public static double computeCanberraDistance(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            final double num = Math.abs(a[i] - b[i]);
            final double denom = Math.abs(a[i]) + Math.abs(b[i]);
            sum += num == 0.0 && denom == 0.0 ? 0.0 : num / denom;
        }
        return sum;
    }
    /**
     * Uses Horner's Method to evaluate the polynomial with the given coefficients at
     * the argument.
     *
     * @param coefficients Coefficients of the polynomial to evaluate.
     * @param argument Input value.
     * @return the value of the polynomial.
     * @throws NoDataException if {@code coefficients} is empty.
     * @throws NullArgumentException if {@code coefficients} is {@code null}.
     */
    public static double evaluateHoners(double[] coefficients, double argument){
        //throws NullArgumentException, NoDataException {
       // MathUtils.checkNotNull(coefficients);
        int n = coefficients.length;
        double result = coefficients[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            result = argument * result + coefficients[j];
        }
        return result;
    }
    /**
     * Evaluate the Lagrange polynomial using
     * <a href="http://mathworld.wolfram.com/NevillesAlgorithm.html">
     * Neville's Algorithm</a>. It takes O(n^2) time.
     *
     * @param x Interpolating points array.
     * @param y Interpolating values array.
     * @param z Point at which the function value is to be computed.
     * @return the function value.
     * @throws DimensionMismatchException if {@code x} and {@code y} have
     * different lengths.
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     * if {@code x} is not sorted in strictly increasing order.
     * @throws NumberIsTooSmallException if the size of {@code x} is less
     * than 2.
     */
    public static double evaluateInternal(double x[], double y[], double z) {
        int nearest = 0;
        final int n = x.length;
        final double[] c = new double[n];
        final double[] d = new double[n];
        double min_dist = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            // initialize the difference arrays
            c[i] = y[i];
            d[i] = y[i];
            // find out the abscissa closest to z
            final double dist = Math.abs(z - x[i]);
            if (dist < min_dist) {
                nearest = i;
                min_dist = dist;
            }
        }

        // initial approximation to the function value at z
        double value = y[nearest];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                final double tc = x[j] - z;
                final double td = x[i+j] - z;
                final double divider = x[j] - x[i+j];
                // update the difference arrays
                final double w = (c[j+1] - d[j]) / divider;
                c[j] = tc * w;
                d[j] = td * w;
            }
            // sum up the difference terms to get the final value
            if (nearest < 0.5*(n-i+1)) {
                value += c[nearest];    // fork down
            } else {
                nearest--;
                value += d[nearest];    // fork up
            }
        }

        return value;
    }
    /**
     * Evaluate the Newton polynomial using nested multiplication. It is
     * also called <a href="http://mathworld.wolfram.com/HornersRule.html">
     * Horner's Rule</a> and takes O(N) time.
     *
     * @param a Coefficients in Newton form formula.
     * @param c Centers.
     * @param z Point at which the function value is to be computed.
     * @return the function value.
     * @throws NullArgumentException if any argument is {@code null}.
     * @throws NoDataException if any array has zero length.
     * @throws DimensionMismatchException if the size difference between
     * {@code a} and {@code c} is not equal to 1.
     */
    public static double evaluateNewton(double a[], double c[], double z){
        //throws NullArgumentException, DimensionMismatchException, NoDataException {
        //verifyInputArray(a, c);

        final int n = c.length-1;
        double value = a[n];
        for (int i = n - 1; i >= 0; i--) {
            value = a[i] + (z - c[i]) * value;
        }

        return value;
    }
   
  
   
   
   /**
    * Returns the mean of the (signed) differences between corresponding elements of the
    * input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.
    *
    * @param sample1  the first array
    * @param sample2  the second array
    * @return mean of paired differences
    * @throws DimensionMismatchException if the arrays do not have the same
    * (positive) length.
    * @throws NoDataException if the sample arrays are empty.
    */
   public static double meanDifference(final double[] sample1, final double[] sample2){
   //throws DimensionMismatchException, NoDataException{
	   
	   double sumDifference=0;
	   for(int i=0;i<sample1.length;i++)
	   {
		   sumDifference+=sample1[i]-sample2[i];
	   }
       return sumDifference / sample1.length;
   }
   /**
    * Returns the variance of the (signed) differences between corresponding elements of the
    * input arrays -- i.e., var(sample1[i] - sample2[i]).
    *
    * @param sample1  the first array
    * @param sample2  the second array
    * @param meanDifference   the mean difference between corresponding entries
    * @see #meanDifference(double[],double[])
    * @return variance of paired differences
    * @throws DimensionMismatchException if the arrays do not have the same
    * length.
    * @throws NumberIsTooSmallException if the arrays length is less than 2.
    */
   public static double varianceDifference(final double[] sample1,
           final double[] sample2){ 
        		   //throws DimensionMismatchException,NumberIsTooSmallException {
       double sum1 = 0d;
       double sum2 = 0d;
       double diff = 0d;
       int n = sample1.length;
       /*
       if (n != sample2.length) {
           throw new DimensionMismatchException(n, sample2.length);
       }
       if (n < 2) {
           throw new NumberIsTooSmallException(n, 2, true);
       }*/
       double sumDifference=0;
	   for(int i=0;i<n;i++)
	   {
		   sumDifference+=sample1[i]-sample2[i];
	   }
	   double meanDifference=sumDifference / n;
       for (int i = 0; i < n; i++) {
           diff = sample1[i] - sample2[i];
           sum1 += (diff - meanDifference) *(diff - meanDifference);
           sum2 += diff - meanDifference;
       }
       return (sum1 - (sum2 * sum2 / n)) / (n - 1);
   }
   /**
    * Returns {@code true} iff both arguments are {@code null} or have same
    * dimensions and all their elements are equal as defined by
    * {@link Precision#equals(double,double)}.
    *
    * @param x First array.
    * @param y Second array.
    * @return {@code true} if the values are both {@code null} or have same
    * dimension and equal elements.
    */
   public static boolean equals(double[] x, double[] y) {
       if ((x == null) || (y == null)) {
           return !((x == null) ^ (y == null));
       }
       if (x.length != y.length) {
           return false;
       }
       for (int i = 0; i < x.length; ++i) {
           if (Math.abs(y[i] - x[i])> 0.0001) {
               return false;
           }
       }
       return true;
   }
   /**
    * Check that all entries of the input array are >= 0.
    *
    * @param in Array to be tested
    * @throws NotPositiveException if any array entries are less than 0.
    * @since 3.1
    */
   public static boolean checkNonNegative(final double[] in){
       for (int i = 0; i < in.length; i++) {
           if (in[i] < 0) {
               return false;
           }
       }
   	return true;
   }
   /**
    * Check that all entries of the input array are strictly positive.
    *
    * @param in Array to be tested
    * @throws NotStrictlyPositiveException if any entries of the array are not
    * strictly positive.
    * @since 3.1
    */
   public static boolean checkPositive(final double[] in){
       for (int i = 0; i < in.length; i++) {
           if (in[i] <= 0) {
               return false;
           }
       }
       return true;
   }
   /**
    * Computes the <a href="http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm">
    * Chi-Square statistic</a> comparing <code>observed</code> and <code>expected</code>
    * frequency counts.
    * <p>
    * This statistic can be used to perform a Chi-Square test evaluating the null
    * hypothesis that the observed counts follow the expected distribution.</p>
    * <p>
    * <strong>Preconditions</strong>: <ul>
    * <li>Expected counts must all be positive.
    * </li>
    * <li>Observed counts must all be &ge; 0.
    * </li>
    * <li>The observed and expected arrays must have the same length and
    * their common length must be at least 2.
    * </li></ul></p><p>
    * If any of the preconditions are not met, an
    * <code>IllegalArgumentException</code> is thrown.</p>
    * <p><strong>Note: </strong>This implementation rescales the
    * <code>expected</code> array if necessary to ensure that the sum of the
    * expected and observed counts are equal.</p>
    *
    * @param observed array of observed frequency counts
    * @param expected array of expected frequency counts
    * @return chiSquare test statistic
    * @throws NotPositiveException if <code>observed</code> has negative entries
    * @throws NotStrictlyPositiveException if <code>expected</code> has entries that are
    * not strictly positive
    * @throws DimensionMismatchException if the arrays length is less than 2
    */
   public static double chiSquare(double[] expected, double[] observed){
      // throws NotPositiveException, NotStrictlyPositiveException,
      // DimensionMismatchException 

       /*if (expected.length < 2) {
           throw new DimensionMismatchException(expected.length, 2);
       }
       if (expected.length != observed.length) {
           throw new DimensionMismatchException(expected.length, observed.length);
       }
       MathArrays.checkPositive(expected);
       MathArrays.checkNonNegative(observed);*/

       double sumExpected = 0d;
       double sumObserved = 0d;
       for (int i = 0; i < observed.length; i++) {
           sumExpected += expected[i];
           sumObserved += observed[i];
       }
       double ratio = 1.0d;
       boolean rescale = false;
       if (Math.abs(sumExpected - sumObserved) > 10E-6) {
           ratio = sumObserved / sumExpected;
           rescale = true;
       }
       double sumSq = 0.0d;
       for (int i = 0; i < observed.length; i++) {
           if (rescale) {
               final double dev = observed[i] - ratio * expected[i];
               sumSq += dev * dev / (ratio * expected[i]);
           } else {
               final double dev = observed[i] - expected[i];
               sumSq += dev * dev / expected[i];
           }
       }
       return sumSq;

   }
   /**
    * Algorithm inspired by
    * http://www.fon.hum.uva.nl/Service/Statistics/Signed_Rank_Algorihms.html#C
    * by Rob van Son, Institute of Phonetic Sciences & IFOTT,
    * University of Amsterdam
    *
    * @param Wmax largest Wilcoxon signed rank value
    * @param N number of subjects (corresponding to x.length)
    * @return two-sided exact p-value
    */
   /*
   public static double calculateExactPValue(final double Wmax, final int N) {

       // Total number of outcomes (equal to 2^N but a lot faster)
       final int m = 1 << N;

       int largerRankSums = 0;

       for (int i = 0; i < m; ++i) {
           int rankSum = 0;

           // Generate all possible rank sums
           for (int j = 0; j < N; ++j) {

               // (i >> j) & 1 extract i's j-th bit from the right
               if (((i >> j) & 1) == 1) {
                   rankSum += j + 1;
               }
           }

           if (rankSum >= Wmax) {
               ++largerRankSums;
           }
       }

       
       return 2 * ((double) largerRankSums) / ((double) m);
   }*/
   /**
    * <p>Returns the {@link SemiVariance} of the designated values against the cutoff
    * in the given direction with the provided bias correction.</p>
    *
    * <p>Returns <code>NaN</code> if the array is empty and throws
    * <code>IllegalArgumentException</code> if the array is null.</p>
    *
    * @param values the input array
    * @param cutoff the reference point
    * @param direction the {@link Direction} of the semivariance
    * @param corrected the BiasCorrection flag
    * @param start index of the first array element to include
    * @param length the number of elements to include
    * @return the SemiVariance
    * @throws MathIllegalArgumentException if the parameters are not valid
    *
    */
  public static double evaluateSemiVariance(final double[] values, final double cutoff, final boolean direction,
          final boolean corrected, final int start, final int length){
	   //throws MathIllegalArgumentException {
  

      //test(values, start, length);
      if (values.length == 0) {
          return Double.NaN;
      } else {
          if (values.length == 1) {
              return 0.0;
          } else {
              final boolean booleanDirection = direction;

              double dev = 0.0;
              double sumsq = 0.0;
              for (int i = start; i < length; i++) {
                  if ((values[i] > cutoff) == booleanDirection) {
                     dev = values[i] - cutoff;
                     sumsq += dev * dev;
                  }
              }

              if (corrected) {
                  return sumsq / (length - 1.0);
              } else {
                  return sumsq / length;
              }
          }
      }
  }
  /**
   * Partition an array slice around a pivot
   * <p>
   * Partitioning exchanges array elements such that all elements
   * smaller than pivot are before it and all elements larger than
   * pivot are after it
   * </p>
   * @param work data array
   * @param begin index of the first element of the slice
   * @param end index after the last element of the slice
   * @param pivot initial index of the pivot
   * @return index of the pivot after partition
   */
  public static int partition(final double[] work, final int begin, final int end, final int pivot) {

      final double value = work[pivot];
      work[pivot] = work[begin];

      int i = begin + 1;
      int j = end - 1;
      while (i < j) {
          while ((i < j) && (work[j] > value)) {
              --j;
          }
          while ((i < j) && (work[i] < value)) {
              ++i;
          }

          if (i < j) {
              final double tmp = work[i];
              work[i++] = work[j];
              work[j--] = tmp;
          }
      }

      if ((i >= end) || (work[i] > value)) {
          --i;
      }
      work[begin] = work[i];
      work[i]     = value;
      return i;

  }
  /**
   * <p>Returns the weighted product of the entries in the specified portion of
   * the input array, or <code>Double.NaN</code> if the designated subarray
   * is empty.</p>
   *
   * <p>Throws <code>MathIllegalArgumentException</code> if any of the following are true:
   * <ul><li>the values array is null</li>
   *     <li>the weights array is null</li>
   *     <li>the weights array does not have the same length as the values array</li>
   *     <li>the weights array contains one or more infinite values</li>
   *     <li>the weights array contains one or more NaN values</li>
   *     <li>the weights array contains negative values</li>
   *     <li>the start and length arguments do not determine a valid array</li>
   * </ul></p>
   *
   * <p>Uses the formula, <pre>
   *    weighted product = &prod;values[i]<sup>weights[i]</sup>
   * </pre>
   * that is, the weights are applied as exponents when computing the weighted product.</p>
   *
   * @param values the input array
   * @param weights the weights array
   * @param begin index of the first array element to include
   * @param length the number of elements to include
   * @return the product of the values or 1 if length = 0
   * @throws MathIllegalArgumentException if the parameters are not valid
   * @since 2.1
   */
  public static double evaluateWeightedProduct(final double[] values, final double[] weights,
      final int begin, final int length){ 
   		   //throws MathIllegalArgumentException {
      double product = Double.NaN;
      //if (test(values, weights, begin, length, true)) {
          product = 1.0;
          for (int i = begin; i < begin + length; i++) {
              product *= Math.pow(values[i], weights[i]);
          }
      //}
      return product;
  }
  
  

}
