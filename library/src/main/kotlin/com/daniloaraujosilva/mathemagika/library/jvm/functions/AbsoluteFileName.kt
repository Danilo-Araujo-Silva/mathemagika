package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteFileName
 *
 * Full name:        System`AbsoluteFileName
 *
 * Usage:            AbsoluteFileName["name"] gives the full absolute version of the name for a file in your filesystem.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AbsoluteFileName
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteFileName.html
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
fun absoluteFileName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteFileName", arguments.toMutableList(), options)
}
