package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RadioButton
 *
 * Full name:        System`RadioButton
 *
 *                   RadioButton[x, val] represents a radio button whose setting x is set to val when the button is clicked.
 *                   RadioButton[x, val] is displayed as RadioButtonBox[0, {0}] when x is val, and as RadioButtonBox[1, {0}] otherwise.
 * Usage:            RadioButton[Dynamic[x], val] takes the setting to be the dynamically updated current value of x, with the value of x being reset if the button is clicked.
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> RadioButton
 *                   Enabled -> Automatic
 * Options:          ImageMargins -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RadioButton
 * Documentation:    web: http://reference.wolfram.com/language/ref/RadioButton.html
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
fun radioButton(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RadioButton", arguments.toMutableList(), options)
}
