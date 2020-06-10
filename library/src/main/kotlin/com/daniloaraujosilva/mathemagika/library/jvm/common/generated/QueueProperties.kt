package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             QueueProperties
 * 
 * Full name:        System`QueueProperties
 * 
 *                   QueueProperties[qproc] gives a summary of properties for the queueing process qproc.
 *                                                                                       th
 *                   QueueProperties[{qproc, i}] gives a summary of properties for the i   node in the queueing network process qproc.
 *                   QueueProperties[data] gives a summary of properties for queueing simulation data. 
 * Usage:            QueueProperties[…, "property"] gives the specified "property".
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/QueueProperties
 * Documentation:    web: http://reference.wolfram.com/language/ref/QueueProperties.html
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
fun queueProperties(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QueueProperties", arguments.toMutableList(), options)
}
