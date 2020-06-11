package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PacletUpdate
 *
 * Full name:        System`PacletUpdate
 *
 * Usage:            The experimental function PacletUpdate is now obsolete and is superseded by PacletInstall.
 *
 *                   KeepExisting -> Automatic
 *                   Site -> Automatic
 *                   UpdateSites -> Automatic
 * Options:          Asynchronous -> False
 *
 * Attributes:
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 *
 * Definitions:      PacletUpdate[PacletManager`Manager`Private`args___] := (Message[PacletUpdate::expobs, PacletUpdate, PacletInstall]; PacletManager`PacletUpdate[PacletManager`Manager`Private`args])
 *
 * Own values:       None
 *
 * Down values:      PacletUpdate[PacletManager`Manager`Private`args___] := (Message[PacletUpdate::expobs, PacletUpdate, PacletInstall]; PacletManager`PacletUpdate[PacletManager`Manager`Private`args])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun pacletUpdate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletUpdate", arguments.toMutableList(), options)
}
