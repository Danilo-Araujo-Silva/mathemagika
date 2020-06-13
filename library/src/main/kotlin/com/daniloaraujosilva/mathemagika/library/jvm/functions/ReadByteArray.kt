package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ReadByteArray
 *
 * Full name:        System`ReadByteArray
 *
 *                   ReadByteArray[src] gives the contents of src as a ByteArray object.
 *                   ReadByteArray[src, n] reads the first n bytes from src.
 * Usage:            ReadByteArray[src, term] reads until the termination condition term is satisfied.
 *
 *                   Path :> $Path
 * Options:          TimeConstraint :> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReadByteArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReadByteArray.html
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
fun readByteArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReadByteArray", arguments.toMutableList(), options)
}
