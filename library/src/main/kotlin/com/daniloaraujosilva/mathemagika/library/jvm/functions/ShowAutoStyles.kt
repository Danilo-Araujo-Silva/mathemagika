package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ShowAutoStyles
 *
 * Full name:        System`ShowAutoStyles
 *
 * Usage:            ShowAutoStyles is an option for Cell that specifies whether styles that are specified to be automatically used for various syntactic and other constructs should be shown.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowAutoStyles
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowAutoStyles.html
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
fun showAutoStyles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowAutoStyles", arguments.toMutableList(), options)
}
