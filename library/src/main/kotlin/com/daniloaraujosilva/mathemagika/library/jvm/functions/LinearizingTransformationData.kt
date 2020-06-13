package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinearizingTransformationData
 *
 * Full name:        System`LinearizingTransformationData
 *
 * Usage:            LinearizingTransformationData[…] represents data of an AffineStateSpaceModel linearized by functions such as FeedbackLinearize and StateTransformationLinearize using transformation of variables.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinearizingTransformationData
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearizingTransformationData.html
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
fun linearizingTransformationData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearizingTransformationData", arguments.toMutableList(), options)
}
