package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PacletDirectoryRemove
 *
 * Full name:        System`PacletDirectoryRemove
 *
 * Usage:            StringTemplate[The experimental function `1` is now obsolete and is superseded by `2`., PacletDirectoryRemove, PacletDirectoryUnload]
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 *
 * Definitions:      PacletDirectoryRemove[PacletManager`Manager`Private`args___] := (Message[PacletDirectoryRemove::expobs, PacletDirectoryRemove, PacletDirectoryUnload]; PacletDirectoryUnload[PacletManager`Manager`Private`args])
 *
 * Own values:       None
 *
 * Down values:      PacletDirectoryRemove[PacletManager`Manager`Private`args___] := (Message[PacletDirectoryRemove::expobs, PacletDirectoryRemove, PacletDirectoryUnload]; PacletDirectoryUnload[PacletManager`Manager`Private`args])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun pacletDirectoryRemove(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletDirectoryRemove", arguments.toMutableList(), options)
}
