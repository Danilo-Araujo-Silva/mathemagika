package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Entity
 * 
 * Full name:        System`Entity
 * 
 *                   Entity["type", name] represents an entity of the specified type, identified by name.
 * Usage:            Entity[cspec, name] represents an entity from the computed class, specified by cspec. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Entity
 * Documentation:    web: http://reference.wolfram.com/language/ref/Entity.html
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
fun entity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Entity", arguments.toMutableList(), options)
}
