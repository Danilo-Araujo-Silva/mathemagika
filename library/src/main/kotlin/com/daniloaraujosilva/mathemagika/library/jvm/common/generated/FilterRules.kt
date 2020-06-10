package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FilterRules
 * 
 * Full name:        System`FilterRules
 * 
 *                   FilterRules[rules, patt] filters the list rules by picking out only those rules whose left-hand sides match patt.
 *                   FilterRules[rules, {patt , patt , …}] picks out rules whose left-hand sides match any of the patt .
 * Usage:                                    1      2                                                                 i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FilterRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/FilterRules.html
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
fun filterRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FilterRules", arguments.toMutableList(), options)
}
