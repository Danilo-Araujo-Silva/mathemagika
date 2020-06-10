package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SequenceAttentionLayer
 * 
 * Full name:        System`SequenceAttentionLayer
 * 
 *                   SequenceAttentionLayer[] is equivalent to AttentionLayer[] with a single "Input" port instead of ports "Key" and "Value". It should no longer be used.
 * Usage:            SequenceAttentionLayer[net] is equivalent to AttentionLayer[net] with a single "Input" port instead of ports "Key" and "Value". It should no longer be used.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SequenceAttentionLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceAttentionLayer.html
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
fun sequenceAttentionLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceAttentionLayer", arguments.toMutableList(), options)
}
