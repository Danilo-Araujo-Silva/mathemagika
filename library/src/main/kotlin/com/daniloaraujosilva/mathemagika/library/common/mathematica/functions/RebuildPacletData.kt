package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RebuildPacletData
 *
 * Full name:        System`RebuildPacletData
 *
 * Usage:            The experimental function RebuildPacletData is now obsolete and is superseded by PacletDataRebuild.
 *
 * Options:          Collections -> All
 *
 * Attributes:
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 *
 * Definitions:      RebuildPacletData[PacletManager`Manager`Private`args___] := (Message[RebuildPacletData::expobs, RebuildPacletData, PacletDataRebuild]; PacletDataRebuild[PacletManager`Manager`Private`args])
 *
 * Own values:       None
 *
 * Down values:      RebuildPacletData[PacletManager`Manager`Private`args___] := (Message[RebuildPacletData::expobs, RebuildPacletData, PacletDataRebuild]; PacletDataRebuild[PacletManager`Manager`Private`args])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun rebuildPacletData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RebuildPacletData", arguments.toMutableList(), options)
}
