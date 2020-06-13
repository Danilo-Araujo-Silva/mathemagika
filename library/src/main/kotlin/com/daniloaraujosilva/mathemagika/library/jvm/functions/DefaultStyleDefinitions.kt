package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultStyleDefinitions
 *
 * Full name:        System`DefaultStyleDefinitions
 *
 * Usage:            DefaultStyleDefinitions is a global option that specifies the default stylesheet for all new notebooks.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultStyleDefinitions
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultStyleDefinitions.html
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
fun defaultStyleDefinitions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultStyleDefinitions", arguments.toMutableList(), options)
}
