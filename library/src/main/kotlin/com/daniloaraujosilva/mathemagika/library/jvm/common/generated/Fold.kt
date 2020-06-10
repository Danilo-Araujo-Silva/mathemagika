package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Fold
 * 
 * Full name:        System`Fold
 * 
 *                   Fold[f, x, list] gives the last element of FoldList[f, x, list].
 *                   Fold[f, list] is equivalent to Fold[f, First[list], Rest[list]].
 * Usage:            Fold[f] represents an operator form of Fold that can be applied to expressions. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Fold
 * Documentation:    web: http://reference.wolfram.com/language/ref/Fold.html
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
fun fold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Fold", arguments.toMutableList(), options)
}
