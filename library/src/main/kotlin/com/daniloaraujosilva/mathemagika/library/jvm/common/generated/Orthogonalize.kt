package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Orthogonalize
 * 
 * Full name:        System`Orthogonalize
 * 
 *                   Orthogonalize[{v , v , …}] gives an orthonormal basis found by orthogonalizing the vectors v .
 *                                   1   2                                                                       i
 *                   Orthogonalize[{e , e , …}, f] gives an orthonormal basis found by orthogonalizing the elements e  with respect to the inner product function f.
 * Usage:                            1   2                                                                           i
 * 
 *                   Method -> Automatic
 * Options:          Tolerance -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Orthogonalize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Orthogonalize.html
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
fun orthogonalize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Orthogonalize", arguments.toMutableList(), options)
}
