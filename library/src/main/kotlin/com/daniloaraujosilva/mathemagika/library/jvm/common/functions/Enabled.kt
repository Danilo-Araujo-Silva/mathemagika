package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Enabled
 *
 * Full name:        System`Enabled
 *
 * Usage:            Enabled is an option for objects such as Slider that specifies whether the objects should be enabled for interactive manipulation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Enabled
 * Documentation:    web: http://reference.wolfram.com/language/ref/Enabled.html
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
fun enabled(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Enabled", arguments.toMutableList(), options)
}
