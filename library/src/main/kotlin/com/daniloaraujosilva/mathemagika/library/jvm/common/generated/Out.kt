package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Out
 * 
 * Full name:        System`Out
 * 
 *                                                                                                      th
 *                   %n or Out[n] is a global object that is assigned to be the value produced on the n   output line. 
 *                   % gives the last result generated. 
 *                                                                               th
 * Usage:            %% gives the result before last. %%…% (k times) gives the k   previous result. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NHoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Out
 * Documentation:    web: http://reference.wolfram.com/language/ref/Out.html
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
fun `out`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Out", arguments.toMutableList(), options)
}
