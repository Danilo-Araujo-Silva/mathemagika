package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StateSpaceRealization
 *
 * Full name:        System`StateSpaceRealization
 *
 * Usage:            StateSpaceRealization is an option to StateSpaceModel that specifies its canonical representation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StateSpaceRealization
 * Documentation:    web: http://reference.wolfram.com/language/ref/StateSpaceRealization.html
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
fun stateSpaceRealization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StateSpaceRealization", arguments.toMutableList(), options)
}
