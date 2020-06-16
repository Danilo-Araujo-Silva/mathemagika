package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RegionBoundaryStyle
 *
 * Full name:        System`RegionBoundaryStyle
 *
 * Usage:            RegionBoundaryStyle is an option for plotting functions that specifies the boundary style for the region over which the plot is being drawn.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionBoundaryStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionBoundaryStyle.html
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
fun regionBoundaryStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionBoundaryStyle", arguments.toMutableList(), options)
}
