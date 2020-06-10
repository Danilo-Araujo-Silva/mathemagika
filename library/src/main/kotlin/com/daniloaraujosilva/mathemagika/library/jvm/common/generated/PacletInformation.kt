package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PacletInformation
 * 
 * Full name:        System`PacletInformation
 * 
 * Usage:            The experimental function PacletInformation is now obsolete. Use Information[PacletObject["pacletname"]], or property-extraction syntax like PacletObject["pacletname"]["prop"] or PacletObject["pacletname"][All] instead.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 * 
 * Definitions:      PacletInformation[PacletManager`Manager`Private`args___] := (Message[PacletInformation::piobs]; PacletManager`PacletInformation[PacletManager`Manager`Private`args])
 * 
 * Own values:       None
 * 
 * Down values:      PacletInformation[PacletManager`Manager`Private`args___] := (Message[PacletInformation::piobs]; PacletManager`PacletInformation[PacletManager`Manager`Private`args])
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun pacletInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletInformation", arguments.toMutableList(), options)
}
