package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AnnotationRules
 *
 * Full name:        System`AnnotationRules
 *
 * Usage:            AnnotationRules is an option that allows specification of annotations to objects and items in objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnnotationRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnnotationRules.html
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
fun annotationRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnnotationRules", arguments.toMutableList(), options)
}
