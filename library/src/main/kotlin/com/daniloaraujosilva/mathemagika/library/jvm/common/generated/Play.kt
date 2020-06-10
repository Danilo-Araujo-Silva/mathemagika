package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Play
 * 
 * Full name:        System`Play
 * 
 *                   Play[f, {t, t   , t   }] creates an object that plays as a sound whose amplitude is given by f as a function of time t in seconds between t    and t   . 
 * Usage:                         min   max                                                                                                                     min      max
 * 
 *                   Compiled -> True
 *                   DisplayFunction :> $SoundDisplayFunction
 *                   Epilog -> {}
 *                   PlayRange -> Automatic
 *                   Prolog -> {}
 *                   SampleDepth -> 8
 * Options:          SampleRate -> 8000
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Play
 * Documentation:    web: http://reference.wolfram.com/language/ref/Play.html
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
fun play(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Play", arguments.toMutableList(), options)
}
