package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             QueueingNetworkProcess
 * 
 * Full name:        System`QueueingNetworkProcess
 * 
 *                   QueueingNetworkProcess[γ, r, μ, c] represents an open (Jackson) queueing network process with arrival vector γ, routing probability matrix r, service vector μ, and service channel vector c. 
 * Usage:            QueueingNetworkProcess[γ, r, μ, c, k] represents a closed (Gordon–Newell) queueing network process with k jobs in the system.
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/QueueingNetworkProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/QueueingNetworkProcess.html
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
fun queueingNetworkProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QueueingNetworkProcess", arguments.toMutableList(), options)
}
