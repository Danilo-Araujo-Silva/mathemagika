package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RadioButtonBar
 * 
 * Full name:        System`RadioButtonBar
 * 
 *                   RadioButtonBar[x, {val , val , …}] represents a radio button bar with setting x and with labeled radio buttons for values val .
 *                                         1     2                                                                                                i
 *                   RadioButtonBar[Dynamic[x], {val , val , …}] takes the setting to be the dynamically updated current value of x, with the value of x being reset every time a radio button is pressed.
 *                                                  1     2
 *                   RadioButtonBar[x, {val   lbl , val   lbl , …}] represents a radio button bar in which the radio button giving value val  is given label lbl .
 * Usage:                                  1      1     2      2                                                                              i                   i
 * 
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> RadioButtonBar
 *                   DefaultLabelStyle -> RadioButtonBarLabel
 *                   Enabled -> Automatic
 *                   ImageMargins -> 0
 *                   LabelStyle -> {}
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RadioButtonBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/RadioButtonBar.html
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
fun radioButtonBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RadioButtonBar", arguments.toMutableList(), options)
}
