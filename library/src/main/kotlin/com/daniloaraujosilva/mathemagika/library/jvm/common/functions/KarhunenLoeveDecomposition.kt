package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KarhunenLoeveDecomposition
 *
 * Full name:        System`KarhunenLoeveDecomposition
 *
 *                   KarhunenLoeveDecomposition[{a , a , …}] gives the Karhunen–Loeve transform {{b , b , …}, m} of the numerical arrays {a , a , …}, where m . a   b .
 *                                                1   2                                            1   2                                   1   2                 i    i
 *                   KarhunenLoeveDecomposition[{b , b , …}, m] uses the inverse of the matrix m for transforming b  to a .
 * Usage:                                         1   2                                                            i     i
 *
 * Options:          Standardized -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KarhunenLoeveDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/KarhunenLoeveDecomposition.html
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
fun karhunenLoeveDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KarhunenLoeveDecomposition", arguments.toMutableList(), options)
}
