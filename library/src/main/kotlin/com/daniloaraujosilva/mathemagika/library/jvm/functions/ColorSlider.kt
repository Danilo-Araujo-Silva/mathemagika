package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorSlider
 *
 * Full name:        System`ColorSlider
 *
 *                   ColorSlider[color] represents a color slider currently set to the color corresponding to color.
 *                   ColorSlider[Dynamic[color]] uses the dynamically updated current value of color, with the value of color being reset if the color is modified.
 * Usage:            ColorSlider[] represents a color slider with an initial gray color.
 *
 *                   Appearance -> Automatic
 *                   AppearanceElements -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> ColorSlider
 *                   Enabled -> Automatic
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorSlider
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorSlider.html
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
fun colorSlider(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorSlider", arguments.toMutableList(), options)
}
