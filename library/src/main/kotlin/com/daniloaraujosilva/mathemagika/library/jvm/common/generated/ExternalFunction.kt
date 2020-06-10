package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExternalFunction
 * 
 * Full name:        System`ExternalFunction
 * 
 *                   ExternalFunction[sys, "f"] represents an external function named "f" defined in the external evaluator sys.
 *                   ExternalFunction[session, "f"] represents an external function "f" in the specified external session.
 * Usage:            ExternalFunction[sys, "code"] represents an external function defined by the code fragment "code".
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ExternalFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalFunction.html
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
fun externalFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalFunction", arguments.toMutableList(), options)
}
