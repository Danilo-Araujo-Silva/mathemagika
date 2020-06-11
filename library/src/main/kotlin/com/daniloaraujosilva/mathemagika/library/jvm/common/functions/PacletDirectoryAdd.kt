package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PacletDirectoryAdd
 *
 * Full name:        System`PacletDirectoryAdd
 *
 * Usage:            The experimental function PacletDirectoryAdd is now obsolete and is superseded by PacletDirectoryLoad.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 *
 * Definitions:      PacletDirectoryAdd[PacletManager`Manager`Private`args___] := (Message[PacletDirectoryAdd::expobs, PacletDirectoryAdd, PacletDirectoryLoad]; PacletDirectoryLoad[PacletManager`Manager`Private`args])
 *
 * Own values:       None
 *
 * Down values:      PacletDirectoryAdd[PacletManager`Manager`Private`args___] := (Message[PacletDirectoryAdd::expobs, PacletDirectoryAdd, PacletDirectoryLoad]; PacletDirectoryLoad[PacletManager`Manager`Private`args])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun pacletDirectoryAdd(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletDirectoryAdd", arguments.toMutableList(), options)
}
