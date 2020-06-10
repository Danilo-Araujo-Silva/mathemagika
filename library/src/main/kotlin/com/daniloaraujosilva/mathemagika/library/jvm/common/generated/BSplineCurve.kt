package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BSplineCurve
 * 
 * Full name:        System`BSplineCurve
 * 
 *                   BSplineCurve[{pt , pt , …}] is a graphics primitive that represents a nonuniform rational B-spline curve with control points pt .
 * Usage:                            1    2                                                                                                         i
 * 
 *                   SplineClosed -> False
 *                   SplineDegree -> Automatic
 *                   SplineKnots -> Automatic
 * Options:          SplineWeights -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BSplineCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/BSplineCurve.html
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
fun bSplineCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BSplineCurve", arguments.toMutableList(), options)
}
