package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CompatibleUnitQ
 *
 * Full name:        System`CompatibleUnitQ
 *
 *                   CompatibleUnitQ[quantity , quantity ] returns True if quantity  and quantity  have compatible units, and False otherwise.
 * Usage:                                    1          2                          1             2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompatibleUnitQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompatibleUnitQ.html
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
fun compatibleUnitQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompatibleUnitQ", arguments.toMutableList(), options)
}
