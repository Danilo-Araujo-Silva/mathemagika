package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RecognitionThreshold
 *
 * Full name:        System`RecognitionThreshold
 *
 * Usage:            RecognitionThreshold is an option for ImageInstanceQ and related functions that specifies the minimum estimated probability at which recognition is considered acceptable.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RecognitionThreshold
 * Documentation:    web: http://reference.wolfram.com/language/ref/RecognitionThreshold.html
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
fun recognitionThreshold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RecognitionThreshold", arguments.toMutableList(), options)
}
