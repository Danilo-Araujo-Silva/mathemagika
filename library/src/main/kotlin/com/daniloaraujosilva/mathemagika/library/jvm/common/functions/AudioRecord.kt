package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioRecord
 *
 * Full name:        System`AudioRecord
 *
 *                   AudioRecord[] returns a new AudioStream object and starts to record from the default input audio device.
 *                   AudioRecord[inputdev] records from the input audio device inputdev.
 * Usage:            AudioRecord[astream] starts recording an AudioStream object astream that is connected to an input device.
 *
 *                   MaxDuration -> Infinity
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioRecord
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioRecord.html
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
fun audioRecord(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioRecord", arguments.toMutableList(), options)
}
