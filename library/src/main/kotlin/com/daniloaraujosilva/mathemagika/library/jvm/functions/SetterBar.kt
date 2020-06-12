package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetterBar
 *
 * Full name:        System`SetterBar
 *
 *                   SetterBar[x, {val , val , …}] represents a setter bar with setting x and with setter buttons for values val .
 *                                    1     2                                                                                   i
 *                   SetterBar[Dynamic[x], {val , val , …}] takes the setting to be the dynamically updated current value of x, with the value of x being reset every time a setter button is clicked.
 *                                             1     2
 *                   SetterBar[x, {val   lbl , val   lbl , …}] represents a setter bar in which the setter button giving value val  has label lbl .
 * Usage:                             1      1     2      2                                                                         i              i
 *
 *                   Appearance -> Automatic
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> SetterBar
 * Options:          Enabled -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SetterBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetterBar.html
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
fun setterBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetterBar", arguments.toMutableList(), options)
}
