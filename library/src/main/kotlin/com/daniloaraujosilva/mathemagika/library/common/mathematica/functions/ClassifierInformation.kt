package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ClassifierInformation
 *
 * Full name:        System`ClassifierInformation
 *
 *                   ClassifierInformation[classifier] generates a report giving information on the classifier function classifier.
 * Usage:            ClassifierInformation[classifier, prop] gives information for classifier associated with property prop.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ClassifierInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClassifierInformation.html
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
fun classifierInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClassifierInformation", arguments.toMutableList(), options)
}
