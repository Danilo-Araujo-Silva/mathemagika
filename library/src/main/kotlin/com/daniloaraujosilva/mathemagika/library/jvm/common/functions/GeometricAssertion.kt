package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeometricAssertion
 *
 * Full name:        System`GeometricAssertion
 *
 *                   GeometricAssertion[obj, prop] represents the assertion that the geometric object obj satisfies prop.
 *                   GeometricAssertion[{obj , obj , …}, prop] represents the assertion that the obj  satisfy prop.
 *                                          1     2                                                 i
 *                   GeometricAssertion[objs, prop , prop , …] represents the assertion that objs satisfies each of the prop .
 * Usage:                                         1      2                                                                  i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeometricAssertion
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeometricAssertion.html
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
fun geometricAssertion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeometricAssertion", arguments.toMutableList(), options)
}
