package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ListConvolve
 * 
 * Full name:        System`ListConvolve
 * 
 *                   ListConvolve[ker, list] forms the convolution of the kernel ker with list. 
 *                                                                                          th
 *                   ListConvolve[ker, list, k] forms the cyclic convolution in which the k   element of ker is aligned with each element in list. 
 *                   ListConvolve[ker, list, {k , k }] forms the cyclic convolution whose first element contains list[[1]] ker[[k ]] and whose last element contains list[[-1]] ker[[k ]]. 
 *                                             L   R                                                                             L                                                    R
 *                   ListConvolve[ker, list, klist, p] forms the convolution in which list is padded at each end with repetitions of the element p. 
 *                   ListConvolve[ker, list, klist, {p , p , …}] forms the convolution in which list is padded at each end with cyclic repetitions of the p . 
 *                                                    1   2                                                                                                i
 *                   ListConvolve[ker, list, klist, padding, g, h] forms a generalized convolution in which g is used in place of Times and h in place of Plus. 
 * Usage:            ListConvolve[ker, list, klist, padding, g, h, lev] forms a convolution using elements at level lev in ker and list. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ListConvolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListConvolve.html
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
fun listConvolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListConvolve", arguments.toMutableList(), options)
}
