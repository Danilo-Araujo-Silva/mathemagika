package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioBlockMap
 *
 * Full name:        System`AudioBlockMap
 *
 *                   AudioBlockMap[f, audio, dur] applies f to non-overlapping partitions of length dur in audio.
 *                   AudioBlockMap[f, audio, {dur, offset}] applies f to partitions with offset offset in audio.
 * Usage:            AudioBlockMap[f, audio, {dur, offset, wfun}] applies f after applying wfun to partitions in audio.
 *
 *                   Alignment -> Automatic
 *                   FourierParameters -> {-1, 1}
 *                   MetaInformation -> None
 *                   MissingDataMethod -> Automatic
 *                   Padding -> Automatic
 *                   PaddingSize -> Automatic
 * Options:          ResamplingMethod -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioBlockMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioBlockMap.html
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
fun audioBlockMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioBlockMap", arguments.toMutableList(), options)
}
