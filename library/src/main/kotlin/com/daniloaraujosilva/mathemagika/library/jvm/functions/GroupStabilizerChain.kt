package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GroupStabilizerChain
 *
 * Full name:        System`GroupStabilizerChain
 *
 * Usage:            GroupStabilizerChain[group] returns a list of successive stabilizers in group of the points in a base of group.
 *
 * Options:          GroupActionBase -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroupStabilizerChain
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupStabilizerChain.html
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
fun groupStabilizerChain(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupStabilizerChain", arguments.toMutableList(), options)
}
