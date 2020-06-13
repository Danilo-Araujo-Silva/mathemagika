package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PasteButton
 *
 * Full name:        System`PasteButton
 *
 *                   PasteButton[expr] represents a button that pastes expr whenever it is pressed.
 * Usage:            PasteButton[label, expr] displays with label on the button.
 *
 *                   Active -> True
 *                   Alignment -> Automatic
 *                   Appearance -> Palette
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> Paste
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> Button
 *                   DefaultTooltipStyle -> TooltipLabel
 *                   Enabled -> Automatic
 *                   Evaluator -> None
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Full
 *                   Method -> Queued
 *                   Tooltip -> None
 *                   TooltipDelay -> 0.
 * Options:          TooltipStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PasteButton
 * Documentation:    web: http://reference.wolfram.com/language/ref/PasteButton.html
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
fun pasteButton(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PasteButton", arguments.toMutableList(), options)
}
