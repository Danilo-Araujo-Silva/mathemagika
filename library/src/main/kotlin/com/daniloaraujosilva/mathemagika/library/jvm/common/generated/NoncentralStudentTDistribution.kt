package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NoncentralStudentTDistribution
 * 
 * Full name:        System`NoncentralStudentTDistribution
 * 
 * Usage:            NoncentralStudentTDistribution[ν, δ] represents a noncentral Student t distribution with ν degrees of freedom and noncentrality parameter δ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NoncentralStudentTDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NoncentralStudentTDistribution.html
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
fun noncentralStudentTDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NoncentralStudentTDistribution", arguments.toMutableList(), options)
}
