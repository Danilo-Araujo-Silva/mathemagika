package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GARCHProcess
 *
 * Full name:        System`GARCHProcess
 *
 *                   GARCHProcess[κ, {α , …, α }, {β , …, β }] represents a generalized autoregressive conditionally heteroscedastic process of orders p and q, driven by a standard white noise.
 *                                     1      q     1      p
 *                   GARCHProcess[κ, {α , …, α }, {β , …, β }, init] represents a GARCH process with initial data init.
 * Usage:                              1      q     1      p
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GARCHProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/GARCHProcess.html
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
fun gARCHProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GARCHProcess", arguments.toMutableList(), options)
}
