package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GainMargins
 * 
 * Full name:        System`GainMargins
 * 
 * Usage:            GainMargins[lsys] gives the gain margins of the linear time-invariant system lsys.
 * 
 *                   FeedbackType -> Negative
 *                   Method -> Automatic
 *                   SamplingPeriod -> None
 *                   Tolerance -> Automatic
 * Options:          VerifySolutions -> True
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GainMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/GainMargins.html
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
fun gainMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GainMargins", arguments.toMutableList(), options)
}
