package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SetOptions
 * 
 * Full name:        System`SetOptions
 * 
 *                   SetOptions[s, name   value , name   value , …] sets the specified default options for a symbol s. 
 *                                     1        1      2        2
 *                   SetOptions[stream, …] or SetOptions["name", …] sets options associated with a particular stream. 
 * Usage:            SetOptions[object, …] sets options associated with an external object such as a NotebookObject or CloudObject. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SetOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetOptions.html
 * 
 * Definitions:      SetOptions[CloudObject`Private`failureObj:Failure["CloudObjectInvalidPathFailure" | "CloudObjectInvalidUUID", ___], CloudObject`Private`o:OptionsPattern[]] := CloudObject`Private`failureObj
 * 
 * Own values:       None
 * 
 * Down values:      SetOptions[CloudObject`Private`failureObj:Failure["CloudObjectInvalidPathFailure" | "CloudObjectInvalidUUID", ___], CloudObject`Private`o:OptionsPattern[]] := CloudObject`Private`failureObj
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun setOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetOptions", arguments.toMutableList(), options)
}
