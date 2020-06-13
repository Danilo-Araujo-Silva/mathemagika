package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Function
 *
 * Full name:        System`Function
 *
 *                   body & or Function[body] is a pure (or "anonymous") function. The formal parameters are # (or #1), #2, etc.
 *                   Function[x, body] is a pure function with a single formal parameter x.
 *                   Function[{x , x , …}, body] is a pure function with a list of formal parameters.
 *                              1   2
 * Usage:            Function[params, body, attrs] is a pure function that is treated as having attributes attrs for purposes of evaluation.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Function
 * Documentation:    web: http://reference.wolfram.com/language/ref/Function.html
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
fun function(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Function", arguments.toMutableList(), options)
}
