package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioJoin
 * 
 * Full name:        System`AudioJoin
 * 
 *                   AudioJoin[{audio , audio , …}] concatenates all audio  and returns an audio object.
 *                                   1       2                            i
 *                   AudioJoin[{{audio , t }, {audio , t }, …}] inserts t  seconds of silence after each audio .
 * Usage:                             1   1         2   2                i                                    i
 * 
 * Options:          SampleRate -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AudioJoin
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioJoin.html
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
fun audioJoin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioJoin", arguments.toMutableList(), options)
}
