package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CopyDatabin
 *
 * Full name:        System`CopyDatabin
 *
 *                   CopyDatabin[bin] creates a copy of a databin.
 * Usage:            CopyDatabin[bin, options] creates a copy with the specified options.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CopyDatabin
 * Documentation:    web: http://reference.wolfram.com/language/ref/CopyDatabin.html
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
fun copyDatabin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CopyDatabin", arguments.toMutableList(), options)
}
