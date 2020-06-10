package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             IncludeConstantBasis
 * 
 * Full name:        System`IncludeConstantBasis
 * 
 * Usage:            IncludeConstantBasis is an option for LinearModelFit and other fitting functions that specifies whether a constant term should be included if not explicitly given in the list of basis functions.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/IncludeConstantBasis
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeConstantBasis.html
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
fun includeConstantBasis(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeConstantBasis", arguments.toMutableList(), options)
}
