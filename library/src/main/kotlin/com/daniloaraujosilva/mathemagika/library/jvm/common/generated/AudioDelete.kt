package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioDelete
 * 
 * Full name:        System`AudioDelete
 * 
 *                   AudioDelete[audio, t] deletes the first t seconds of audio.
 *                   AudioDelete[audio, -t] deletes the last t seconds of audio.
 *                   AudioDelete[audio, {t , t }] deletes from time t  to time t , returning the remaining audio as a single Audio object.
 *                                        1   2                      1          2
 *                   AudioDelete[audio, {{t  , t  }, …}] deletes multiple time intervals.
 * Usage:                                  11   12
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioDelete.html
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
fun audioDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioDelete", arguments.toMutableList(), options)
}
