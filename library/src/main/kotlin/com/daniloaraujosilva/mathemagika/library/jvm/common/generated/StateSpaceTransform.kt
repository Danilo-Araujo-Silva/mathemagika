package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StateSpaceTransform
 * 
 * Full name:        System`StateSpaceTransform
 * 
 *                   StateSpaceTransform[sys, {p, q}] transforms the state-space model sys using the matrices p and q. 
 *                   StateSpaceTransform[sys, {{x   p [z], …}, {z   q [x], …}}] transforms using the variable transformations {x   p [z], …} and {z   q [x], …}.
 * Usage:                                        1    1           1    1                                                          1    1              1    1
 * 
 * Options:          DescriptorStateSpace -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StateSpaceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/StateSpaceTransform.html
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
fun stateSpaceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StateSpaceTransform", arguments.toMutableList(), options)
}
