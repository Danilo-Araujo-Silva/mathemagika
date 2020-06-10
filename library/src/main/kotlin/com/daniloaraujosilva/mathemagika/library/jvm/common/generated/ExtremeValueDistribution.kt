package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExtremeValueDistribution
 * 
 * Full name:        System`ExtremeValueDistribution
 * 
 *                   ExtremeValueDistribution[α, β] represents an extreme value distribution with location parameter α and scale parameter β.
 * Usage:            ExtremeValueDistribution[] represents an extreme value distribution with location parameter 0 and scale parameter 1.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ExtremeValueDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtremeValueDistribution.html
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
fun extremeValueDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtremeValueDistribution", arguments.toMutableList(), options)
}
