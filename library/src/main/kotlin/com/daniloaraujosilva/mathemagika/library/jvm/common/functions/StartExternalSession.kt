package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StartExternalSession
 *
 * Full name:        System`StartExternalSession
 *
 *                   StartExternalSession["sys"] starts an external session using the external evaluator sys, returning an external session object.
 *                   StartExternalSession[{"sys", opts}] uses the options opts for the external evaluator.
 *                   StartExternalSession[assoc] starts the external evaluator specified by assoc.
 * Usage:            StartExternalSession[sys  type] specifies that output from the external evaluator should be converted to the specified type.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StartExternalSession
 * Documentation:    web: http://reference.wolfram.com/language/ref/StartExternalSession.html
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
fun startExternalSession(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StartExternalSession", arguments.toMutableList(), options)
}
