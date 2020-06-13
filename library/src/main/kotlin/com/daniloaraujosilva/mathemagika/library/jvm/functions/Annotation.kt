package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Annotation
 *
 * Full name:        System`Annotation
 *
 *                   Annotation[expr, data] represents an expression expr, with annotation data.
 *                   Annotation[expr, data, "type"] specifies the type of annotation being given.
 * Usage:            Annotation[items, key  value] associates key  value pairs with items in objects such as Graph, MeshRegion etc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Annotation
 * Documentation:    web: http://reference.wolfram.com/language/ref/Annotation.html
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
fun `annotation`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Annotation", arguments.toMutableList(), options)
}
