package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TooltipDelay
 *
 * Full name:        System`TooltipDelay
 *
 * Usage:            TooltipDelay is an option for objects such as Tooltip that specifies how long to delay after the mouse is over the object before displaying the tooltip.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TooltipDelay
 * Documentation:    web: http://reference.wolfram.com/language/ref/TooltipDelay.html
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
fun tooltipDelay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TooltipDelay", arguments.toMutableList(), options)
}
