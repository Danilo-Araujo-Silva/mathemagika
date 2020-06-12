package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PutAppend
 *
 * Full name:        System`PutAppend
 *
 *                   expr >>> filename appends expr to a file.
 *                   PutAppend[expr , expr , …, "filename"] appends a sequence of expressions expr  to a file.
 * Usage:                          1      2                                                       i
 *
 * Options:          CharacterEncoding :> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PutAppend
 * Documentation:    web: http://reference.wolfram.com/language/ref/PutAppend.html
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
fun putAppend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PutAppend", arguments.toMutableList(), options)
}
