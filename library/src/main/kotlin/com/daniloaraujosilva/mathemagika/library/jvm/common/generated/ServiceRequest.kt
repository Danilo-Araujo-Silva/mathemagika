package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ServiceRequest
 * 
 * Full name:        System`ServiceRequest
 * 
 *                   ServiceRequest[service, "req"] represents a service request built from service, which might be a connected ServiceObject or a valid service name, and request "req".
 *                   ServiceRequest[service, "req", param] represents a service request, built from the service service, request "req" and parameters param.
 * Usage:            ServiceRequest[assoc] represents a service request, built from association assoc.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ServiceRequest
 * Documentation:    web: http://reference.wolfram.com/language/ref/ServiceRequest.html
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
fun serviceRequest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ServiceRequest", arguments.toMutableList(), options)
}
