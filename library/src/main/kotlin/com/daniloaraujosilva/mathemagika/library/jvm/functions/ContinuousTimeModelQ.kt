package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContinuousTimeModelQ
 *
 * Full name:        System`ContinuousTimeModelQ
 *
 * Usage:            ContinuousTimeModelQ[lsys] gives True if lsys is a continuous-time systems model, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContinuousTimeModelQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuousTimeModelQ.html
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
fun continuousTimeModelQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuousTimeModelQ", arguments.toMutableList(), options)
}
