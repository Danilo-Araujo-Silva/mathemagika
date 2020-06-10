package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SpatialGraphDistribution
 * 
 * Full name:        System`SpatialGraphDistribution
 * 
 *                   SpatialGraphDistribution[n, r] represents a spatial distribution for graphs with n vertices uniformly distributed over the unit square and edges between vertices that are at distance at most r.
 *                   SpatialGraphDistribution[n, r, d] represents a spatial distribution for graphs with vertices uniformly distributed over the d-dimensional unit square.
 * Usage:            SpatialGraphDistribution[n, r, dist] represents a spatial distribution for graphs with vertices distributed according to the probability distribution dist.
 * 
 * Options:          DistanceFunction -> Automatic
 * 
 *                   NHoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SpatialGraphDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpatialGraphDistribution.html
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
fun spatialGraphDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpatialGraphDistribution", arguments.toMutableList(), options)
}
