package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Arrays
 * 
 * Full name:        System`Arrays
 * 
 *                   Arrays[{d , …, d }] represents the domain of arrays of rank r and dimensions d .
 *                            1      r                                                             i
 *                   Arrays[{d , …, d }, dom] represents the domain of arrays of dimensions d , with components in the domain dom.
 *                            1      r                                                       i
 *                   Arrays[{d , …, d }, dom, sym] represents the subdomain of arrays with dimensions d  and symmetry sym.
 * Usage:                     1      r                                                                 i
 * 
 * Options:          None
 * 
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Arrays
 * Documentation:    web: http://reference.wolfram.com/language/ref/Arrays.html
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
fun arrays(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Arrays", arguments.toMutableList(), options)
}
