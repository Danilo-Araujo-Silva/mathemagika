package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HannWindow
 * 
 * Full name:        System`HannWindow
 * 
 *                   HannWindow[x] represents a Hann window function of x.
 * Usage:            HannWindow[x, α] uses the parameter α.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/HannWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/HannWindow.html
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
fun hannWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HannWindow", arguments.toMutableList(), options)
}
