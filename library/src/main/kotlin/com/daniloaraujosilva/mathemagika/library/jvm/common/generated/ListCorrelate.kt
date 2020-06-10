package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ListCorrelate
 * 
 * Full name:        System`ListCorrelate
 * 
 *                   ListCorrelate[ker, list] forms the correlation of the kernel ker with list. 
 *                                                                                           th
 *                   ListCorrelate[ker, list, k] forms the cyclic correlation in which the k   element of ker is aligned with each element in list. 
 *                   ListCorrelate[ker, list, {k , k }] forms the cyclic correlation whose first element contains list[[1]] ker[[k ]] and whose last element contains list[[-1]] ker[[k ]]. 
 *                                              L   R                                                                             L                                                    R
 *                   ListCorrelate[ker, list, klist, p] forms the correlation in which list is padded at each end with repetitions of the element p. 
 *                   ListCorrelate[ker, list, klist, {p , p , …}] forms the correlation in which list is padded at each end with cyclic repetitions of the p . 
 *                                                     1   2                                                                                                i
 *                   ListCorrelate[ker, list, klist, padding, g, h] forms a generalized correlation in which g is used in place of Times and h in place of Plus. 
 * Usage:            ListCorrelate[ker, list, klist, padding, g, h, lev] forms a correlation using elements at level lev in ker and list. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ListCorrelate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListCorrelate.html
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
fun listCorrelate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListCorrelate", arguments.toMutableList(), options)
}
