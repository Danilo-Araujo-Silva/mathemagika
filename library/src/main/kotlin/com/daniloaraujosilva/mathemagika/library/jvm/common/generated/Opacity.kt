package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Opacity
 * 
 * Full name:        System`Opacity
 * 
 *                   Opacity[a] is a graphics directive that specifies that graphical objects that follow are to be displayed, if possible, with opacity a. 
 * Usage:            Opacity[a, color] uses the specified color with opacity a.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Opacity
 * Documentation:    web: http://reference.wolfram.com/language/ref/Opacity.html
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
fun opacity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Opacity", arguments.toMutableList(), options)
}
