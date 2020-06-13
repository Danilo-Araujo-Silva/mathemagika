package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SampledSoundFunction
 *
 * Full name:        System`SampledSoundFunction
 *
 * Usage:            SampledSoundFunction[f, n, r] is a sound primitive that represents a sound whose amplitude sampled r times a second is generated by applying the function f to successive integers from 1 to n.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SampledSoundFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/SampledSoundFunction.html
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
fun sampledSoundFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SampledSoundFunction", arguments.toMutableList(), options)
}