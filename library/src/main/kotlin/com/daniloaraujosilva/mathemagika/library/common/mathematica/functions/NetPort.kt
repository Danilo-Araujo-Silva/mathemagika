package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NetPort
 *
 * Full name:        System`NetPort
 *
 *                   NetPort[{n, "port"}] represents the specified port for layer number n in a NetGraph or similar construct.
 *                   NetPort[{"name", "port"}] represents the specified port for the layer with the specified name.
 *                   NetPort[spec, port] is treated as equivalent to NetPort[{spec, port}].
 *                   NetPort["port"] represents the specified input or output port for a complete net.
 * Usage:            NetPort[All, "States"] represents the set of all states in a net associated with recurrent layers such as LongShortTermMemoryLayer.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetPort
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetPort.html
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
fun netPort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetPort", arguments.toMutableList(), options)
}
