package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Entropy
 * 
 * Full name:        System`Entropy
 * 
 *                   Entropy[list] gives the base  information entropy of the values in list.
 * Usage:            Entropy[k, list] gives the base k information entropy.
 * 
 * Options:          SameTest -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Entropy
 * Documentation:    web: http://reference.wolfram.com/language/ref/Entropy.html
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
fun entropy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Entropy", arguments.toMutableList(), options)
}
