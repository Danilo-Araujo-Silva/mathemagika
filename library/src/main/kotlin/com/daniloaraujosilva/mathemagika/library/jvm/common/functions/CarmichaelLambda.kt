package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CarmichaelLambda
 *
 * Full name:        System`CarmichaelLambda
 *
 * Usage:            CarmichaelLambda[n] gives the Carmichael function λ(n).
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CarmichaelLambda
 * Documentation:    web: http://reference.wolfram.com/language/ref/CarmichaelLambda.html
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
fun carmichaelLambda(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CarmichaelLambda", arguments.toMutableList(), options)
}
