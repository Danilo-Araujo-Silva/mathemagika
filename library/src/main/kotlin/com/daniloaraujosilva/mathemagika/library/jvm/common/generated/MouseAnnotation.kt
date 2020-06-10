package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MouseAnnotation
 * 
 * Full name:        System`MouseAnnotation
 * 
 * Usage:            MouseAnnotation[] gives any mouse annotation associated with the expression at the current mouse position. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MouseAnnotation
 * Documentation:    web: http://reference.wolfram.com/language/ref/MouseAnnotation.html
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
fun mouseAnnotation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MouseAnnotation", arguments.toMutableList(), options)
}
