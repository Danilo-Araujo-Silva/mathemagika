package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PolyaAeppliDistribution
 * 
 * Full name:        System`PolyaAeppliDistribution
 * 
 * Usage:            PolyaAeppliDistribution[θ, p] represents a Pólya–Aeppli distribution with shape parameters θ and p. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PolyaAeppliDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyaAeppliDistribution.html
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
fun polyaAeppliDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyaAeppliDistribution", arguments.toMutableList(), options)
}
