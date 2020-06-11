package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteMarkovProcess
 *
 * Full name:        System`DiscreteMarkovProcess
 *
 *                   DiscreteMarkovProcess[i , m] represents a discrete-time, finite-state Markov process with transition matrix m and initial state i .
 *                                          0                                                                                                         0
 *                   DiscreteMarkovProcess[p , m] represents a Markov process with initial state probability vector p .
 *                                          0                                                                        0
 * Usage:            DiscreteMarkovProcess[…, g] represents a Markov process with transition matrix from the graph g.
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteMarkovProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteMarkovProcess.html
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
fun discreteMarkovProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteMarkovProcess", arguments.toMutableList(), options)
}
