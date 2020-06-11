package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelLinearity
 *
 * Full name:        System`SystemsModelLinearity
 *
 *                   SystemsModelLinearity[sys] gives the linearity of the systems model sys.
 *                   SystemsModelLinearity[{sys, {in , …}, {out , …}, {s , …}] only considers the subsystem associated with inputs in , outputs out , and states s .
 * Usage:                                           1          1        1                                                            i             j              k
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelLinearity
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelLinearity.html
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
fun systemsModelLinearity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelLinearity", arguments.toMutableList(), options)
}
