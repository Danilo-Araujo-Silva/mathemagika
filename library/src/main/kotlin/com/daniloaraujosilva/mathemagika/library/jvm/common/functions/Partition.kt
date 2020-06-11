package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Partition
 *
 * Full name:        System`Partition
 *
 *                   Partition[list, n] partitions list into nonoverlapping sublists of length n.
 *                   Partition[list, n, d] generates sublists with offset d.
 *                   Partition[list, {n , n , …}] partitions a nested list into blocks of size n ×n ×….
 *                                     1   2                                                    1  2
 *                   Partition[list, {n , n , …}, {d , d , …}] uses offset d  at level i in list.
 *                                     1   2        1   2                   i
 *                   Partition[list, n, d, {k , k }] specifies that the first element of list should appear at position k  in the first sublist, and the last element of list should appear at or after position k  in the last sublist. If additional elements are needed, Partition fills them in by treating list as cyclic.
 *                                           L   R                                                                       L                                                                                        R
 *                   Partition[list, n, d, {k , k }, x] pads if necessary by repeating the element x.
 *                                           L   R
 *                   Partition[list, n, d, {k , k }, {x , x , …}] pads if necessary by cyclically repeating the elements x .
 *                                           L   R     1   2                                                              i
 *                   Partition[list, n, d, {k , k }, {}] uses no padding, and so can yield sublists of different lengths.
 *                                           L   R
 *                   Partition[list, nlist, dlist, {klist , klist }, padlist] specifies alignments and padding in a nested list.
 * Usage:                                                L       R
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Partition
 * Documentation:    web: http://reference.wolfram.com/language/ref/Partition.html
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
fun partition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Partition", arguments.toMutableList(), options)
}
