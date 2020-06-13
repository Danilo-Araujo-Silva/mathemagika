package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ControlActive
 *
 * Full name:        System`ControlActive
 *
 * Usage:            ControlActive[act, norm] evaluates to act if a control that affects act is actively being used, and to norm otherwise.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControlActive
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControlActive.html
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
fun controlActive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControlActive", arguments.toMutableList(), options)
}
