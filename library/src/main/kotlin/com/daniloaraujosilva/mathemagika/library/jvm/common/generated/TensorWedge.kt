package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TensorWedge
 * 
 * Full name:        System`TensorWedge
 * 
 *                   TensorWedge[tensor , tensor , …] represents the antisymmetrized tensor product of the tensor .
 * Usage:                              1        2                                                                i
 * 
 * Options:          None
 * 
 *                   Flat
 *                   OneIdentity
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TensorWedge
 * Documentation:    web: http://reference.wolfram.com/language/ref/TensorWedge.html
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
fun tensorWedge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TensorWedge", arguments.toMutableList(), options)
}
