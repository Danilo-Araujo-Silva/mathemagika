package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceSubmit
 *
 * Full name:        System`ResourceSubmit
 *
 *                   ResourceSubmit[resource] submits the specified resource object to be reviewed for publication.
 * Usage:            ResourceSubmit[new, old] submits the resource new as the updated version of the resource old.
 *
 *                   PublisherID :> $PublisherID
 *                   ResourceSystemBase :> $ResourceSystemBase
 * Options:          SubmissionNotes -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResourceSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceSubmit.html
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
fun resourceSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceSubmit", arguments.toMutableList(), options)
}
