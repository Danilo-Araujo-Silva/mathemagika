package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NestWhile
 *
 * Full name:        System`NestWhile
 *
 *                   NestWhile[f, expr, test] starts with expr, then repeatedly applies f until applying test to the result no longer yields True.
 *                   NestWhile[f, expr, test, m] supplies the most recent m results as arguments for test at each step.
 *                   NestWhile[f, expr, test, All] supplies all results so far as arguments for test at each step.
 *                   NestWhile[f, expr, test, m, max] applies f at most max times.
 *                   NestWhile[f, expr, test, m, max, n] applies f an extra n times.
 * Usage:            NestWhile[f, expr, test, m, max, -n] returns the result found when f had been applied n fewer times.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NestWhile
 * Documentation:    web: http://reference.wolfram.com/language/ref/NestWhile.html
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
fun nestWhile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NestWhile", arguments.toMutableList(), options)
}
