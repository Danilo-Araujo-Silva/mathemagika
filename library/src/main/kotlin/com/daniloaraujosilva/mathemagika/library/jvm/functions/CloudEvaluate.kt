package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CloudEvaluate
 *
 * Full name:        System`CloudEvaluate
 *
 *                   CloudEvaluate[expr] evaluates expr in the cloud and returns the result.
 * Usage:            CloudEvaluate[expr, h] wraps the head h around the result before returning it.
 *
 *                   CloudBase -> Automatic
 * Options:          IncludeDefinitions -> True
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudEvaluate
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudEvaluate.html
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
fun cloudEvaluate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudEvaluate", arguments.toMutableList(), options)
}
