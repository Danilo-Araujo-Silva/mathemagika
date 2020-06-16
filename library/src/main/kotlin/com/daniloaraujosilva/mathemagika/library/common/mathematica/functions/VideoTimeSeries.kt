package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VideoTimeSeries
 *
 * Full name:        System`VideoTimeSeries
 *
 *                   VideoTimeSeries[f, video] applies f to each frame of the Video object video, returning a time series.
 *                   VideoTimeSeries[f, video, n] applies f to non-overlapping partitions of n video frames.
 * Usage:            VideoTimeSeries[f, video, n, d] applies f to partitions with offset d.
 *
 *                   Alignment -> Automatic
 *                   MetaInformation -> None
 *                   MissingDataMethod -> Automatic
 * Options:          ResamplingMethod -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoTimeSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoTimeSeries.html
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
fun videoTimeSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoTimeSeries", arguments.toMutableList(), options)
}
