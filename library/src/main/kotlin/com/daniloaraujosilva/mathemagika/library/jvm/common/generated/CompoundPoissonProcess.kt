package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CompoundPoissonProcess
 * 
 * Full name:        System`CompoundPoissonProcess
 * 
 * Usage:            CompoundPoissonProcess[λ, jdist] represents a compound Poisson process with rate parameter λ and jump size distribution jdist.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CompoundPoissonProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompoundPoissonProcess.html
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
fun compoundPoissonProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompoundPoissonProcess", arguments.toMutableList(), options)
}
