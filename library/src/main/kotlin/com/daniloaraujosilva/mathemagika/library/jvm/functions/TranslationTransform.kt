package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TranslationTransform
 *
 * Full name:        System`TranslationTransform
 *
 * Usage:            TranslationTransform[v] gives a TransformationFunction that represents translation of points by a vector v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TranslationTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/TranslationTransform.html
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
fun translationTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TranslationTransform", arguments.toMutableList(), options)
}
