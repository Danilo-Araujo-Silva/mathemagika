package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BezierCurve
 *
 * Full name:        System`BezierCurve
 *
 *                   BezierCurve[{pt , pt , …}] is a graphics primitive that represents a Bézier curve with control points pt .
 * Usage:                           1    2                                                                                   i
 *
 *                   SplineClosed -> False
 * Options:          SplineDegree -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BezierCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/BezierCurve.html
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
fun bezierCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BezierCurve", arguments.toMutableList(), options)
}
