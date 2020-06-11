package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Sound
 *
 * Full name:        System`Sound
 *
 *                   Sound[primitives] represents a sound.
 *                   Sound[primitives, t] specifies that the sound should have duration t.
 *                   Sound[primitives, {t   , t   }] specifies that the sound should extend from time t    to time t   .
 * Usage:                                min   max                                                     min          max
 *
 * Options:          SoundVolume -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Sound
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sound.html
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
fun sound(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sound", arguments.toMutableList(), options)
}
