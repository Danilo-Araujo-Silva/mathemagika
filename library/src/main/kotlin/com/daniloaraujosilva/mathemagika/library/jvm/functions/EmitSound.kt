package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EmitSound
 *
 * Full name:        System`EmitSound
 *
 *                   EmitSound[snd] emits the sound snd when evaluated.
 *                   EmitSound[{snd , snd , …}] emits each of the sounds snd  in sequence.
 * Usage:                          1     2                                  i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EmitSound
 * Documentation:    web: http://reference.wolfram.com/language/ref/EmitSound.html
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
fun emitSound(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EmitSound", arguments.toMutableList(), options)
}
