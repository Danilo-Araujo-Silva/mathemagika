package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxExtraConditions
 *
 * Full name:        System`MaxExtraConditions
 *
 * Usage:            MaxExtraConditions is an option to Solve and related functions that specifies how many extra equational conditions on continuous parameters to allow in solutions that are given.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MaxExtraConditions
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxExtraConditions.html
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
fun maxExtraConditions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxExtraConditions", arguments.toMutableList(), options)
}
