package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CloudObjects
 * 
 * Full name:        System`CloudObjects
 * 
 *                   CloudObjects[] gives a list of cloud objects in your current cloud directory.
 *                   CloudObjects[dir] gives a list of cloud objects in the cloud directory dir.
 *                   CloudObjects[None] gives a list of all unnamed cloud objects owned by you.
 *                   CloudObjects[dir, type] gives a list of cloud objects of the specified type in the cloud directory dir.
 * Usage:            CloudObjects[assoc] gives a list of cloud objects matching the filters defined by the association assoc.
 * 
 *                   CloudBase -> Automatic
 *                   CloudObjectNameFormat -> Automatic
 *                   Directory -> Automatic
 * Options:          Type -> All
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CloudObjects
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudObjects.html
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
fun cloudObjects(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudObjects", arguments.toMutableList(), options)
}
