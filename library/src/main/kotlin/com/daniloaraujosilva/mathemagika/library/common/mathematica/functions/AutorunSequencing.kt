package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AutorunSequencing
 *
 * Full name:        System`AutorunSequencing
 *
 * Usage:            AutorunSequencing is an option for Manipulate that specifies how autorun should use the controls provided.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AutorunSequencing
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutorunSequencing.html
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
fun autorunSequencing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutorunSequencing", arguments.toMutableList(), options)
}
