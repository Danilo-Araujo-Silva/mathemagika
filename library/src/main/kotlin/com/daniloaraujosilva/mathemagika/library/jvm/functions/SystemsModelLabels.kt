package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelLabels
 *
 * Full name:        System`SystemsModelLabels
 *
 * Usage:            SystemsModelLabels is an option to StateSpaceModel etc. that specifies labels of variables.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelLabels
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelLabels.html
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
fun systemsModelLabels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelLabels", arguments.toMutableList(), options)
}
