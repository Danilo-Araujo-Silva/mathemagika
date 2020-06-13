package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             QueueingProcess
 *
 * Full name:        System`QueueingProcess
 *
 *                   QueueingProcess[λ, μ] represents an M/M/1 queue with arrival rate λ and service rate μ.
 *                   QueueingProcess[λ, sdist] represents an M/G/1 queue with arrival rate λ and service distribution sdist.
 *                   QueueingProcess[adist, μ] represents a G/M/1 queue with arrival distribution adist and service rate μ.
 *                   QueueingProcess[adist, sdist] represents a G/G/1 queue with arrival distribution adist and service distribution sdist.
 *                   QueueingProcess[…, …, c] represents a queueing process with c service channels.
 *                   QueueingProcess[…, …, c, k] represents a queueing process with system capacity k.
 *                   QueueingProcess[…, …, c, k, x ] represents a queueing process with initial state x .
 * Usage:                                         0                                                    0
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QueueingProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/QueueingProcess.html
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
fun queueingProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QueueingProcess", arguments.toMutableList(), options)
}
