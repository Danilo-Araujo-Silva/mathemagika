package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KnownUnitQ
 *
 * Full name:        System`KnownUnitQ
 *
 * Usage:            KnownUnitQ[expr] returns True if expr is a canonical unit, and False otherwise.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KnownUnitQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/KnownUnitQ.html
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
fun knownUnitQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KnownUnitQ", arguments.toMutableList(), options)
}
