package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PacletDataRebuild
 *
 * Full name:        System`PacletDataRebuild
 *
 * Usage:            PacletDataRebuild[] rescans all the installed paclets to rebuild the internal cache of paclet data.
 *
 * Options:          Collections -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletDataRebuild
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletDataRebuild.html
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
fun pacletDataRebuild(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletDataRebuild", arguments.toMutableList(), options)
}
