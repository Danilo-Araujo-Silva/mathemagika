package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Speak
 *
 * Full name:        System`Speak
 *
 * Usage:            Speak[expr] speaks a spoken representation of the expression expr.
 *
 *                   ArraySizeLimit -> 10
 *                   DetailedGraphics -> False
 *                   ExpressionDepthLimit -> 10
 *                   IncludeParentheses -> False
 *                   IntegerLimit -> 10000000000
 *                   RealPrecisionLimit -> 3
 * Options:          StringLengthLimit -> 1000
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Speak
 * Documentation:    web: http://reference.wolfram.com/language/ref/Speak.html
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
fun speak(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Speak", arguments.toMutableList(), options)
}
