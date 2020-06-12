package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindShortestTour
 *
 * Full name:        System`FindShortestTour
 *
 *                   FindShortestTour[{v , v , …}] attempts to find an ordering of the v  that minimizes the total distance on a tour that visits all the v  once.
 *                                      1   2                                           i                                                                  i
 *                   FindShortestTour[graph] attempts to find an ordering of the vertices in graph that minimizes the total length when visiting each vertex once.
 *                   FindShortestTour[{v , v , …}, j, k] finds an ordering of the v  that minimizes the total distance on a path from v  to v .
 *                                      1   2                                      i                                                   j     k
 *                   FindShortestTour[graph, s, t] finds an ordering of the vertices that minimizes the total length on a path from s to t.
 * Usage:            FindShortestTour[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 *                   DirectedEdges -> False
 *                   DistanceFunction -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindShortestTour
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindShortestTour.html
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
fun findShortestTour(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindShortestTour", arguments.toMutableList(), options)
}
