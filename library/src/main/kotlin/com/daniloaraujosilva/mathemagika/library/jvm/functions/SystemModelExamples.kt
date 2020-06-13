package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModelExamples
 *
 * Full name:        System`SystemModelExamples
 *
 *                   SystemModelExamples[] shows an interactive browser of system modeling example models.
 *                   SystemModelExamples["Models"] lists all example models.
 * Usage:            SystemModelExamples["Models", patt] lists models with names matching string pattern patt.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModelExamples
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelExamples.html
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
fun systemModelExamples(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelExamples", arguments.toMutableList(), options)
}
