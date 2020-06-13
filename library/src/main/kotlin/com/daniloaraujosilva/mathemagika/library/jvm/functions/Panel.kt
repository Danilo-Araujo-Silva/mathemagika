package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Panel
 *
 * Full name:        System`Panel
 *
 *                   Panel[expr] displays as a panel containing expr.
 *                   Panel[expr, title] gives the panel the specified title.
 *                   Panel[expr, title, pos] places title at a position specified by pos.
 *                   Panel[expr, {title , title , …}, {pos , …}] places title  at position pos .
 *                                     1       2          1                  i                i
 * Usage:            Panel[] displays an empty panel.
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> Panel
 *                   DefaultLabelStyle -> PanelLabel
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   RotateLabel -> False
 *                   Spacings -> Automatic
 * Options:          StripOnInput -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Panel
 * Documentation:    web: http://reference.wolfram.com/language/ref/Panel.html
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
fun panel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Panel", arguments.toMutableList(), options)
}
