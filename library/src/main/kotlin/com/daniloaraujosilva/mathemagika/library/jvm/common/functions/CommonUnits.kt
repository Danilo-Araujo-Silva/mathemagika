package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CommonUnits
 *
 * Full name:        System`CommonUnits
 *
 *                   CommonUnits[{quantity , quantity , …, quantity }] converts quantity  through quantity  to common units across compatible dimensions.
 * Usage:                                 1          2             n                    1                 n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CommonUnits
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommonUnits.html
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
fun commonUnits(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommonUnits", arguments.toMutableList(), options)
}
