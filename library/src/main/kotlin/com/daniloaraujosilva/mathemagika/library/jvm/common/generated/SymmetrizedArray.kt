package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SymmetrizedArray
 * 
 * Full name:        System`SymmetrizedArray
 * 
 *                   SymmetrizedArray[{pos   val , pos   val , …}, dims, sym] yields an array of dimensions dims whose entries are given by those in the rules pos   val  or through the symmetry sym.
 *                                        1      1     2      2                                                                                                     i      i
 * Usage:            SymmetrizedArray[list] yields a symmetrized array version of list.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SymmetrizedArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetrizedArray.html
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
fun symmetrizedArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetrizedArray", arguments.toMutableList(), options)
}
