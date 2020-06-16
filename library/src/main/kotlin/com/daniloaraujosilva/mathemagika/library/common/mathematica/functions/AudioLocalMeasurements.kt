package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioLocalMeasurements
 *
 * Full name:        System`AudioLocalMeasurements
 *
 *                   AudioLocalMeasurements[audio, "prop"] computes the property "prop" locally for partitions of audio.
 *                   AudioLocalMeasurements[audio, {prop , prop , …}] computes several properties "prop ".
 *                                                      1      2                                       i
 * Usage:            AudioLocalMeasurements[audio, "prop", format] returns the measurements in the specified output format.
 *
 *                   Alignment -> Center
 *                   FourierParameters -> {-1, 1}
 *                   MetaInformation -> None
 *                   MissingDataMethod -> None
 *                   Padding -> Automatic
 *                   PaddingSize -> Automatic
 *                   PartitionGranularity -> Automatic
 * Options:          ResamplingMethod -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioLocalMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioLocalMeasurements.html
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
fun audioLocalMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioLocalMeasurements", arguments.toMutableList(), options)
}
