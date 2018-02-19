https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
The class Math contains methods for performing basic numeric operations such as the elementary exponential, 
logarithm, square root, and trigonometric functions.
Unlike some of the numeric methods of class StrictMath, all implementations of the equivalent functions of 
class Math are not defined to return the bit-for-bit same results. This relaxation permits better-performing 
implementations where strict reproducibility is not required.

By default many of the Math methods simply call the equivalent method in StrictMath for their implementation. 
Code generators are encouraged to use platform-specific native libraries or microprocessor instructions, where 
available, to provide higher-performance implementations of Math methods. Such higher-performance implementations 
 still must conform to the specification for Math.

The quality of implementation specifications concern two properties, accuracy of the returned result and 
monotonicity of the method. Accuracy of the floating-point Math methods is measured in terms of ulps, 
units in the last place. For a given floating-point format, an ulp of a specific real number value is the distance 
between the two floating-point values bracketing that numerical value. When discussing the accuracy of a 
method as a whole rather than at a specific argument, the number of ulps cited is for the worst-case error 
at any argument. If a method always has an error less than 0.5 ulps, the method always returns the 
floating-point number nearest the exact result; such a method is correctly rounded. A correctly rounded 
method is generally the best a floating-point approximation can be; however, it is impractical for many
floating-point methods to be correctly rounded. Instead, for the Math class, a larger error bound 
of 1 or 2 ulps is allowed for certain methods. Informally, with a 1 ulp error bound, when the exact result is
 a representable number, the exact result should be returned as the computed result; otherwise, either of
 the two floating-point values which bracket the exact result may be returned. For exact results large in magnitude,
 one of the endpoints of the bracket may be infinite. Besides accuracy at individual arguments, maintaining proper 
 relations between the method at different arguments is also important. Therefore, most methods with more
 than 0.5 ulp errors are required to be semi-monotonic: whenever the mathematical function is non-decreasing, 
 so is the floating-point approximation, likewise, whenever the mathematical function is non-increasing, 
 so is the floating-point approximation. Not all approximations that have 1 ulp accuracy will automatically 
 meet the monotonicity requirements.

The platform uses signed two's complement integer arithmetic with int and long primitive types. 
The developer should choose the primitive type to ensure that arithmetic operations consistently produce correct results,
 which in some cases means the operations will not overflow the range of values of the computation. 
 The best practice is to choose the primitive type and algorithm to avoid overflow. In cases where the size is int or long 
 and overflow errors need to be detected, the methods addExact, subtractExact, multiplyExact, and toIntExact throw an 
 ArithmeticException when the results overflow. For other arithmetic operations such as divide, absolute value, increment, 
 decrement, and negation overflow occurs only with a specific minimum or maximum value and should be checked 
 against the minimum or maximum as appropriate.
=============================================================================
Modifier and Type						Field and Description
=============================================================================
Math.E								The double value that is closer than any other to e,
									the base of the natural logarithms.
Math.PI								The double value that is closer than any other to pi, 
									the ratio of the circumference of a circle to its diameter.

Math.abs(double a)					Returns the absolute value of a double value.
Math.abs(float a)					Returns the absolute value of a float value.
Math.abs(int a)						Returns the absolute value of an int value.
Math.abs(long a)					Returns the absolute value of a long value.

Math.acos(double a)					Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.

Math.addExact(int x, int y)			Returns the sum of its arguments, throwing an exception if the result overflows an int.
Math.addExact(long x, long y)		Returns the sum of its arguments, throwing an exception if the result overflows a long.

Math.asin(double a)					Returns the arc sine of a value; the returned angle is in the range -pi/2 through pi/2.

Math.atan(double a)					Returns the arc tangent of a value; the returned angle is in the range -pi/2 through pi/2.

Math.atan2(double y, double x)	    Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).

Math.cbrt(double a)					Returns the cube root of a double value.

Math.ceil(double a)					Returns the smallest (closest to negative infinity) double value that is greater than or equal 
									to the argument and is equal to a mathematical integer.
																
Math.copySign(double magnitude, double sign)	Returns the first floating-point argument with the sign of the second floating-point argument.
Math.copySign(float magnitude, float sign)			Returns the first floating-point argument with the sign of the second floating-point argument.

Math.cos(double a)					Returns the trigonometric cosine of an angle.
Math.cosh(double x)					Returns the hyperbolic cosine of a double value.

Math.decrementExact(int a)			Returns the argument decremented by one, throwing an exception if the result overflows an int.
Math.decrementExact(long a)		    Returns the argument decremented by one, throwing an exception if the result overflows a long.

Math.exp(double a)					Returns Euler's number e raised to the power of a double value.
Math.expm1(double x)				Returns ex -1.

Math.floor(double a)				Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.
Math.floorDiv(int x, int y)			Returns the largest (closest to positive infinity) int value that is less than or equal to the algebraic quotient.
Math.floorDiv(long x, long y)		Returns the largest (closest to positive infinity) long value that is less than or equal to the algebraic quotient.
Math.floorMod(int x, int y)			Returns the floor modulus of the int arguments.
Math.floorMod(long x, long y)	    Returns the floor modulus of the long arguments.

Math.getExponent(double d)		    Returns the unbiased exponent used in the representation of a double.
Math.getExponent(float f)			Returns the unbiased exponent used in the representation of a float.

Math.hypot(double x, double y)	    Returns sqrt(x2 +y2) without intermediate overflow or underflow.
Math.IEEEremainder(double f1, double f2)	Computes the remainder operation on two arguments as prescribed by the IEEE 754 standard.

Math.incrementExact(int a)			Returns the argument incremented by one, throwing an exception if the result overflows an int.
Math.incrementExact(long a)		    Returns the argument incremented by one, throwing an exception if the result overflows a long.

Math.log(double a)					Returns the natural logarithm (base e) of a double value.
Math.log10(double a)				Returns the base 10 logarithm of a double value.
Math.log1p(double x)				Returns the natural logarithm of the sum of the argument and 1.

Math.max(double a, double b)	    Returns the greater of two double values.
Math.max(float a, float b)			Returns the greater of two float values.
Math.max(int a, int b)				Returns the greater of two int values.
Math.max(long a, long b)			Returns the greater of two long values.

Math.min(double a, double b)	    Returns the smaller of two double values.
Math.min(float a, float b)			Returns the smaller of two float values.
Math.min(int a, int b)				Returns the smaller of two int values.
Math.min(long a, long b)			Returns the smaller of two long values.

Math.multiplyExact(int x, int y)	Returns the product of the arguments, throwing an exception if the result overflows an int.
Math.multiplyExact(long x, long y)  Returns the product of the arguments, throwing an exception if the result overflows a long.

Math.negateExact(int a)				Returns the negation of the argument, throwing an exception if the result overflows an int.
Math.negateExact(long a)			Returns the negation of the argument, throwing an exception if the result overflows a long.

Math.nextAfter(double start, double direction)	Returns the floating-point number adjacent to the first argument in the direction of the second argument.
Math.nextAfter(float start, double direction)	Returns the floating-point number adjacent to the first argument in the direction of the second argument.

Math.nextDown(double d)			    Returns the floating-point value adjacent to d in the direction of negative infinity.
Math.nextDown(float f)				Returns the floating-point value adjacent to f in the direction of negative infinity.

Math.nextUp(double d)				Returns the floating-point value adjacent to d in the direction of positive infinity.
Math.nextUp(float f)				Returns the floating-point value adjacent to f in the direction of positive infinity.

Math.pow(double a, double b)	    Returns the value of the first argument raised to the power of the second argument.
Math.random()						Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
Math.rint(double a)					Returns the double value that is closest in value to the argument and is equal to a mathematical integer.

Math.round(double a)				Returns the closest long to the argument, with ties rounding to positive infinity.
Math.round(float a)					Returns the closest int to the argument, with ties rounding to positive infinity.

Math.scalb(double d, int scaleFactor) Returns d ? 2scaleFactor rounded as if performed by a single correctly rounded floating-point
															multiply to a member of the double value set.
Math.scalb(float f, int scaleFactor) Returns f ? 2scaleFactor rounded as if performed by a single correctly rounded floating-point multiply 
														to a member of the float value set.
Math.signum(double d)				Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero.
Math.signum(float f)				Returns the signum function of the argument; zero if the argument is zero, 1.0f if the argument is greater than zero, -1.0f if the argument is less than zero.
Math.sin(double a)					Returns the trigonometric sine of an angle.
Math.sinh(double x)					Returns the hyperbolic sine of a double value.
Math.sqrt(double a)					Returns the correctly rounded positive square root of a double value.

Math.subtractExact(int x, int y)	Returns the difference of the arguments, throwing an exception if the result overflows an int.
Math.subtractExact(long x, long y)  Returns the difference of the arguments, throwing an exception if the result overflows a long.

Math.tan(double a)					Returns the trigonometric tangent of an angle.
Math.tanh(double x)					Returns the hyperbolic tangent of a double value.
Math.toDegrees(double angrad)       Converts an angle measured in radians to an approximately equivalent angle measured in degrees.
Math.toIntExact(long value)		    Returns the value of the long argument; throwing an exception if the value overflows an int.
Math.toRadians(double angdeg)       Converts an angle measured in degrees to an approximately equivalent angle measured in radians.

Math.ulp(double d)					Returns the size of an ulp of the argument.
Math.ulp(float f)					Returns the size of an ulp of the argument.