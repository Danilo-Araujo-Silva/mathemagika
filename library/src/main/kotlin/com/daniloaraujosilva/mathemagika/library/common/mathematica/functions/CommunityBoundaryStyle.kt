package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CommunityBoundaryStyle
 *
 * Full name:        System`CommunityBoundaryStyle
 *
 * Usage:            CommunityBoundaryStyle is an option to CommunityGraphPlot that specifies how to style community boundaries.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CommunityBoundaryStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommunityBoundaryStyle.html
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
fun communityBoundaryStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommunityBoundaryStyle", arguments.toMutableList(), options)
}
