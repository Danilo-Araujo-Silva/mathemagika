package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DotLayer
 * 
 * Full name:        System`DotLayer
 * 
 * Usage:            DotLayer[] represents a net layer that takes the dot product of two or more arrays.
 * 
 *                   Inputs -> Automatic
 * Options:          Output -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DotLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/DotLayer.html
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
fun dotLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DotLayer", arguments.toMutableList(), options)
}
