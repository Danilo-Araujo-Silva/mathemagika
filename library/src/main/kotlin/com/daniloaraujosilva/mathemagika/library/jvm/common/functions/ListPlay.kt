package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ListPlay
 *
 * Full name:        System`ListPlay
 *
 *                   ListPlay[{a , a , …}] creates an object that plays as a sound whose amplitude is given by the sequence of levels a .
 * Usage:                       1   2                                                                                                  i
 *
 *                   DisplayFunction :> $SoundDisplayFunction
 *                   Epilog -> {}
 *                   PlayRange -> Automatic
 *                   Prolog -> {}
 *                   SampleDepth -> 8
 * Options:          SampleRate -> 8000
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ListPlay
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListPlay.html
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
fun listPlay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListPlay", arguments.toMutableList(), options)
}