package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GroupGenerators
 * 
 * Full name:        System`GroupGenerators
 * 
 * Usage:            GroupGenerators[group] returns a list of generators of group. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GroupGenerators
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupGenerators.html
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
fun groupGenerators(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupGenerators", arguments.toMutableList(), options)
}
