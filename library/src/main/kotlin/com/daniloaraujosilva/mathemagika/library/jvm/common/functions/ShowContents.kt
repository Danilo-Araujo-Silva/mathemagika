package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowContents
 *
 * Full name:        System`ShowContents
 *
 * Usage:            ShowContents is an option for selections that specifies whether an object represented by a StyleBox should be displayed on the screen or replaced by blank space.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowContents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowContents.html
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
fun showContents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowContents", arguments.toMutableList(), options)
}
