package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Hyperlink
 *
 * Full name:        System`Hyperlink
 *
 *                   Hyperlink[uri] represents a hyperlink that jumps to the specified URI when clicked.
 * Usage:            Hyperlink[label, uri] represents a hyperlink to be displayed as label.
 *
 *                   Active -> True
 *                   ActiveStyle -> HyperlinkActive
 *                   Alignment -> Automatic
 *                   Appearance -> Palette
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> Hyperlink
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> Button
 *                   DefaultTooltipStyle -> TooltipLabel
 *                   Enabled -> Automatic
 *                   Evaluator -> None
 *                   FrameMargins -> Automatic
 *                   HyperlinkAction -> New
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
 *                   local: paclet:ref/Hyperlink
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hyperlink.html
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
fun hyperlink(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hyperlink", arguments.toMutableList(), options)
}
