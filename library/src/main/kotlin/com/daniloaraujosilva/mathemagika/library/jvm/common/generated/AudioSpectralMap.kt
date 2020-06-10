package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioSpectralMap
 * 
 * Full name:        System`AudioSpectralMap
 * 
 *                   AudioSpectralMap[f, audio] transforms audio by applying the function f to its short-time Fourier transform.
 *                   AudioSpectralMap[f, {audio , …}] applies the function f to the list of short-time Fourier transforms of all audio .
 * Usage:                                      1                                                                                      i
 * 
 * Options:          PartitionGranularity -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioSpectralMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioSpectralMap.html
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
fun audioSpectralMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioSpectralMap", arguments.toMutableList(), options)
}
