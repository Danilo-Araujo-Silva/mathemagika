package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SparseArray
 * 
 * Full name:        System`SparseArray
 * 
 *                   SparseArray[{pos   val , pos   val , …}] yields a sparse array in which values val  appear at positions pos . 
 *                                   1      1     2      2                                               i                        i
 *                   SparseArray[{pos , pos , …}  {val , val , …}] yields the same sparse array. 
 *                                   1     2           1     2
 *                   SparseArray[list] yields a sparse array version of list. 
 *                   SparseArray[data, {d , d , …}] yields a sparse array representing a d  × d  × … array. 
 *                                       1   2                                            1    2
 * Usage:            SparseArray[data, dims, val] yields a sparse array in which unspecified elements are taken to have value val. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SparseArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/SparseArray.html
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
fun sparseArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SparseArray", arguments.toMutableList(), options)
}
