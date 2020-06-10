package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BooleanFunction
 * 
 * Full name:        System`BooleanFunction
 * 
 *                                                          th
 *                   BooleanFunction[k, n] represents the k   Boolean function in n variables.
 *                   BooleanFunction[values] represents the Boolean function corresponding to the specified vector of truth values.
 *                   BooleanFunction[{{i  , i  , …}  o , …}] represents the Boolean function defined by the specified mapping from inputs to outputs.
 *                                      11   12        1
 *                   BooleanFunction[spec, {a , a , …}] gives the Boolean expression in variables a  corresponding to the Boolean function specified by spec.
 *                                           1   2                                                 i
 *                   BooleanFunction[spec, {a , a , …}, form] gives the Boolean expression in the form specified by form.
 * Usage:                                    1   2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BooleanFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanFunction.html
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
fun booleanFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanFunction", arguments.toMutableList(), options)
}
