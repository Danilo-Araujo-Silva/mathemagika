package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CommunityLabels
 *
 * Full name:        System`CommunityLabels
 *
 * Usage:            CommunityLabels is an option to CommunityGraphPlot that controls what labels and placement to use for communities.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CommunityLabels
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommunityLabels.html
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
fun communityLabels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommunityLabels", arguments.toMutableList(), options)
}
