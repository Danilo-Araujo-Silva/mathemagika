package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Array
 *
 * Full name:        System`Array
 *
 *                   Array[f, n] generates a list of length n, with elements f[i].
 *                   Array[f, n, r] generates a list using the index origin r.
 *                   Array[f, n, {a, b}] generates a list using n values from a to b.
 *                   Array[f, {n , n , …}] generates an n ×n ×… array of nested lists, with elements f[i , i , …].
 *                              1   2                    1  2                                           1   2
 *                   Array[f, {n , n , …}, {r , r , …}] generates a list using the index origins r  (default 1).
 *                              1   2        1   2                                                i
 *                   Array[f, {n , n , …}, {{a , b }, {a , b }, …}] generates a list using n  values from a  to b .
 *                              1   2         1   1     2   2                               i              i     i
 * Usage:            Array[f, dims, origin, h] uses head h, rather than List, for each level of the array.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Array
 * Documentation:    web: http://reference.wolfram.com/language/ref/Array.html
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
fun array(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Array", arguments.toMutableList(), options)
}
