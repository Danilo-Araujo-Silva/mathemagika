package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ResourceVersion
 * 
 * Full name:        System`ResourceVersion
 * 
 * Usage:            ResourceVersion is an option for ResourceObject, ResourceFunction and related functions for specifying the version of a resource.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ResourceVersion
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceVersion.html
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
fun resourceVersion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceVersion", arguments.toMutableList(), options)
}
