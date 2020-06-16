package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CompositeQ
 *
 * Full name:        System`CompositeQ
 *
 * Usage:            CompositeQ[n] yields True if n is a composite number, and yields False otherwise.
 *
 * Options:          GaussianIntegers -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CompositeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompositeQ.html
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
fun compositeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompositeQ", arguments.toMutableList(), options)
}
