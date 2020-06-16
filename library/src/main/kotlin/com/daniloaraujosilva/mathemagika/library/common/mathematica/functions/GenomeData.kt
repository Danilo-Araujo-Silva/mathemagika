package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GenomeData
 *
 * Full name:        System`GenomeData
 *
 *                   GenomeData["gene"] gives the DNA sequence for the specified gene on the reference human genome.
 *                   GenomeData["gene", "property"] gives the value of the specified property for the human gene gene.
 *                   GenomeData[{"chr", {n , n }}] gives the sequence from positions n  to n  on chromosome chr in the reference human genome.
 * Usage:                                 1   2                                       1     2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GenomeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenomeData.html
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
fun genomeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenomeData", arguments.toMutableList(), options)
}
