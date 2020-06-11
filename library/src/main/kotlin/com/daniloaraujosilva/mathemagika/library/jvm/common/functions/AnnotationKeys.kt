package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AnnotationKeys
 *
 * Full name:        System`AnnotationKeys
 *
 *                   AnnotationKeys[obj] lists all annotation keys available for the object obj.
 * Usage:            AnnotationKeys[{obj, itemspec}] lists all annotation keys available for the items specified by itemspec in obj.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnnotationKeys
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnnotationKeys.html
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
fun annotationKeys(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnnotationKeys", arguments.toMutableList(), options)
}
