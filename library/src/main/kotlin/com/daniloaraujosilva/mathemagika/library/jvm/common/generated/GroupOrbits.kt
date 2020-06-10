package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GroupOrbits
 * 
 * Full name:        System`GroupOrbits
 * 
 *                   GroupOrbits[group, {p , …}] returns the orbits of the points p  under the action of the elements of group.
 *                                        1                                        i
 *                   GroupOrbits[group, {p , …}, f] finds the orbits under the group action given by a function f.
 * Usage:                                 1
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GroupOrbits
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupOrbits.html
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
fun groupOrbits(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupOrbits", arguments.toMutableList(), options)
}
