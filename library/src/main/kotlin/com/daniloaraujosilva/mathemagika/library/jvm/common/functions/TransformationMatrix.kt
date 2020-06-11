package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransformationMatrix
 *
 * Full name:        System`TransformationMatrix
 *
 * Usage:            TransformationMatrix[tfun] gives the homogeneous matrix associated with a TransformationFunction object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransformationMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransformationMatrix.html
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
fun transformationMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransformationMatrix", arguments.toMutableList(), options)
}
