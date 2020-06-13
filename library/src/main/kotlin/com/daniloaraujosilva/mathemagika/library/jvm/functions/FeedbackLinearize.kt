package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FeedbackLinearize
 *
 * Full name:        System`FeedbackLinearize
 *
 *                   FeedbackLinearize[asys] input-output linearizes the AffineStateSpaceModel asys by state transformation and feedback.
 *                   FeedbackLinearize[asys, {z, v}] specifies the new states z and the new control inputs v.
 * Usage:            FeedbackLinearize[asys, {z, v}, "prop"] computes the property "prop".
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FeedbackLinearize
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeedbackLinearize.html
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
fun feedbackLinearize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeedbackLinearize", arguments.toMutableList(), options)
}
