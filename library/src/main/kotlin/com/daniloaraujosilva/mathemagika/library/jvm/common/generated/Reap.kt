package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Reap
 * 
 * Full name:        System`Reap
 * 
 *                   Reap[expr] gives the value of expr together with all expressions to which Sow has been applied during its evaluation. Expressions sown using Sow[e] or Sow[e, tag ] with different tags are given in different lists. 
 *                                                                                                                                                                                    i
 *                   Reap[expr, patt] reaps only expressions sown with tags that match patt. 
 *                   Reap[expr, {patt , patt , …}] puts expressions associated with each of the patt  in a separate list. 
 *                                   1      2                                                       i
 *                   Reap[expr, patt, f] returns {expr, {f[tag , {e  , e  , …}], …}}. 
 * Usage:                                                     1    11   12
 * 
 * Options:          None
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Reap
 * Documentation:    web: http://reference.wolfram.com/language/ref/Reap.html
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
fun reap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Reap", arguments.toMutableList(), options)
}
