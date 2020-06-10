package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ResourceRegister
 * 
 * Full name:        System`ResourceRegister
 * 
 *                   ResourceRegister[resource] creates a persistent cache of a resource object that can be referenced by name.
 *                   ResourceRegister[resource, loc] stores the resource in persistence location loc.
 *                   ResourceRegister[resource, {loc , …}] stores the resource in multiple persistence locations.
 * Usage:                                           1
 * 
 * Options:          StoreContent -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ResourceRegister
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceRegister.html
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
fun resourceRegister(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceRegister", arguments.toMutableList(), options)
}
