package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NetInsert
 * 
 * Full name:        System`NetInsert
 * 
 *                   NetInsert[chain, layer, i] inserts a layer into a NetChain before the layer at position i.
 * Usage:            NetInsert[chain, "name" -> layer, "pos"] inserts a named layer into a NetChain before the layer at the given position.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NetInsert
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetInsert.html
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
fun netInsert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetInsert", arguments.toMutableList(), options)
}
