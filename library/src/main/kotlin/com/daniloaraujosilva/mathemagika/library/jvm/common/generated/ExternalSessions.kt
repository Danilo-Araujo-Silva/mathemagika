package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExternalSessions
 * 
 * Full name:        System`ExternalSessions
 * 
 *                   ExternalSessions[] gives the list of currently active external evaluator sessions.
 * Usage:            ExternalSessions[sys] gives the list of sessions associated with the system sys.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ExternalSessions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalSessions.html
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
fun externalSessions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalSessions", arguments.toMutableList(), options)
}
