package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioReplace
 *
 * Full name:        System`AudioReplace
 *
 *                   AudioReplace[audio, {t , t }  new] replaces the audio signal between t  and t  with the new signal new.
 *                                         1   2                                            1      2
 *                   AudioReplace[audio, {{t  , t  }, …}  new] replaces multiple intervals with the same audio new.
 *                                          11   12
 *                   AudioReplace[audio, {{t  , t  }  new , …}] replaces multiple intervals.
 *                                          11   12       1
 *                   AudioReplace[audio, {t , t }  new, fitting] uses the specified fitting method.
 * Usage:                                  1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioReplace.html
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
fun audioReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioReplace", arguments.toMutableList(), options)
}
