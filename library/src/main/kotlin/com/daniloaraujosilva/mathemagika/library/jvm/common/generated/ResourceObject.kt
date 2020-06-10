package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ResourceObject
 * 
 * Full name:        System`ResourceObject
 * 
 *                   ResourceObject["name"] represents a resource with the specified name.
 *                   ResourceObject["uuid"] represents a resource with the specified UUID.
 *                   ResourceObject[loc] imports a resource from the specified location.
 * Usage:            ResourceObject[assoc] gives a resource with content and metadata specified by the association assoc.
 * 
 *                   ResourceSystemPath :> $ResourceSystemPath
 *                   ResourceVersion -> Automatic
 *                   ResourceSystemBase :> Automatic
 *                   Version -> Automatic
 * Options:          WolframLanguageVersion -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ResourceObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceObject.html
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
fun resourceObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceObject", arguments.toMutableList(), options)
}
