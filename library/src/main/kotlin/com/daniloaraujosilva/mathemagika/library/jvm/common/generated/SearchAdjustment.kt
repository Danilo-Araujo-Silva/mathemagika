package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SearchAdjustment
 * 
 * Full name:        System`SearchAdjustment
 * 
 *                   SearchAdjustment[query, w] represents a component of a search query that is to be treated as having weight w.
 * Usage:            SearchAdjustment[query, …, opts] represents a component of a search query with certain options.
 * 
 * Options:          MaxWordGap -> 0
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SearchAdjustment
 * Documentation:    web: http://reference.wolfram.com/language/ref/SearchAdjustment.html
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
fun searchAdjustment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SearchAdjustment", arguments.toMutableList(), options)
}
