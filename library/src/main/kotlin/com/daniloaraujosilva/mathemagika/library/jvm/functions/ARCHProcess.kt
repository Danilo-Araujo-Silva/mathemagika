package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ARCHProcess
 *
 * Full name:        System`ARCHProcess
 *
 *                   ARCHProcess[κ, {α , …, α }] represents an autoregressive conditionally heteroscedastic process of order q, driven by a standard white noise.
 *                                    1      q
 *                   ARCHProcess[κ, {α , …, α }, init] represents an ARCH process with initial data init.
 * Usage:                             1      q
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ARCHProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/ARCHProcess.html
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
fun aRCHProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ARCHProcess", arguments.toMutableList(), options)
}
