package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioSpectralTransformation
 *
 * Full name:        System`AudioSpectralTransformation
 *
 * Usage:            AudioSpectralTransformation[f, audio] returns a modified version of audio by applying a time-frequency transformation f to its short-time Fourier transform.
 *
 *                   DataRange -> Automatic
 *                   Padding -> 0
 *                   PartitionGranularity -> Automatic
 * Options:          Resampling -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioSpectralTransformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioSpectralTransformation.html
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
fun audioSpectralTransformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioSpectralTransformation", arguments.toMutableList(), options)
}
