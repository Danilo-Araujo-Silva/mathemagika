package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Framed
 *
 * Full name:        System`Framed
 *
 * Usage:            Framed[expr] displays a framed version of expr.
 *
 *                   Alignment -> Automatic
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> {}
 *                   DefaultFrameStyle -> {}
 *                   FrameMargins -> Automatic
 *                   FrameStyle -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   RoundingRadius -> 0
 * Options:          StripOnInput -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Framed
 * Documentation:    web: http://reference.wolfram.com/language/ref/Framed.html
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
fun framed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Framed", arguments.toMutableList(), options)
}
