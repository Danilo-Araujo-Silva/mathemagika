package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ColorBalance
 *
 * Full name:        System`ColorBalance
 *
 *                   ColorBalance[image] adjusts the colors in image to achieve a balance that simulates the effect of neutral lighting.
 *                   ColorBalance[image, ref] adjusts colors in image so that the reference color specified by ref is mapped to white.
 * Usage:            ColorBalance[image, ref  target] maps the reference color ref to target.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorBalance
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorBalance.html
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
fun colorBalance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorBalance", arguments.toMutableList(), options)
}
