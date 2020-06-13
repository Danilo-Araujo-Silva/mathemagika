package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ScreenStyleEnvironment
 *
 * Full name:        System`ScreenStyleEnvironment
 *
 * Usage:            ScreenStyleEnvironment is an option for notebooks that specifies the style environment to be used in displaying a notebook on the screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScreenStyleEnvironment
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScreenStyleEnvironment.html
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
fun screenStyleEnvironment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScreenStyleEnvironment", arguments.toMutableList(), options)
}
