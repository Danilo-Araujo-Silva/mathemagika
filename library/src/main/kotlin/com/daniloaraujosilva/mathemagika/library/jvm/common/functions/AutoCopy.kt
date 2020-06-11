package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AutoCopy
 *
 * Full name:        System`AutoCopy
 *
 * Usage:            AutoCopy is an option for notebooks and cloud objects that specifies whether to automatically make a copy when the object is opened.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoCopy
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoCopy.html
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
fun autoCopy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoCopy", arguments.toMutableList(), options)
}
