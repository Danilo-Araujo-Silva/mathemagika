package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ColorSetter
 *
 * Full name:        System`ColorSetter
 *
 *                   ColorSetter[color] represents a color setter which displays as a swatch of the specified color and when clicked brings up a system color picker dialog.
 *                   ColorSetter[Dynamic[color]] uses the dynamically updated current value of color, with the value of color being reset if the color is modified.
 * Usage:            ColorSetter[] gives a color setter with initial color gray.
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> ColorSetter
 *                   Enabled -> Automatic
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorSetter
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorSetter.html
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
fun colorSetter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorSetter", arguments.toMutableList(), options)
}
