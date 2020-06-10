package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AsymptoticOutputTracker
 * 
 * Full name:        System`AsymptoticOutputTracker
 * 
 *                   AsymptoticOutputTracker[sys, {f , …}, {p , …}] gives the state feedback control law that causes the outputs of the affine system sys to track the reference signals f  with decay rates p .
 *                                                  1        1                                                                                                                            i                   j
 *                   AsymptoticOutputTracker[{sys, {out , …}, {in , …}}, …] specifies outputs out  and control inputs in  to use. 
 * Usage:                                              1         1                               i                      j
 * 
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AsymptoticOutputTracker
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticOutputTracker.html
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
fun asymptoticOutputTracker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticOutputTracker", arguments.toMutableList(), options)
}
