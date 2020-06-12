package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ThueMorse
 *
 * Full name:        System`ThueMorse
 *
 *                                            th
 * Usage:            ThueMorse[n] gives the n   term in the Thue–Morse sequence.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ThueMorse
 * Documentation:    web: http://reference.wolfram.com/language/ref/ThueMorse.html
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
fun thueMorse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ThueMorse", arguments.toMutableList(), options)
}
