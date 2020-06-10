package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TransformedField
 * 
 * Full name:        System`TransformedField
 * 
 *                   TransformedField[t, f, {x , x , …, x }  {y , y , …, y }] uses the coordinate transformation t to transform the scalar, vector, or tensor field f from coordinates x  to y .
 * Usage:                                     1   2      n      1   2      n                                                                                                             i     i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TransformedField
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransformedField.html
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
fun transformedField(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransformedField", arguments.toMutableList(), options)
}
