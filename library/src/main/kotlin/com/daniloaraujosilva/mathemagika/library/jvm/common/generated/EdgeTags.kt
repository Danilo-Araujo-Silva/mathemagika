package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EdgeTags
 * 
 * Full name:        System`EdgeTags
 * 
 *                   EdgeTags[g] gives the list of tags for all edges in the graph g.
 * Usage:            EdgeTags[g, {u, v}] gives the list of tags for edges between u and v.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/EdgeTags
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeTags.html
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
fun edgeTags(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeTags", arguments.toMutableList(), options)
}
