package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GenomeLookup
 * 
 * Full name:        System`GenomeLookup
 * 
 *                   GenomeLookup["seq"] returns the positions of exact matches for the DNA sequence seq on the reference human genome.
 * Usage:            GenomeLookup["seq", n] returns at most n matches.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GenomeLookup
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenomeLookup.html
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
fun genomeLookup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenomeLookup", arguments.toMutableList(), options)
}
