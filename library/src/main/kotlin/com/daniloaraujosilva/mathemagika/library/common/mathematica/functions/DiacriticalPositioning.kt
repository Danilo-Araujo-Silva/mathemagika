package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiacriticalPositioning
 *
 * Full name:        System`DiacriticalPositioning
 *
 * Usage:            DiacriticalPositioning is an option for UnderscriptBox and related boxes that specifies how close diacritical characters are drawn to the base character.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiacriticalPositioning
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiacriticalPositioning.html
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
fun diacriticalPositioning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiacriticalPositioning", arguments.toMutableList(), options)
}
