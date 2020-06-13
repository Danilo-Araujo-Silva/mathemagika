package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioOverlay
 *
 * Full name:        System`AudioOverlay
 *
 *                   AudioOverlay[{audio , audio , …}] returns an audio object by overlaying all audio .
 * Usage:                               1       2                                                     i
 *
 * Options:          SampleRate -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioOverlay
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioOverlay.html
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
fun audioOverlay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioOverlay", arguments.toMutableList(), options)
}
