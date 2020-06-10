package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ArrayFilter
 * 
 * Full name:        System`ArrayFilter
 * 
 *                   ArrayFilter[f, array, r] applies f to all range-r blocks in the specified array.
 *                   ArrayFilter[f, array, {r , r , …}] applies f to blocks with ranges r , r , … in successive dimensions.
 *                                           1   2                                       1   2
 * Usage:            ArrayFilter[f, array, template] applies f over blocks specified by the position of 1s in the array template.
 * 
 * Options:          Padding -> Fixed
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ArrayFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayFilter.html
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
fun arrayFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayFilter", arguments.toMutableList(), options)
}
