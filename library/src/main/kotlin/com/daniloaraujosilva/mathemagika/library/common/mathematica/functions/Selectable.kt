package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Selectable
 *
 * Full name:        System`Selectable
 *
 * Usage:            Selectable is an option for displayed objects, cells, and notebooks that specifies whether their contents can be selected interactively using the front end.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Selectable
 * Documentation:    web: http://reference.wolfram.com/language/ref/Selectable.html
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
fun selectable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Selectable", arguments.toMutableList(), options)
}
