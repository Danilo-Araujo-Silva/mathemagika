package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ArcCurvature
 * 
 * Full name:        System`ArcCurvature
 * 
 *                   ArcCurvature[{x , …, x }, t] gives the curvature of the parametrized curve whose Cartesian coordinates x  are functions of t.
 *                                  1      n                                                                                 i
 *                   ArcCurvature[{x , …, x }, t, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                           1      n                             i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ArcCurvature
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcCurvature.html
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
fun arcCurvature(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcCurvature", arguments.toMutableList(), options)
}
