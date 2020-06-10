package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             JacobiCN
 * 
 * Full name:        System`JacobiCN
 * 
 * Usage:            JacobiCN[u, m] gives the Jacobi elliptic function cn(u | m).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/JacobiCN
 * Documentation:    web: http://reference.wolfram.com/language/ref/JacobiCN.html
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
fun jacobiCN(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JacobiCN", arguments.toMutableList(), options)
}
