package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Pane
 *
 * Full name:        System`Pane
 *
 *                   Pane[expr] displays as a pane containing expr.
 *                   Pane[expr, w] makes the pane be w printer's points wide, linewrapping the contents if necessary.
 * Usage:            Pane[expr, {w, h}] makes the pane be w points wide and h points high, shrinking the contents if necessary.
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AppearanceElements -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> Pane
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   ImageSizeAction -> Automatic
 *                   Scrollbars -> False
 *                   ScrollPosition -> {0, 0}
 * Options:          StripOnInput -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Pane
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pane.html
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
fun pane(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pane", arguments.toMutableList(), options)
}
