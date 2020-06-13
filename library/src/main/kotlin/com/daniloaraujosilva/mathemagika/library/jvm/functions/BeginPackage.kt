package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BeginPackage
 *
 * Full name:        System`BeginPackage
 *
 *                   BeginPackage["context`"] makes context` and System` the only active contexts.
 *                   BeginPackage["context`", {"need `", "need `", …}] calls Needs on the need .
 * Usage:                                           1         2                               i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BeginPackage
 * Documentation:    web: http://reference.wolfram.com/language/ref/BeginPackage.html
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
fun beginPackage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BeginPackage", arguments.toMutableList(), options)
}
