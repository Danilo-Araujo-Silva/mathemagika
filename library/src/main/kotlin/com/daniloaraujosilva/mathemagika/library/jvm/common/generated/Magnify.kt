package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Magnify
 * 
 * Full name:        System`Magnify
 * 
 *                   Magnify[expr, r] represents an object to be displayed with magnification r. 
 * Usage:            Magnify[expr] displays with expr magnified by a fixed factor.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Magnify
 * Documentation:    web: http://reference.wolfram.com/language/ref/Magnify.html
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
fun magnify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Magnify", arguments.toMutableList(), options)
}
