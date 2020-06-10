package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BSplineFunction
 * 
 * Full name:        System`BSplineFunction
 * 
 *                   BSplineFunction[{pt , pt , …}] represents a B-spline function for a curve defined by the control points pt .
 *                                      1    2                                                                                 i
 * Usage:            BSplineFunction[array] represents a B-spline function for a surface or high-dimensional manifold. 
 * 
 *                   Method -> {}
 *                   SplineClosed -> False
 *                   SplineDegree -> Automatic
 *                   SplineKnots -> Automatic
 *                   SplineWeights -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BSplineFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/BSplineFunction.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun bSplineFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BSplineFunction", arguments.toMutableList(), options)
}
