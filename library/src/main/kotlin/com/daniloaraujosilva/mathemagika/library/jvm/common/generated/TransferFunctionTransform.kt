package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TransferFunctionTransform
 * 
 * Full name:        System`TransferFunctionTransform
 * 
 * Usage:            TransferFunctionTransform[f, tf] transforms the TransferFunctionModel object tf using the transformation function f.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TransferFunctionTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransferFunctionTransform.html
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
fun transferFunctionTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransferFunctionTransform", arguments.toMutableList(), options)
}
