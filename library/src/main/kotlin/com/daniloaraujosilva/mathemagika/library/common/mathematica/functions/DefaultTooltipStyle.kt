package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultTooltipStyle
 *
 * Full name:        System`DefaultTooltipStyle
 *
 * Usage:            DefaultTooltipStyle is a low-level option for tooltips that specifies the default style to use in displaying their elements.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultTooltipStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultTooltipStyle.html
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
fun defaultTooltipStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultTooltipStyle", arguments.toMutableList(), options)
}
