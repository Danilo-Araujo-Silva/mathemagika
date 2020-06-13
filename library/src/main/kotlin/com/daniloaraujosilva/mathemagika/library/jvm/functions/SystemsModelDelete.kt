package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelDelete
 *
 * Full name:        System`SystemsModelDelete
 *
 *                   SystemsModelDelete[sys, {in , …}] deletes the subsystem of the systems model sys associated with inputs at position in .
 *                                              1                                                                                          i
 *                   SystemsModelDelete[sys, {in , …}, {out , …}] also deletes the subsystem associated with outputs at positions out .
 *                                              1          1                                                                         i
 *                   SystemsModelDelete[sys, {in , …}, {out , …}, {s , s , …}] deletes the subsystem of the state-space model sys associated with inputs, outputs, and states at in , out , and s , respectively.
 * Usage:                                       1          1        1   2                                                                                                          i     i       i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelDelete.html
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
fun systemsModelDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelDelete", arguments.toMutableList(), options)
}
