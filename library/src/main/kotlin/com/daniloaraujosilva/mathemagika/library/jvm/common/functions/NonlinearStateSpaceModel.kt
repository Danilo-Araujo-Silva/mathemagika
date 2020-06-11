package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NonlinearStateSpaceModel
 *
 * Full name:        System`NonlinearStateSpaceModel
 *
 *                   NonlinearStateSpaceModel[{f, g}, x, u] represents the model x ' (t)  f(x(t), u(t)), y(t)  g(x(t), u(t)).
 *                   NonlinearStateSpaceModel[sys] gives a state-space representation corresponding to the systems model sys.
 *                   NonlinearStateSpaceModel[eqns, {{x , x  }, …}, {{u , u  }, …}, {g , …}, t] gives the state-space model of the differential equations eqns with dependent variables x , input variables u , operating vaues x   and u  , outputs g , and independent variable t.
 * Usage:                                              1   10          1   10         1                                                                                                  i                   i                   i0      i0           i
 *
 *                   Appearance -> Automatic
 *                   ExternalTypeSignature -> Automatic
 *                   SamplingPeriod -> Automatic
 * Options:          SystemsModelLabels -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NonlinearStateSpaceModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonlinearStateSpaceModel.html
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
fun nonlinearStateSpaceModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonlinearStateSpaceModel", arguments.toMutableList(), options)
}
