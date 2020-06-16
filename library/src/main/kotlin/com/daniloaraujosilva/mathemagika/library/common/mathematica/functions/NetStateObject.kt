package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NetStateObject
 *
 * Full name:        System`NetStateObject
 *
 *                   NetStateObject[net] creates an object derived from net that represents a neural net with additional stored state information that is updated when the net is applied to data.
 * Usage:            NetStateObject[net, seed] creates an object in which additional stored state information is initialized using seed.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetStateObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetStateObject.html
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
fun netStateObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetStateObject", arguments.toMutableList(), options)
}
