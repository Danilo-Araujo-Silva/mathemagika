package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Put
 *
 * Full name:        System`Put
 *
 *                   expr >> filename writes expr to a file.
 *                   Put[expr , expr , …, "filename"] writes a sequence of expressions expr  to a file.
 *                           1      2                                                      i
 * Usage:            Put["filename"] creates an empty file with the specified name.
 *
 * Options:          CharacterEncoding :> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Put
 * Documentation:    web: http://reference.wolfram.com/language/ref/Put.html
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
fun put(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Put", arguments.toMutableList(), options)
}
