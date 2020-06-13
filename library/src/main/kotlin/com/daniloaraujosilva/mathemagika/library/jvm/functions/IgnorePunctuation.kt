package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IgnorePunctuation
 *
 * Full name:        System`IgnorePunctuation
 *
 * Usage:            IgnorePunctuation is an option for AlphabeticSort and related functions that specifies whether to consider punctuation in determining sorting order.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IgnorePunctuation
 * Documentation:    web: http://reference.wolfram.com/language/ref/IgnorePunctuation.html
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
fun ignorePunctuation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IgnorePunctuation", arguments.toMutableList(), options)
}
