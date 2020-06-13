package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioAnnotate
 *
 * Full name:        System`AudioAnnotate
 *
 *                   AudioAnnotate[audio, prop] computes the property prop and adds it as an annotation to audio.
 * Usage:            AudioAnnotate[audio, name  spec] adds an annotation with the specified name and values spec to audio.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioAnnotate
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioAnnotate.html
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
fun audioAnnotate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioAnnotate", arguments.toMutableList(), options)
}
