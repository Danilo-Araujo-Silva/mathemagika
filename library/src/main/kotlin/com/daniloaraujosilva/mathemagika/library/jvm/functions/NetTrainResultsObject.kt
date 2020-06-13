package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NetTrainResultsObject
 *
 * Full name:        System`NetTrainResultsObject
 *
 * Usage:            NetTrainResultsObject[…] represents an object generated by NetTrain that contains the trained net and other information about the training process.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetTrainResultsObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetTrainResultsObject.html
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
fun netTrainResultsObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetTrainResultsObject", arguments.toMutableList(), options)
}