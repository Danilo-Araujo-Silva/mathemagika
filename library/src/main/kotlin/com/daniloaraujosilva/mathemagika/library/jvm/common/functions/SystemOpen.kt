package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemOpen
 *
 * Full name:        System`SystemOpen
 *
 * Usage:            SystemOpen["target"] opens the specified file, URL, or other target with the associated program on your computer system.
 *
 * Options:          ErrorAction -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemOpen
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemOpen.html
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
fun systemOpen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemOpen", arguments.toMutableList(), options)
}
