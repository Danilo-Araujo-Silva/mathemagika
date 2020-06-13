package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Exclusions
 *
 * Full name:        System`Exclusions
 *
 * Usage:            Exclusions is an option that specifies where to exclude in regions used by functions like Plot, Plot3D, and NIntegrate.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Exclusions
 * Documentation:    web: http://reference.wolfram.com/language/ref/Exclusions.html
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
fun exclusions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Exclusions", arguments.toMutableList(), options)
}
