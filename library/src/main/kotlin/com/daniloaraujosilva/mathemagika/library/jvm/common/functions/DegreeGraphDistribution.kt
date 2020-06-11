package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DegreeGraphDistribution
 *
 * Full name:        System`DegreeGraphDistribution
 *
 * Usage:            DegreeGraphDistribution[dlist] represents a degree graph distribution with vertex degree dlist.
 *
 *                   DirectedEdges -> Automatic
 * Options:          SelfLoops -> Automatic
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DegreeGraphDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/DegreeGraphDistribution.html
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
fun degreeGraphDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DegreeGraphDistribution", arguments.toMutableList(), options)
}
