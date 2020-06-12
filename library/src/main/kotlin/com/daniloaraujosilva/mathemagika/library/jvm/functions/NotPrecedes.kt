package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotPrecedes
 *
 * Full name:        System`NotPrecedes
 *
 * Usage:            NotPrecedes[x, y, …] displays as x ⊀ y ⊀ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotPrecedes
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotPrecedes.html
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
fun notPrecedes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotPrecedes", arguments.toMutableList(), options)
}
