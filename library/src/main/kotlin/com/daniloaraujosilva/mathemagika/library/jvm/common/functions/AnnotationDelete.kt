package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AnnotationDelete
 *
 * Full name:        System`AnnotationDelete
 *
 *                   AnnotationDelete[obj] deletes all annotations of the object obj.
 *                   AnnotationDelete[{obj, itemspec}] deletes all annotations of the items of obj specified by itemspec.
 * Usage:            AnnotationDelete[spec, key] deletes the annotation key specified by spec.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnnotationDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnnotationDelete.html
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
fun annotationDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnnotationDelete", arguments.toMutableList(), options)
}
