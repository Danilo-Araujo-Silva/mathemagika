package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HiddenMarkovProcess
 *
 * Full name:        System`HiddenMarkovProcess
 *
 *                   HiddenMarkovProcess[i , m, em] represents a discrete-time, finite-state hidden Markov process with transition matrix m, emission matrix em, and initial hidden state i .
 *                                        0                                                                                                                                                0
 *                   HiddenMarkovProcess[…, m, {dist , …}] represents a hidden Markov process with emission distributions dist .
 *                                                  1                                                                         i
 *                   HiddenMarkovProcess[p , m, …] represents a hidden Markov process with initial hidden state probability vector p .
 * Usage:                                 0                                                                                         0
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HiddenMarkovProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/HiddenMarkovProcess.html
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
fun hiddenMarkovProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HiddenMarkovProcess", arguments.toMutableList(), options)
}
