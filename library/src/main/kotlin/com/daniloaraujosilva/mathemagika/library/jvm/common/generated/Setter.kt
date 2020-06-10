package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Setter
 * 
 * Full name:        System`Setter
 * 
 *                   Setter[x, val] represents a setter button whose setting x is set to val when the button is clicked. The button is labeled with val, and appears pressed if the value of x is val, and unpressed otherwise.
 *                   Setter[Dynamic[x], val] takes the setting to be the dynamically updated current value of x, with the value of x being reset if the button is clicked.
 *                   Setter[x, val, label] labels the setter button with label.
 *                   Setter[x, {val , val , …}, label] represents a setter button that sets x to val  if multiclicked n times. 
 * Usage:                          1     2                                                          n
 * 
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> Setter
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 * Options:          ImageSize -> All
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Setter
 * Documentation:    web: http://reference.wolfram.com/language/ref/Setter.html
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
fun setter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Setter", arguments.toMutableList(), options)
}
