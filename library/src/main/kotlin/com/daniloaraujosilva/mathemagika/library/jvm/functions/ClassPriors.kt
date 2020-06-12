package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ClassPriors
 *
 * Full name:        System`ClassPriors
 *
 * Usage:            ClassPriors is an option for Classify and related functions that specifies explicit prior probabilities to assume for output classes, independent of anything deduced from the training set.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ClassPriors
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClassPriors.html
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
fun classPriors(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClassPriors", arguments.toMutableList(), options)
}
