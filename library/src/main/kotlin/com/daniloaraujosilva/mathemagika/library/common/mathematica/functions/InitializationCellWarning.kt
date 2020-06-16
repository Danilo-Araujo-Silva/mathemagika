package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InitializationCellWarning
 *
 * Full name:        System`InitializationCellWarning
 *
 * Usage:            InitializationCellWarning is an option for notebooks that specifies whether a warning should be given when a notebook containing initialization cells is opened.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InitializationCellWarning
 * Documentation:    web: http://reference.wolfram.com/language/ref/InitializationCellWarning.html
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
fun initializationCellWarning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InitializationCellWarning", arguments.toMutableList(), options)
}
