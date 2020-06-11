package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpokenString
 *
 * Full name:        System`SpokenString
 *
 * Usage:            SpokenString[expr] gives a string of text corresponding to a spoken representation of the expression expr.
 *
 *                   ArraySizeLimit -> Infinity
 *                   DetailedGraphics -> False
 *                   ExpressionDepthLimit -> Infinity
 *                   IncludeParentheses -> False
 *                   IntegerLimit -> Infinity
 *                   PostProcess -> True
 *                   RealPrecisionLimit -> 3
 * Options:          StringLengthLimit -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpokenString
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpokenString.html
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
fun spokenString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpokenString", arguments.toMutableList(), options)
}
