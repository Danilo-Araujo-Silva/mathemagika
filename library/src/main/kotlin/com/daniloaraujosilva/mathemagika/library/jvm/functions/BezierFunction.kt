package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BezierFunction
 *
 * Full name:        System`BezierFunction
 *
 *                   BezierFunction[{pt , pt , …}] represents a Bézier function for a curve defined by the control points pt .
 *                                     1    2                                                                               i
 * Usage:            BezierFunction[array] represents a Bézier function for a surface or high-dimensional manifold.
 *
 *                   Method -> {}
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BezierFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/BezierFunction.html
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
fun bezierFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BezierFunction", arguments.toMutableList(), options)
}
