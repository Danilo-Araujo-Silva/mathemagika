package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BlackmanWindow
 * 
 * Full name:        System`BlackmanWindow
 * 
 * Usage:            BlackmanWindow[x] represents a Blackman window function of x.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/BlackmanWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlackmanWindow.html
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
fun blackmanWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlackmanWindow", arguments.toMutableList(), options)
}
