package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PreprocessingRules
 *
 * Full name:        System`PreprocessingRules
 *
 * Usage:            PreprocessingRules is an option that specifies how the input should be preprocessed.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PreprocessingRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreprocessingRules.html
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
fun preprocessingRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreprocessingRules", arguments.toMutableList(), options)
}
