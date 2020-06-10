package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CreateDirectory
 * 
 * Full name:        System`CreateDirectory
 * 
 *                   CreateDirectory["dir"] creates a directory with name dir. 
 * Usage:            CreateDirectory[] creates a directory in the default area for temporary directories on your computer system.
 * 
 * Options:          CreateIntermediateDirectories -> True
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CreateDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateDirectory.html
 * 
 * Definitions:      CreateDirectory[CloudObject`Private`failureObj:Failure["CloudObjectInvalidPathFailure" | "CloudObjectInvalidUUID", ___]] := CloudObject`Private`failureObj
 * 
 * Own values:       None
 * 
 * Down values:      CreateDirectory[CloudObject`Private`failureObj:Failure["CloudObjectInvalidPathFailure" | "CloudObjectInvalidUUID", ___]] := CloudObject`Private`failureObj
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun createDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateDirectory", arguments.toMutableList(), options)
}
