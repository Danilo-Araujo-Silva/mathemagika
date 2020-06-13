package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StructuralImportance
 *
 * Full name:        System`StructuralImportance
 *
 *                   StructuralImportance[rdist] gives the structural importances for all components in the ReliabilityDistribution rdist.
 *                   StructuralImportance[fdist] gives the structural importances for all components in the FailureDistribution fdist.
 *                   StructuralImportance[bexpr, {x , x , …}] gives the structural importance for the components x , x , … in the Boolean expression bexpr.
 * Usage:                                          1   2                                                          1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StructuralImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/StructuralImportance.html
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
fun structuralImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StructuralImportance", arguments.toMutableList(), options)
}
