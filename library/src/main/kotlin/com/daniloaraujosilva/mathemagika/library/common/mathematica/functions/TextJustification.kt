package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TextJustification
 *
 * Full name:        System`TextJustification
 *
 * Usage:            TextJustification is an option for Cell and Inset which specifies how much lines of text can be stretched in order to make them be the same length.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TextJustification
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextJustification.html
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
fun textJustification(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextJustification", arguments.toMutableList(), options)
}
