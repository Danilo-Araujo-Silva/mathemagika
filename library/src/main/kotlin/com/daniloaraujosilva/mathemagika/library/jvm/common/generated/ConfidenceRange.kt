package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ConfidenceRange
 * 
 * Full name:        System`ConfidenceRange
 * 
 * Usage:            ConfidenceRange is an option for SurvivalModelFit and other functions that specifies the range over which simultaneous confidence intervals and bands are computed.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ConfidenceRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConfidenceRange.html
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
fun confidenceRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConfidenceRange", arguments.toMutableList(), options)
}
