package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetPortGradient
 *
 * Full name:        System`NetPortGradient
 *
 *                   NetPortGradient["port"] represents the gradient of the output of a net with respect to the value of the specified input port.
 *                   NetPortGradient["param"] represents the gradient of the output with respect to a learned parameter named param.
 *                   NetPortGradient[{layer , layer , …, "param"}] represents the gradient with respect to a parameter at a specific position in a net.
 * Usage:                                  1       2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetPortGradient
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetPortGradient.html
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
fun netPortGradient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetPortGradient", arguments.toMutableList(), options)
}
