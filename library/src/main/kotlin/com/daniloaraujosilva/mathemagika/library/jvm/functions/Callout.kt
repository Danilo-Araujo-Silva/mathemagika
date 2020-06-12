package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Callout
 *
 * Full name:        System`Callout
 *
 *                   Callout[data, expr] displays expr in a plot as a callout pointing to data.
 *                   Callout[data, expr, pos] displays a callout with expr at a position specified by pos.
 * Usage:            Callout[data, expr, pos, apos] displays a callout anchored at a position specified by apos.
 *
 *                   Appearance -> Automatic
 *                   Background -> Automatic
 *                   CalloutMarker -> None
 *                   CalloutStyle -> Automatic
 *                   Frame -> None
 *                   FrameMargins -> Automatic
 *                   LabelStyle -> {}
 *                   LabelVisibility -> Automatic
 *                   LeaderSize -> Automatic
 * Options:          RoundingRadius -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Callout
 * Documentation:    web: http://reference.wolfram.com/language/ref/Callout.html
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
fun callout(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Callout", arguments.toMutableList(), options)
}
