package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LiouvilleLambda
 * 
 * Full name:        System`LiouvilleLambda
 * 
 * Usage:            LiouvilleLambda[n] gives the Liouville function λ(n).
 * 
 * Options:          GaussianIntegers -> False
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LiouvilleLambda
 * Documentation:    web: http://reference.wolfram.com/language/ref/LiouvilleLambda.html
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
fun liouvilleLambda(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LiouvilleLambda", arguments.toMutableList(), options)
}
