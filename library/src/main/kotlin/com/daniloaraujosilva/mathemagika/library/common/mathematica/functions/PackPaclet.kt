package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PackPaclet
 *
 * Full name:        System`PackPaclet
 *
 * Usage:            The experimental function PackPaclet is now obsolete and is superseded by CreatePacletArchive.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 *
 * Definitions:      PackPaclet[PacletManager`Manager`Private`args___] := (Message[PackPaclet::expobs, PackPaclet, CreatePacletArchive]; CreatePacletArchive[PacletManager`Manager`Private`args])
 *
 * Own values:       None
 *
 * Down values:      PackPaclet[PacletManager`Manager`Private`args___] := (Message[PackPaclet::expobs, PackPaclet, CreatePacletArchive]; CreatePacletArchive[PacletManager`Manager`Private`args])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun packPaclet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PackPaclet", arguments.toMutableList(), options)
}
