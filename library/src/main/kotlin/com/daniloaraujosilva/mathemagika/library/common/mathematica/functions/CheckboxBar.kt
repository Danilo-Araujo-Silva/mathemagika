package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CheckboxBar
 *
 * Full name:        System`CheckboxBar
 *
 *                   CheckboxBar[x, {val , val , …}] represents a checkbox bar with setting x and with checkboxes for values val  to include in the list x.
 *                                      1     2                                                                                 i
 *                   CheckboxBar[Dynamic[x], {val , val , …}] takes the setting to be the dynamically updated current value of x, with the values in the list x being reset every time a checkbox is clicked.
 *                                               1     2
 *                   CheckboxBar[x, {val   lbl , val   lbl , …}] represents a checkbox bar in which the checkbox associated with value val  has label lbl .
 * Usage:                               1      1     2      2                                                                               i              i
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContinuousAction -> False
 *                   DefaultBaseStyle -> CheckboxBar
 *                   DefaultLabelStyle -> CheckboxBarLabel
 *                   Enabled -> Automatic
 *                   ImageMargins -> 0
 *                   LabelStyle -> {}
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CheckboxBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/CheckboxBar.html
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
fun checkboxBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CheckboxBar", arguments.toMutableList(), options)
}
