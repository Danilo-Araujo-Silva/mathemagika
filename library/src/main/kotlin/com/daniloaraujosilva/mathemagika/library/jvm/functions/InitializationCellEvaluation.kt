package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InitializationCellEvaluation
 *
 * Full name:        System`InitializationCellEvaluation
 *
 * Usage:            InitializationCellEvaluation is an option for notebooks that specifies whether initialization cells in a notebook are automatically evaluated when the notebook is opened.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InitializationCellEvaluation
 * Documentation:    web: http://reference.wolfram.com/language/ref/InitializationCellEvaluation.html
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
fun initializationCellEvaluation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InitializationCellEvaluation", arguments.toMutableList(), options)
}
