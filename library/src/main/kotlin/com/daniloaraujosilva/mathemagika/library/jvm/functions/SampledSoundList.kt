package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SampledSoundList
 *
 * Full name:        System`SampledSoundList
 *
 *                   SampledSoundList[{a , a , …}, r] is a sound primitive that represents a sound whose amplitude has levels a  sampled r times a second.
 * Usage:                               1   2                                                                                  i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SampledSoundList
 * Documentation:    web: http://reference.wolfram.com/language/ref/SampledSoundList.html
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
fun sampledSoundList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SampledSoundList", arguments.toMutableList(), options)
}
