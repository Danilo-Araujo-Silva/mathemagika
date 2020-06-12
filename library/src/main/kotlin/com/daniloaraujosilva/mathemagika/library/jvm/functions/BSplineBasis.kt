package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BSplineBasis
 *
 * Full name:        System`BSplineBasis
 *
 *                   BSplineBasis[d, x] gives the zeroth uniform B-spline basis function of degree d at x.
 *                                                     th
 *                   BSplineBasis[d, n, x] gives the n   uniform B-spline basis function of degree d.
 *                                                                     th
 *                   BSplineBasis[{d, {u , u , …}}, n, x]  gives the n   non-uniform B-spline basis function of degree d with knots at positions u .
 * Usage:                               1   2                                                                                                      i
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BSplineBasis
 * Documentation:    web: http://reference.wolfram.com/language/ref/BSplineBasis.html
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
fun bSplineBasis(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BSplineBasis", arguments.toMutableList(), options)
}
