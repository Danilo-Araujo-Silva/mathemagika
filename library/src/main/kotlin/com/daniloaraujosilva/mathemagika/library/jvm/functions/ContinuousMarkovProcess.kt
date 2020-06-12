package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContinuousMarkovProcess
 *
 * Full name:        System`ContinuousMarkovProcess
 *
 *                   ContinuousMarkovProcess[i , q] represents a continuous-time finite-state Markov process with transition rate matrix q and initial state i .
 *                                            0                                                                                                               0
 *                   ContinuousMarkovProcess[p , q] represents a Markov process with initial state probability vector p .
 *                                            0                                                                        0
 *                   ContinuousMarkovProcess[…, m, μ] represents a Markov process with transition matrix m and transition rates μ.
 * Usage:            ContinuousMarkovProcess[…, g] represents a Markov process transition rate matrix from the graph g.
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContinuousMarkovProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuousMarkovProcess.html
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
fun continuousMarkovProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuousMarkovProcess", arguments.toMutableList(), options)
}
