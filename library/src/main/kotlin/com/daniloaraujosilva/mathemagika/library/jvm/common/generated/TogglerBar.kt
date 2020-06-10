package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TogglerBar
 * 
 * Full name:        System`TogglerBar
 * 
 *                   TogglerBar[x, {val , val , …}] represents a toggler bar with setting x and with toggler buttons for values val  to include in the list x.
 *                                     1     2                                                                                     i
 *                   TogglerBar[Dynamic[x], {val , val , …}] takes the setting to be the dynamically updated current value of x, with the values in the list x being reset every time a toggler button is clicked.
 *                                              1     2
 *                   TogglerBar[x, {val   lbl , val   lbl , …}] represents a toggler bar in which the toggler button associated with value val  has label lbl .
 * Usage:                              1      1     2      2                                                                                    i              i
 * 
 *                   Appearance -> Automatic
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> TogglerBar
 * Options:          Enabled -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TogglerBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/TogglerBar.html
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
fun togglerBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TogglerBar", arguments.toMutableList(), options)
}
