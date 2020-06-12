package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TabSpacings
 *
 * Full name:        System`TabSpacings
 *
 * Usage:            TabSpacings is an option for character selections that specifies the number of spaces in ems that the cursor advances when the Tab key is pressed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TabSpacings
 * Documentation:    web: http://reference.wolfram.com/language/ref/TabSpacings.html
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
fun tabSpacings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TabSpacings", arguments.toMutableList(), options)
}
