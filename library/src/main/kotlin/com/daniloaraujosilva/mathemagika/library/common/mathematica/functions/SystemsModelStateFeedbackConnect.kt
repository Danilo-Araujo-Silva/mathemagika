package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelStateFeedbackConnect
 *
 * Full name:        System`SystemsModelStateFeedbackConnect
 *
 *                   SystemsModelStateFeedbackConnect[sys, con] connects the states of the systems model sys to the controller con and the outputs of con to the inputs of sys in feedback.
 *                                                                                                                             th                        th
 *                   SystemsModelStateFeedbackConnect[sys, con, {s , …}, {{in , ftype }, …}] connects state s  of sys to the i   input of con and the j   output of con to input in  of sys with feedback type ftype
 * Usage:                                                         1          1       1                       i                                                                       j                                j
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelStateFeedbackConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelStateFeedbackConnect.html
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
fun systemsModelStateFeedbackConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelStateFeedbackConnect", arguments.toMutableList(), options)
}
