package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultButton
 *
 * Full name:        System`DefaultButton
 *
 *                   DefaultButton[] represents an OK button that closes a dialog, and is the default when Enter is pressed in the dialog.
 *                   DefaultButton[action] represents a button that is labeled OK, and whose action is to evaluate action.
 * Usage:            DefaultButton[label, action] uses label as the label for the button.
 *
 *                   Active -> True
 *                   Alignment -> Automatic
 *                   Appearance -> DefaultButton
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
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DefaultButton
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultButton.html
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
fun defaultButton(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultButton", arguments.toMutableList(), options)
}
