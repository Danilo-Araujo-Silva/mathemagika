package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CoordinateTransform
 * 
 * Full name:        System`CoordinateTransform
 * 
 *                   CoordinateTransform[t, pt] performs the coordinate transformation t on the point pt.
 *                   CoordinateTransform[t, {pt , pt , …}] transforms several points.
 * Usage:                                      1    2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CoordinateTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinateTransform.html
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
fun coordinateTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinateTransform", arguments.toMutableList(), options)
}
