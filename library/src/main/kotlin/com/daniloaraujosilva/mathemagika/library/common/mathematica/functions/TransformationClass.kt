package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TransformationClass
 *
 * Full name:        System`TransformationClass
 *
 * Usage:            TransformationClass is an option that specifies the class of geometric transformations to be used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TransformationClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransformationClass.html
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
fun transformationClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransformationClass", arguments.toMutableList(), options)
}
