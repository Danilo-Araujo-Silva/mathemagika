package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LogSeriesDistribution
 * 
 * Full name:        System`LogSeriesDistribution
 * 
 * Usage:            LogSeriesDistribution[θ] represents a logarithmic series distribution with parameter θ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LogSeriesDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogSeriesDistribution.html
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
fun logSeriesDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogSeriesDistribution", arguments.toMutableList(), options)
}
