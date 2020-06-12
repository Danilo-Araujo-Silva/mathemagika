package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Tooltip
 *
 * Full name:        System`Tooltip
 *
 * Usage:            Tooltip[expr, label] displays label as a tooltip while the mouse pointer is in the area where expr is displayed.
 *
 *                   Background -> Automatic
 *                   BaseStyle -> Tooltip
 *                   DefaultBaseStyle -> {}
 *                   DefaultTooltipStyle -> TooltipLabel
 *                   StripOnInput -> False
 *                   TooltipDelay -> 0
 * Options:          TooltipStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Tooltip
 * Documentation:    web: http://reference.wolfram.com/language/ref/Tooltip.html
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
fun tooltip(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tooltip", arguments.toMutableList(), options)
}
