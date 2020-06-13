package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InitializationCell
 *
 * Full name:        System`InitializationCell
 *
 * Usage:            InitializationCell is an option for Cell that specifies whether the cell should be tagged to be evaluated by the Wolfram Language kernel immediately before the first evaluation performed by the user after the notebook is opened.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InitializationCell
 * Documentation:    web: http://reference.wolfram.com/language/ref/InitializationCell.html
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
fun initializationCell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InitializationCell", arguments.toMutableList(), options)
}
