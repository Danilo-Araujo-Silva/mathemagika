package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ReflectionTransform
 * 
 * Full name:        System`ReflectionTransform
 * 
 *                   ReflectionTransform[v] gives a TransformationFunction that represents a reflection in a mirror through the origin, normal to the vector v.
 * Usage:            ReflectionTransform[v, p] gives a reflection in a mirror through the point p, normal to the vector v.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ReflectionTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReflectionTransform.html
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
fun reflectionTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReflectionTransform", arguments.toMutableList(), options)
}
