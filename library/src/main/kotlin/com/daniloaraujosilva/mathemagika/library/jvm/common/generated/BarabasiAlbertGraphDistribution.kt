package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BarabasiAlbertGraphDistribution
 * 
 * Full name:        System`BarabasiAlbertGraphDistribution
 * 
 * Usage:            BarabasiAlbertGraphDistribution[n, k] represents a Barabasi–Albert graph distribution for n-vertex graphs where a new vertex with k edges is added at each step.
 * 
 * Options:          None
 * 
 *                   NHoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/BarabasiAlbertGraphDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BarabasiAlbertGraphDistribution.html
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
fun barabasiAlbertGraphDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BarabasiAlbertGraphDistribution", arguments.toMutableList(), options)
}
