package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelFeedbackConnect
 *
 * Full name:        System`SystemsModelFeedbackConnect
 *
 *                   SystemsModelFeedbackConnect[sys] connects the outputs from sys to the inputs with negative feedback.
 *                   SystemsModelFeedbackConnect[sys, {con , …}] only feedback connect the outputs and inputs in con .
 *                                                        1                                                         i
 *                   SystemsModelFeedbackConnect[sys , sys ] connects the outputs of sys  to sys  and the outputs of sys  to the inputs of sys  in feedback.
 *                                                  1     2                             1       2                       2                     1
 *                                                                                                                                th                         th
 *                   SystemsModelFeedbackConnect[sys , sys , {out , …}, {{in , ftype }, …}] connects output out  of sys  to the i   input of sys  and the j   output of sys  to input in  of sys  with feedback type ftype .
 * Usage:                                           1     2      1          1       1                          i       1                         2                           2            j       1                         j
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelFeedbackConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelFeedbackConnect.html
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
fun systemsModelFeedbackConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelFeedbackConnect", arguments.toMutableList(), options)
}
