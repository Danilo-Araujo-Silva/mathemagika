package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelDelay
 *
 * Full name:        System`SystemsModelDelay
 *
 * Usage:            SystemsModelDelay[δ] represents a time delay of δ in a StateSpaceModel or TransferFunctionModel.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelDelay
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelDelay.html
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
fun systemsModelDelay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelDelay", arguments.toMutableList(), options)
}
