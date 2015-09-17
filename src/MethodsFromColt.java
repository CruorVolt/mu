package Test;

import java.util.Random;
import java.util.Arrays;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.*;






public class MethodsFromColt {
	/**
	 * Returns the auto-correlation of a data sequence.
	 */
	
/*
	public static double autoCorrelation(double[] data, int lag, double mean, double variance) {
		int N = data.length;
		//if (lag >= N) throw new IllegalArgumentException("Lag is too large");

		//double[] elements = data.elements();
		double run = 0;
		for( int i=lag; i<N; ++i)
			run += (data[i]-mean)*(data[i-lag]-mean);
	  
		return (run/(N-lag)) / variance;
	}
*/
	
	/**
	 * Searches the receiver for the specified value using
	 * the binary search algorithm. The receiver must be sorted into ascending order
	 * according to the <i>natural ordering</i> of its elements (as by the sort method)
	 * prior to making this call.  
	 * If it is not sorted, the results are undefined: in particular, the call
	 * may enter an infinite loop.  If the receiver contains multiple elements
	 * equal to the specified object, there is no guarantee which instance
	 * will be found.
	 *
	 *
	 * @param key the value to be searched for.
	 * @param from the leftmost search position, inclusive.
	 * @param to the rightmost search position, inclusive.
	 * @return index of the search key, if it is contained in the receiver;
	 *	       otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The <i>insertion
	 *	       point</i> is defined as the the point at which the value would
	 * 	       be inserted into the receiver: the index of the first
	 *	       element greater than the key, or <tt>receiver.size()</tt>, if all
	 *	       elements in the receiver are less than the specified key.  Note
	 *	       that this guarantees that the return value will be &gt;= 0 if
	 *	       and only if the key is found.
	 * @see Comparable
	 * @see java.util.Arrays
	 */
	
/*
	public static int binarySearchFromTo(double[] elements,double key, int from, int to) {
		int low = from;
		int high = to;

		while (low <= high) {
			int mid =(low + high)/2;
			double midVal = elements[mid];
			if (midVal<key)
				low = mid + 1;
			else if (midVal>key)
				high = mid - 1;
			//int cmp = ((Comparable)midVal).compareTo(key);

			//if (cmp < 0) low = mid + 1;
			//else if (cmp > 0) high = mid - 1;
			else return mid; // key found
		}
		return -(low + 1);  // key not found.
	}
*/


	/**
	 * Performs a logical <b>AND</b> of the receiver with another bit vector (A = A & B).
	 * The receiver is modified so that a bit in it has the
	 * value <code>true</code> if and only if it already had the 
	 * value <code>true</code> and the corresponding bit in the other bit vector
	 * argument has the value <code>true</code>.
	 *
	 * @param   other   a bit vector.
	 * @throws IllegalArgumentException if <tt>size() &gt; other.size()</tt>.
	 */
	/*
	public void and(long[] theBits, long[] otherBits) {
		//if (this == other) return;
		//checkSize(other);
		//final long[] theBits = this.bits; // cached for speed.
		//final long[] otherBits = other.bits; //cached for speed.
		if (theBits.length!=otherBits.length) throw new IllegalArgumentException("Size not equal");
		for(int i=theBits.length; --i >= 0;) theBits[i] &= otherBits[i];
	}
	*/

	/**
	 * Clears all of the bits in receiver whose corresponding
	 * bit is set in the other bitvector (A = A \ B).
	 * In other words, determines the difference (A=A\B) between two bitvectors.
	 *
	 * @param   other   a bitvector with which to mask the receiver.
	 * @throws IllegalArgumentException if <tt>size() &gt; other.size()</tt>.
	 */
	/*
/*
	public void andNot(long[] theBits,long[] otherBits) {
		//checkSize(other);
		//final long[] theBits = this.bits; // cached for speed.
		//final long[] otherBits = other.bits; //cached for speed.
		if (theBits.length!=otherBits.length) throw new IllegalArgumentException("Size not equal");
		for(int i=theBits.length; --i >= 0;) theBits[i] &= ~otherBits[i];
	}*/
	
	
	/**
	 * Returns the covariance of two data sequences, which is 
	 * <tt>cov(x,y) = (1/(size()-1)) * Sum((x[i]-mean(x)) * (y[i]-mean(y)))</tt>.
	 * See the <A HREF="http://www.cquest.utoronto.ca/geog/ggr270y/notes/not05efg.html"> math definition</A>.
	 */
/*
	public static double covariance(double[] elements1, double[] elements2) {
		int size = elements1.length;
		//if (size != elements2.length || size == 0) throw new IllegalArgumentException();
		//double[] elements1 = data1.elements();
		//double[] elements2 = data2.elements();
		
		double sumx=elements1[0], sumy=elements2[0], Sxy=0;
		for (int i=1; i<size; ++i) {
			double x = elements1[i];
			double y = elements2[i];
			sumx += x;
			Sxy += (x - sumx/(i+1))*(y - sumy/i);
			sumy += y;
			// Exercise for the reader: Why does this give us the right answer?
		}
		return Sxy/(size-1);
	}
*/
	
	/**
	 * Durbin-Watson computation.
	 */
/*
	public static double durbinWatson(double[] elements) {
		int size = elements.length;
		//if (size < 2) throw new IllegalArgumentException("data sequence must contain at least two values.");

		//double[] elements = data.elements();
		double run = 0;
		//double run_sq = 0;
		//run_sq = elements[0] * elements[0];
		for(int i=1; i<size; ++i) {
			double x = elements[i] - elements[i-1];
			run += x*x;
			//run_sq += elements[i] * elements[i];
		}
		return run;
		//return run / run_sq;
	}
*/
	
	/**
	 * Returns the lag-1 autocorrelation of a dataset; 
	 * Note that this method has semantics different from <tt>autoCorrelation(..., 1)</tt>;
	 */
/*
	public static double lag1(double[] elements, double mean) {
		int size = elements.length;
		//double[]  = data.elements();
		double r1 ;
		double q = 0 ;
		double v = (elements[0] - mean) * (elements[0] - mean) ;

		for (int i = 1; i < size ; i++) {
			double delta0 = (elements[i-1] - mean);
			double delta1 = (elements[i] - mean);
			q += (delta0 * delta1 - q)/(i + 1);
			v += (delta1 * delta1 - v)/(i + 1);
		}

		r1 = q / v ;
		return r1;
	}
*/
	/**
	 * Returns the largest member of a data sequence.
	 */
/*
	public static double max(double[] elements) {
		int size = elements.length;
		//if (size==0) throw new IllegalArgumentException();
		
		//double[] elements = data.elements();
		double max = elements[size-1];
		for (int i = size-1; --i >= 0;) {
			if (elements[i] > max) max = elements[i];
		}

		return max;
	}
*/
	
	/**
	 * Returns the mean deviation of a dataset.
	 * That is <tt>Sum (Math.abs(data[i]-mean)) / data.size())</tt>.
	 */
/*
	public static double meanDeviation(double[] elements, double mean) {
		//double[] elements = data.elements();
		int size = elements.length;
		double sum=0;
		for (int i=size; --i >= 0;) sum += Math.abs(elements[i]-mean);
		return sum/size;
	}
*/
	
	/**
	 * Returns the smallest member of a data sequence.
	 */
/*
	public static double min(double[] elements) {
		int size = elements.length;
		//if (size==0) throw new IllegalArgumentException();
		
		//double[] elements = data.elements();
		double min = elements[size-1];
		for (int i = size-1; --i >= 0;) {
			if (elements[i] < min) min = elements[i];
		}

		return min;
	}
*/
	
	/**
	 * Returns the product of a data sequence, which is <tt>Prod( data[i] )</tt>.
	 * In other words: <tt>data[0]*data[1]*...*data[data.size()-1]</tt>.
	 * Note that you may easily get numeric overflows.
	 */
/*
	public static double product(double[] elements) {
		int size =elements.length;
		//double[] elements = data.elements();
		
		double product = 1;
		for (int i=size; --i >= 0;) product *= elements[i];
		
		return product;
	}
*/
	/**
	 * Returns the <tt>phi-</tt>quantile; that is, an element <tt>elem</tt> for which holds that <tt>phi</tt> percent of data elements are less than <tt>elem</tt>.
	 * The quantile need not necessarily be contained in the data sequence, it can be a linear interpolation.
	 * @param sortedData the data sequence; <b>must be sorted ascending</b>.
	 * @param phi the percentage; must satisfy <tt>0 &lt;= phi &lt;= 1</tt>.
	 */
	
/*
	public static double quantile( double[] sortedElements, double phi) {
		//double[] sortedElements = sortedData.elements();
		int n = sortedElements.length;
		
		double index = phi * (n - 1) ;
		int lhs = (int)index ;
		double delta = index - lhs ;
		double result;

		if (n == 0) return 0.0 ;

		if (lhs == n - 1) {
			result = sortedElements[lhs] ;
		}
		else {
			result = (1 - delta) * sortedElements[lhs] + delta * sortedElements[lhs + 1] ;
		}

		return result ;
	}
*/
	
	
	/**
	 * Returns the sample kurtosis (aka excess) of a data sequence.
	 *
	 * Ref: R.R. Sokal, F.J. Rohlf, Biometry: the principles and practice of statistics
	 * in biological research (W.H. Freeman and Company, New York, 1998, 3rd edition)
	 * p. 114-115.
	 *
	 * @param size the number of elements of the data sequence.
	 * @param moment4 the fourth central moment, which is <tt>moment(data,4,mean)</tt>.
	 * @param sampleVariance the <b>sample variance</b>.
	 */
/*
	public static double sampleKurtosis(int size, double moment4, double sampleVariance) {
		 int    n=size;
		 double s2=sampleVariance; // (y-ymean)^2/(n-1)
		 double m4 = moment4*n;    // (y-ymean)^4
		 return m4*n*(n+1) / ((n-1)*(n-2)*(n-3)*s2*s2)
			  - 3.0*(n-1)*(n-1)/((n-2)*(n-3));
	}
*/
	/**
	 * Return the standard error of the sample kurtosis.
	 *
	 * Ref: R.R. Sokal, F.J. Rohlf, Biometry: the principles and practice of statistics
	 * in biological research (W.H. Freeman and Company, New York, 1998, 3rd edition)
	 * p. 138.
	 *
	 * @param size the number of elements of the data sequence.
	 */
/*
	public static double sampleKurtosisStandardError(int size) {
		 int n=size;
		 return Math.sqrt( 24.0*n*(n-1)*(n-1)/((n-3)*(n-2)*(n+3)*(n+5)) );
	}
*/
	/**
	 * Returns the sample skew of a data sequence.
	 *
	 * Ref: R.R. Sokal, F.J. Rohlf, Biometry: the principles and practice of statistics
	 * in biological research (W.H. Freeman and Company, New York, 1998, 3rd edition)
	 * p. 114-115.
	 *
	 * @param size the number of elements of the data sequence.
	 * @param moment3 the third central moment, which is <tt>moment(data,3,mean)</tt>.
	 * @param sampleVariance the <b>sample variance</b>.
	 */
/*
	public static double sampleSkew(int size, double moment3, double sampleVariance) {
		 int    n=size;
		 double s=Math.sqrt(sampleVariance); // sqrt( (y-ymean)^2/(n-1) )
		 double m3 = moment3*n;    // (y-ymean)^3
		 return n*m3 / ((n-1)*(n-2)*s*s*s);
	}
*/
	/**
	 * Returns the sample variance of a data sequence.
	 * That is <tt>Sum ( (data[i]-mean)^2 ) / (data.size()-1)</tt>.
	 */
/*
	public static double sampleVariance(double[] elements, double mean) {
		//double[] elements = data.elements();
		int size = elements.length;	
		double sum = 0 ;
		// find the sum of the squares 
		for (int i = size; --i >= 0; ) {
			double delta = elements[i] - mean;
			sum += delta * delta;
		}

		return sum / (size-1);
	}
*/
	/**
	 * Returns the sum of logarithms of a data sequence, which is <tt>Sum( Log(data[i])</tt>.
	 * @param data the data sequence.
	 * @param from the index of the first data element (inclusive).
	 * @param to the index of the last data element (inclusive).
	 */
	
/*
	public static double sumOfLogarithms(double[] elements) {
		//double[] elements = data.elements();
		double logsum = 0;
		for (int i=0;i<elements.length;i++) logsum += Math.log(elements[i]);
		return logsum;
	}
*/
	
	/**
	 * Returns the trimmed mean of a sorted data sequence.
	 *
	 * @param sortedData the data sequence; <b>must be sorted ascending</b>.
	 * @param mean the mean of the (full) sorted data sequence.
	 * @left the number of leading elements to trim.
	 * @right the number of trailing elements to trim.
	 */
	
/*
	public static double trimmedMean(double[] sortedElements, double mean, int left, int right) {
		int N = sortedElements.length;
		//if (N==0) throw new IllegalArgumentException("Empty data.");
		//if (left+right >= N) throw new IllegalArgumentException("Not enough data.");

		//double[] sortedElements = sortedData.elements();
		int N0=N;
		for(int i=0; i<left; ++i)
			mean += (mean-sortedElements[i])/(--N);
		for(int i=0; i<right; ++i)
			mean += (mean-sortedElements[N0-1-i])/(--N);
		return mean;
	}
*/
	
	
	/**
	 * Returns the weighted mean of a data sequence.
	 * That is <tt> Sum (data[i] * weights[i]) / Sum ( weights[i] )</tt>.
	 */
/*
	public static double weightedMean(double[] elements, double[] theWeights) {
		int size = elements.length;
		//if (size != theWeights.length || size == 0) throw new IllegalArgumentException();
		
		//double[] elements = data.elements();
		//double[] theWeights = weights.elements();
		double sum = 0.0;
		double weightsSum = 0.0;
		for (int i=size; --i >= 0; ) {
			double w = theWeights[i];
			sum += elements[i] * w;
			weightsSum += w;
		}

		return sum/weightsSum;
	}
*/
	
	/**
	 * Searches the list for the specified value using
	 * the binary search algorithm.  The list must <strong>must</strong> be
	 * sorted (as by the sort method) prior to making this call.  If
	 * it is not sorted, the results are undefined: in particular, the call
	 * may enter an infinite loop.  If the list contains multiple elements
	 * equal to the specified key, there is no guarantee which of the multiple elements
	 * will be found.
	 *
	 * @param list the list to be searched.
	 * @param key the value to be searched for.
	 * @param from the leftmost search position, inclusive.
	 * @param to the rightmost search position, inclusive.
	 * @return index of the search key, if it is contained in the list;
	 *	       otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The <i>insertion
	 *	       point</i> is defined as the the point at which the value would
	 * 	       be inserted into the list: the index of the first
	 *	       element greater than the key, or <tt>list.length</tt>, if all
	 *	       elements in the list are less than the specified key.  Note
	 *	       that this guarantees that the return value will be &gt;= 0 if
	 *	       and only if the key is found.
	 * @see java.util.Arrays
	 */
	
/*
	public static int binarySearchFromTo(int[] list, int key, int from, int to) {
		int midVal;
		while (from <= to) {
			int mid = (from + to) / 2;
			midVal = list[mid];
			if (midVal < key) from = mid + 1;
			else if (midVal > key) to = mid - 1;
			else return mid; // key found
		}
		return -(from + 1);  // key not found.
*/

		/*
		// even for very short lists (0,1,2,3 elems) this is only 10% faster
		while (from<=to && list[from++] < key) ;
		if (from<=to) {
			if (list[--from] == key) return from;
		}
		return -(from + 1);
		*/
	//}
	
	/**
	 * Efficiently returns the binomial coefficient, often also referred to as "n over k" or "n choose k".
	 * The binomial coefficient is defined as <tt>(n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k )</tt>.
	 * <ul>
	 * <li>k<0<tt>: <tt>0</tt>.
	 * <li>k==0<tt>: <tt>1</tt>.
	 * <li>k==1<tt>: <tt>n</tt>.
	 * <li>else: <tt>(n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k )</tt>.
	 * </ul>
	 * @return the binomial coefficient.
	 */
	
/*
	public static double binomial(double n, long k) {
		if (k<0) return 0;
		if (k==0) return 1;
		if (k==1) return n;
		
		// binomial(n,k) = (n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k )
		double a = n-k+1;
		double b = 1;
		double binomial = 1;
		for (long i=k; i-- > 0; ) {
			binomial *= (a++) / (b++);
		}
		return binomial;
	}
*/
	
	/**
	 * Evaluates the series of Chebyshev polynomials Ti at argument x/2.
	 * The series is given by
	 * <pre>
	 *        N-1
	 *         - '
	 *  y  =   >   coef[i] T (x/2)
	 *         -            i
	 *        i=0
	 * </pre>
	 * Coefficients are stored in reverse order, i.e. the zero
	 * order term is last in the array.  Note N is the number of
	 * coefficients, not the order.
	 * <p>
	 * If coefficients are for the interval a to b, x must
	 * have been transformed to x -> 2(2x - b - a)/(b-a) before
	 * entering the routine.  This maps x from (a, b) to (-1, 1),
	 * over which the Chebyshev polynomials are defined.
	 * <p>
	 * If the coefficients are for the inverted interval, in
	 * which (a, b) is mapped to (1/b, 1/a), the transformation
	 * required is x -> 2(2ab/x - b - a)/(b-a).  If b is infinity,
	 * this becomes x -> 4a/x - 1.
	 * <p>
	 * SPEED:
	 * <p>
	 * Taking advantage of the recurrence properties of the
	 * Chebyshev polynomials, the routine requires one more
	 * addition per loop than evaluating a nested polynomial of
	 * the same degree.
	 *
	 * @param x argument to the polynomial.
	 * @param coef the coefficients of the polynomial.
	 * @param N the number of coefficients.
	 */
	/*
	public static double chbevl( double x, double coef[], int N ) throws ArithmeticException {
		double b0, b1, b2;

		int p = 0;
		int i;

		b0 = coef[p++];
		b1 = 0.0;
		i = N - 1;

		do {
			b2 = b1;
			b1 = b0;
			b0 = x * b1  -  b2  + coef[p++];
		} while( --i > 0);

		return( 0.5*(b0-b2) );
	}*/
	
	
	
	/**
	 * Returns the factorial of the argument.
	 */
	/*
	static private double fac2(int j) {
		long i = j;
		if (j < 0) i = Math.abs(j);
		
		double d = 1.0;
		while (i > 1) d *= i--;
		
		if (j < 0) return -d;
		else return d;
	}
	*/
	/**
	   * Computes the binomial logistic inverse link function.
	   *
	   * @param r The value to transform.
	   * @return The logit of r.
	   */
/*
	  public static double link(double r) {
	    if (r < 0.0) {
	      double s = Math.exp(r);
	      return s / (1.0 + s);
	    } else {
	      double s = Math.exp(-r);
	      return 1.0 / (1.0 + s);
	    }
	  }
*/
	  
	  /**
	   * Returns the winsorized mean of a sorted data sequence.
	   *
	   * @param sortedData the data sequence; <b>must be sorted ascending</b>.
	   * @param mean the mean of the (full) sorted data sequence.
	   * @left the number of leading elements to trim.
	   * @right the number of trailing elements to trim.
	   */
/*
	  public static double winsorizedMean(double[] sortedElements, int left, int right) {
	  	int N = sortedElements.length;
	  	//if (N==0) throw new IllegalArgumentException("Empty data.");
	  	//if (left+right >= N) throw new IllegalArgumentException("Not enough data.");

	  	//double[] sortedElements = sortedData.elements();
	  	 double sum=0;
		  for(int i=0;i<sortedElements.length;i++)
		  {
			  sum+=sortedElements[i];
			  
			  
		  }
		  double mean = sum / sortedElements.length;

	  	double leftElement = sortedElements[left];
	  	for(int i=0; i<left; ++i)
	  		mean += (leftElement-sortedElements[i])/N;

	  	double rightElement = sortedElements[N-1-right];
	  	for(int i=0; i<right; ++i)
	  		mean += (rightElement-sortedElements[N-1-i])/N;

	  	return mean;
	  }
*/
	  /**
	   * Returns the probability distribution function of the discrete geometric distribution.
	   * <p>
	   * <tt>p(k) = p * (1-p)^k</tt> for <tt> k &gt;= 0</tt>.
	   * <p>
	   * @param k the argument to the probability distribution function.
	   * @param p the parameter of the probability distribution function.
	   */
/*
	  public static double geometricPdf(int k, double p) {
	  	//if (k<0) throw new IllegalArgumentException();
	  	return p * Math.pow(1-p,k);
	  }
*/
	  
	  /**
	   * Returns the kurtosis (aka excess) of a data sequence.
	   * @param moment4 the fourth central moment, which is <tt>moment(data,4,mean)</tt>.
	   * @param standardDeviation the standardDeviation.
	   */
/*
	  public static double kurtosis(double[] data) {
		  double sum=0;
		  double sumPD=0;
		  double sumSq=0;
		  for(int i=0;i<data.length;i++)
		  {
			  sum+=data[i];
			  sumSq+=data[i]*data[i];
			  
		  }
		  double mean = sum / data.length;
		  double standardDeviation=Math.sqrt((sumSq-mean*sum)/data.length);
		  for(int i=0;i<data.length;i++)
		  {
			  sumPD+=Math.pow((data[i]-mean),4);
			  
		  }
		  double moment4= sumPD / data.length;
	  	return -3 + moment4 / (standardDeviation * standardDeviation * standardDeviation * standardDeviation);
	  }
*/
	  
	  /**
	   * Returns the value ln(Gamma(xx) for xx > 0.  Full accuracy is obtained for 
	   * xx > 1. For 0 < xx < 1. the reflection formula (6.1.4) can be used first.
	   * (Adapted from Numerical Recipes in C)
	   */
/*
	  public static double logGamma(double xx) {
		  double[] cof = { // for method logGamma() 
					76.18009172947146,-86.50532032941677,
					24.01409824083091, -1.231739572450155,
					0.1208650973866179e-2, -0.5395239384953e-5};
	  	double x = xx - 1.0;
	  	double tmp = x + 5.5;
	  	tmp -= (x + 0.5) * Math.log(tmp);
	  	double ser = 1.000000000190015;

	  	double[] coeff = cof;
	  	for (int j = 0; j <= 5; j++ ) {
	  		x++;
	  		ser += coeff[j]/x;
	  	}
	  	return -tmp + Math.log(2.5066282746310005*ser);
	  }
*/
	  /**
	   * Returns the pooled mean of two data sequences.
	   * That is <tt>(size1 * mean1 + size2 * mean2) / (size1 + size2)</tt>.
	   *
	   * @param size1 the number of elements in data sequence 1.
	   * @param mean1 the mean of data sequence 1.
	   * @param size2 the number of elements in data sequence 2.
	   * @param mean2 the mean of data sequence 2.
	   */
/*
	  public static double pooledMean(double[] data1, double[] data2) {
	  	
		  double sum1=0;
		  for(int i=0;i<data1.length;i++)
		  {
			  sum1+=data1[i];
			  
		  }
		  double mean1 = sum1 / data1.length;
		  
		  double sum2=0;
		  for(int i=0;i<data2.length;i++)
		  {
			  sum2+=data2[i];
			  
		  }
		  double mean2 = sum2 / data2.length;
		  return (data1.length * mean1 + data2.length * mean2) / (data1.length + data2.length);
	  }
*/
	  /**
	   * Returns the pooled variance of two data sequences.
	   * That is <tt>(size1 * variance1 + size2 * variance2) / (size1 + size2)</tt>;
	   *
	   * @param size1 the number of elements in data sequence 1.
	   * @param variance1 the variance of data sequence 1.
	   * @param size2 the number of elements in data sequence 2.
	   * @param variance2 the variance of data sequence 2.
	   */
/*
	  public static double pooledVariance(double[] data1, double[] data2) {
	  	
		  double sum1=0;
		  double sumSq1=0;
		  for(int i=0;i<data1.length;i++)
		  {
			  sum1+=data1[i];
			  sumSq1+=data1[i]*data1[i];
			  
		  }
		  double mean1 = sum1 / data1.length;
		  double var1=(sumSq1-mean1*sum1)/data1.length;
		  
		  double sum2=0;
		  double sumSq2=0;
		  for(int i=0;i<data2.length;i++)
		  {
			  sum2+=data2[i];
			  sumSq2+=data2[i]*data2[i];
			  
		  }
		  double mean2 = sum2 / data2.length;
		  double var2=(sumSq2-mean2*sum2)/data2.length;
		  return (data1.length * var1 + data2.length * var2) / (data1.length + data2.length);
	  }
*/
	  
	  /**
	   * Evaluates the given polynomial of degree <tt>N</tt> at <tt>x</tt>.
	   * <pre>
	   *                     2          N
	   * y  =  C  + C x + C x  +...+ C x
	   *        0    1     2          N
	   *
	   * Coefficients are stored in reverse order:
	   *
	   * coef[0] = C  , ..., coef[N] = C  .
	   *            N                   0
	   * </pre>
	   * In the interest of speed, there are no checks for out of bounds arithmetic.
	   *
	   * @param x argument to the polynomial.
	   * @param coef the coefficients of the polynomial.
	   * @param N the degree of the polynomial.
	   */
/*
	  public static double polevl( double x, double coef[], int N ) throws ArithmeticException {
	  	double ans;
	  	ans = coef[0];

	  	for(int i=1; i<=N; i++) ans = ans*x+coef[i];

	  	return ans;
	  }
*/
	  
	  /**
	   * Returns the linearly interpolated number of elements in a list less or equal to a given element.
	   * The rank is the number of elements <= element.
	   * Ranks are of the form <tt>{0, 1, 2,..., sortedList.size()}</tt>.
	   * If no element is <= element, then the rank is zero.
	   * If the element lies in between two contained elements, then linear interpolation is used and a non integer value is returned.
	   *
	   * @param sortedList the list to be searched (must be sorted ascending).
	   * @param element the element to search for.
	   * @return the rank of the element.
	   */
/*
	  public static double rankInterpolated(double[] sortedList, double element,int index) {
	  	//int index = sortedList.binarySearch(element);
	  	if (index >= 0) { // element found
	  		// skip to the right over multiple occurances of element.
	  		int to = index+1;
	  		int s = sortedList.length;
	  		while (to<s && sortedList[to]==element) to++;
	  		return to;
	  	}
	  	
	  	// element not found
	  	int insertionPoint = -index-1;
	  	if (insertionPoint == 0 || insertionPoint==sortedList.length) return insertionPoint;

	  	double from = sortedList[insertionPoint-1];
	  	double to = sortedList[insertionPoint];
	  	double delta = (element-from) / (to-from); //linear interpolation
	  	return insertionPoint + delta;
	  }
*/
	  /**
	   * Returns the sample weighted variance of a data sequence.
	   * That is <tt>(sumOfSquaredProducts  -  sumOfProducts * sumOfProducts / sumOfWeights) / (sumOfWeights - 1)</tt>.
	   *
	   * @param sumOfWeights <tt>== Sum( weights[i] )</tt>. 
	   * @param sumOfProducts <tt>== Sum( data[i] * weights[i] )</tt>.
	   * @param sumOfSquaredProducts <tt>== Sum( data[i] * data[i] * weights[i] )</tt>.
	   */
/*
	  public static double sampleWeightedVariance(double[] data, double[] weights) {
		  double sumOfWeights=0;
		  double sumOfProducts=0;
		  double sumOfSquaredProducts=0;
		  for(int i=0;i<data.length;i++)
	  		{
			  sumOfWeights+=weights[i];
			  sumOfProducts+=data[i] * weights[i];
			  sumOfSquaredProducts+=data[i] * data[i] * weights[i];
	  		}
		  
		  return (sumOfSquaredProducts  -  sumOfProducts * sumOfProducts / sumOfWeights) / (sumOfWeights - 1);
	  }
*/
	
	  /**
	   * Returns the skew of a data sequence.
	   * @param moment3 the third central moment, which is <tt>moment(data,3,mean)</tt>.
	   * @param standardDeviation the standardDeviation.
	   */
/*
	  public static double skew(double[] data) {
		  double sum=0;
		  double sumPD=0;
		  double sumSq=0;
		  for(int i=0;i<data.length;i++)
		  {
			  sum+=data[i];
			  sumSq+=data[i]*data[i];
			  
		  }
		  double mean = sum / data.length;
		  double standardDeviation=Math.sqrt((sumSq-mean*sum)/data.length);
		  for(int i=0;i<data.length;i++)
		  {
			  sumPD+=Math.pow((data[i]-mean),3);
			  
		  }
		  double moment3= sumPD / data.length;
	  	  return moment3 / (standardDeviation * standardDeviation * standardDeviation);
	  }
*/
	  
	  /**
	   * Modifies a data sequence to be standardized.
	   * Changes each element <tt>data[i]</tt> as follows: <tt>data[i] = (data[i]-mean)/standardDeviation</tt>.
	   */
/*
	  public static double[] standardize(double[] data) {
	  	//double[] elements = data.elements();
		  double sum=0;
		  double sumSq=0;
		  for(int i=0;i<data.length;i++)
		  {
			  sum+=data[i];
			  sumSq+=data[i]*data[i];
			  
		  }
		  double mean = sum / data.length;
		  double sd=Math.sqrt((sumSq-mean*sum)/data.length);
	  	for (int i=0; i< data.length;i++) data[i] = (data[i]-mean)/sd;
	  	return data;
	  }
*/
	  
	  /**
	   * Returns the weighted RMS (Root-Mean-Square) of a data sequence.
	   * That is <tt>Sum( data[i] * data[i] * weights[i]) / Sum( data[i] * weights[i] )</tt>,
	   * or in other words <tt>sumOfProducts / sumOfSquaredProducts</tt>.
	   *
	   * @param sumOfProducts <tt>== Sum( data[i] * weights[i] )</tt>.
	   * @param sumOfSquaredProducts <tt>== Sum( data[i] * data[i] * weights[i] )</tt>.
	   */
/*
	  public static double weightedRMS(double[] data, double[] weights) {
		  double sumOfProducts=0;
		  double sumOfSquaredProducts=0;
		  for(int i=0;i<data.length;i++)
		  {
			  sumOfProducts+=data[i]*weights[i];
			  sumOfSquaredProducts=data[i]*data[i]*weights[i];
		  }
			  
		  	return sumOfProducts / sumOfSquaredProducts;
	}
*/
	  /*
	  * Returns the harmonic mean of a data sequence.
	  *
	  * @param size the number of elements in the data sequence.
	  * @param sumOfInversions <tt>Sum( 1.0 / data[i])</tt>.
	  */
/*
	 public static double harmonicMean(double[] data) {
		 double sumOfInversions=0;
		 for(int i=0;i<data.length;i++)
		 {
			 sumOfInversions+=1/data[i];
		 }
		 
	 	return data.length / sumOfInversions;
	 }
*/
	 
/*
	 public static double sumOfPowerOfDeviations(double[] data,int k,double c)
	 {
		 double sum=0;
		 for(int i=0;i<data.length;i++)
		 {
			 sum+=Math.pow(data[i]-c,k);
		 }
		 return sum;
	 }
*/
/*
	 public static double[] power(double[] data,int k)
	 {
		 for(int i=0;i<data.length;i++)
		 {
			 data[i]=Math.pow(data[i],k);
		 }
		 return data;
	 }
*/
/*
	 public static double[] square(double[] data)
	 {
		 for(int i=0;i<data.length;i++)
		 {
			 data[i]=data[i]*data[i];
		 }
		 return data;
	 }
*/
	 
	
	public static void main(String[] args)
	{
		double[] d={12,13,25,11,10};
		//System.out.println(durbinWatson(d));
		
		double[] d1={25,11,12,13,10};
		//System.out.println(durbinWatson(d1));

		/*
		//for (MRChecker.MR mr : MRChecker.MR.values())
		//{
			 //System.out.println("Checking MR:"+mr);
			 //System.out.println("-------------------");
			 int cntEq=0;
			 int cntGt=0;
			 int cntLt=0;
			 int probs=0;
			 for(int j=0;j<100;j++)
			 {
				Random randSize=new Random();
				int size=randSize.nextInt(99)+3;
				//double[] d=(double[])MRChecker.createArrayInput(Double.TYPE, size);
				//Arrays.sort(d);
				double k=randSize.nextDouble()*1000;
				long l=randSize.nextLong();
				//double mean=StatUtils.mean(d);
				//double sd=Math.sqrt(StatUtils.variance(d));
				//Random rand=new Random();
				//int randomNum1 = rand.nextInt(d.length/2);
				//int randomNum2 = rand.nextInt(d.length/2);
				double r1=link(k);
				//System.out.println("Init:"+k);
				double f=(Double)MRChecker.createFollowupInput(k,MRChecker.MR.inv);
				//System.out.println("Follow:"+f);
				//double[] df=(double[])MRChecker.createFollowupInput(d,MR.add);
				//Arrays.sort(df);
				//double mean2=StatUtils.mean(df);
				//double sd2=Math.sqrt(StatUtils.variance(df));
				double r2=link(f);
				int r=MRChecker.checkResult(r1, r2);
				
				if(r==0)
					 cntEq++;
				 if(r==1)
					 cntGt++;
				 if(r==-1)
					 cntLt++;
				 if(r==-2 || r==-3)
					 probs++;
			 }
			 System.out.println("Num equal="+cntEq);
			 System.out.println("Num gt="+cntGt);
			 System.out.println("Num lt="+cntLt);
			 System.out.println("Num probs="+probs);
			 System.out.println("");
		//}
		*/		
		
	}
	
}
