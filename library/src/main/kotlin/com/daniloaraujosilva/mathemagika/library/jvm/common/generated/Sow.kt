package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Sow
 * 
 * Full name:        System`Sow
 * 
 *                   Sow[e] specifies that e should be collected by the nearest enclosing Reap. 
 *                   Sow[e, tag] specifies that e should be collected by the nearest enclosing Reap whose pattern matches tag. 
 *                   Sow[e, {tag , tag , …}] specifies that e should be collected once for each pattern that matches a tag . 
 * Usage:                       1     2                                                                                   i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Sow
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sow.html
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
fun sow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sow", arguments.toMutableList(), options)
}
