package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemsModelExtract
 * 
 * Full name:        System`SystemsModelExtract
 * 
 *                   SystemsModelExtract[sys, {in , …}] extracts the subsystem of the systems model sys associated with inputs at position in .
 *                                               1                                                                                           i
 *                   SystemsModelExtract[sys, {in , …}, {out , …}] extracts the subsystem associated with inputs and outputs at positions in  and out , respectively.
 *                                               1          1                                                                               i        i
 *                   SystemsModelExtract[sys, {in , …}, {out , …}, {s , …}] extracts the subsystem of the state-space model sys associated with inputs, outputs, and states at in , out , and s , respectively.
 * Usage:                                        1          1        1                                                                                                           i     i       i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SystemsModelExtract
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelExtract.html
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
fun systemsModelExtract(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelExtract", arguments.toMutableList(), options)
}
