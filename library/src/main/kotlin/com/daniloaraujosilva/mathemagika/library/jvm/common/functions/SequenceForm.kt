package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceForm
 *
 * Full name:        System`SequenceForm
 *
 *                   SequenceForm[expr , expr , …] prints as the textual concatenation of the printed forms of the expr .
 * Usage:                             1      2                                                                         i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SequenceForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceForm.html
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
fun sequenceForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceForm", arguments.toMutableList(), options)
}
