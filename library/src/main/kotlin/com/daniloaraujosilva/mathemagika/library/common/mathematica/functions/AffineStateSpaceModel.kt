package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AffineStateSpaceModel
 *
 * Full name:        System`AffineStateSpaceModel
 *
 *                   AffineStateSpaceModel[{a, b, c, d}, x] represents the affine state-space model x ' (t)  a(x(t)) + b(x(t)) . u(t), y(t) = c(x(t)) + d(x(t)) . u(t).
 *                   AffineStateSpaceModel[sys] gives an affine state-space model corresponding to the system model sys.
 *                   AffineStateSpaceModel[eqns, {{x , x  }, …}, {{u , u  }, …}, {g , …}, t] gives the affine state-space model obtained by Taylor input linearization about the dependent variable x  at x   and input u  at u   of the differential equations eqns with outputs g  and independent variable t.
 *                                                  1   10          1   10         1                                                                                                                 i     i             j     j0                                                  i
 * Usage:                                                                                                                                                                                                   0
 *
 *                   Appearance -> Automatic
 *                   ExternalTypeSignature -> Automatic
 *                   SamplingPeriod -> Automatic
 * Options:          SystemsModelLabels -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AffineStateSpaceModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/AffineStateSpaceModel.html
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
fun affineStateSpaceModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AffineStateSpaceModel", arguments.toMutableList(), options)
}
