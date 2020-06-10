package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BlankSequence
 * 
 * Full name:        System`BlankSequence
 * 
 *                   __ (two _ characters) or BlankSequence[] is a pattern object that can stand for any sequence of one or more Wolfram Language expressions. 
 * Usage:            __h or BlankSequence[h] can stand for any sequence of one or more expressions, all of which have head h. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/BlankSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlankSequence.html
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
fun blankSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlankSequence", arguments.toMutableList(), options)
}
