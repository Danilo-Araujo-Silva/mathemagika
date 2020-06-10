package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NestWhileList
 * 
 * Full name:        System`NestWhileList
 * 
 *                   NestWhileList[f, expr, test] generates a list of the results of applying f repeatedly, starting with expr, and continuing until applying test to the result no longer yields True. 
 *                   NestWhileList[f, expr, test, m] supplies the most recent m results as arguments for test at each step. 
 *                   NestWhileList[f, expr, test, All] supplies all results so far as arguments for test at each step. 
 * Usage:            NestWhileList[f, expr, test, m, max] applies f at most max times. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NestWhileList
 * Documentation:    web: http://reference.wolfram.com/language/ref/NestWhileList.html
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
fun nestWhileList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NestWhileList", arguments.toMutableList(), options)
}
