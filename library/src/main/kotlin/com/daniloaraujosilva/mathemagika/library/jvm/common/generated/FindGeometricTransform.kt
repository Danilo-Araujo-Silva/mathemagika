package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindGeometricTransform
 * 
 * Full name:        System`FindGeometricTransform
 * 
 *                   FindGeometricTransform[pts , pts ] finds a geometric transformation that aligns positions specified by pts  with pts , returning the alignment error together with the transformation function.
 *                                             1     2                                                                         2         1
 *                   FindGeometricTransform[ref, {pts , pts , …}] finds geometric transformations that align each of the pts  with ref. 
 *                                                   1     2                                                                i
 *                   FindGeometricTransform[{pts , pts , …}] finds geometric transformations that align each of the pts  with pts .
 * Usage:                                       1     2                                                                i         1
 * 
 *                   Method -> Automatic
 * Options:          TransformationClass -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FindGeometricTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindGeometricTransform.html
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
fun findGeometricTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindGeometricTransform", arguments.toMutableList(), options)
}
