package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CommunityRegionStyle
 *
 * Full name:        System`CommunityRegionStyle
 *
 * Usage:            CommunityRegionStyle is an option to CommunityGraphPlot that specifies how to style community regions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CommunityRegionStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommunityRegionStyle.html
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
fun communityRegionStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommunityRegionStyle", arguments.toMutableList(), options)
}
