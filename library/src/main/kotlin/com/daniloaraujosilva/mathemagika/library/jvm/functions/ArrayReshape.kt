package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ArrayReshape
 *
 * Full name:        System`ArrayReshape
 *
 *                   ArrayReshape[list, dims] arranges the elements of list into a rectangular array with dimensions dims.
 * Usage:            ArrayReshape[list, dims, padding] uses the specified padding if list does not contain enough elements.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ArrayReshape
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayReshape.html
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
fun arrayReshape(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayReshape", arguments.toMutableList(), options)
}
