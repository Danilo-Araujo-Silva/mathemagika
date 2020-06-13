package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultElement
 *
 * Full name:        System`DefaultElement
 *
 * Usage:            DefaultElement is an option for Grid and related constructs which specifies what to insert when a new element is interactively created.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultElement.html
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
fun defaultElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultElement", arguments.toMutableList(), options)
}
