package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HostLookup
 * 
 * Full name:        System`HostLookup
 * 
 *                   HostLookup[name] gives the IP address for the host with the specified name.
 *                   HostLookup[address] gives the host name for the host at the specified IP address.
 *                   HostLookup[spec, prop] gives a specified property of the host.
 * Usage:            HostLookup[spec, All] gives an association of properties found for the host.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HostLookup
 * Documentation:    web: http://reference.wolfram.com/language/ref/HostLookup.html
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
fun hostLookup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HostLookup", arguments.toMutableList(), options)
}
