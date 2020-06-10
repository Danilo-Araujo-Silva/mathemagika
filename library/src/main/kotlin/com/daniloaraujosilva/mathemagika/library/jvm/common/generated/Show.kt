package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Show
 * 
 * Full name:        System`Show
 * 
 *                   Show[graphics, options] shows graphics with the specified options added. 
 *                   Show[g , g , …] shows several graphics combined. 
 * Usage:                  1   2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Show
 * Documentation:    web: http://reference.wolfram.com/language/ref/Show.html
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
fun show(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Show", arguments.toMutableList(), options)
}
