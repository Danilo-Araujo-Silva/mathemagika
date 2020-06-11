package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReadProtected
 *
 * Full name:        System`ReadProtected
 *
 * Usage:            ReadProtected is an attribute that prevents values associated with a symbol from being seen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReadProtected
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReadProtected.html
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
fun readProtected(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReadProtected", arguments.toMutableList(), options)
}
