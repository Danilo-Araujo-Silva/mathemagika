package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LanczosWindow
 * 
 * Full name:        System`LanczosWindow
 * 
 * Usage:            LanczosWindow[x] represents a Lanczos window function of x.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/LanczosWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LanczosWindow.html
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
fun lanczosWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LanczosWindow", arguments.toMutableList(), options)
}
