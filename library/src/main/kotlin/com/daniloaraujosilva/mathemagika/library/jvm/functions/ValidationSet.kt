package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ValidationSet
 *
 * Full name:        System`ValidationSet
 *
 * Usage:            ValidationSet is an option for Predict, Classify, NetTrain, and related functions that specifies the validation set to be used during the training phase.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ValidationSet
 * Documentation:    web: http://reference.wolfram.com/language/ref/ValidationSet.html
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
fun validationSet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ValidationSet", arguments.toMutableList(), options)
}
