package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CancelButton
 *
 * Full name:        System`CancelButton
 *
 *                   CancelButton[] represents a Cancel button in a dialog that closes the dialog window when clicked.
 *                   CancelButton[action] represents a button labeled Cancel that evaluates action when clicked.
 * Usage:            CancelButton[label, action] uses label as the label for the button.
 *
 *                   Active -> True
 *                   Alignment -> Automatic
 *                   Appearance -> CancelButton
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
 *                   local: paclet:ref/CancelButton
 * Documentation:    web: http://reference.wolfram.com/language/ref/CancelButton.html
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
fun cancelButton(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CancelButton", arguments.toMutableList(), options)
}
