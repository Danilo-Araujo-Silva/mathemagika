package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Button
 *
 * Full name:        System`Button
 *
 * Usage:            Button[label, action] represents a button that is labeled with label, and evaluates action whenever it is clicked.
 *
 *                   Active -> True
 *                   Alignment -> Automatic
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> GenericButton
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> Button
 *                   DefaultTooltipStyle -> TooltipLabel
 *                   Enabled -> Automatic
 *                   Evaluator -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Full
 *                   Method -> Preemptive
 *                   Tooltip -> None
 *                   TooltipDelay -> 0.
 * Options:          TooltipStyle -> {}
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Button
 * Documentation:    web: http://reference.wolfram.com/language/ref/Button.html
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
fun button(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Button", arguments.toMutableList(), options)
}
