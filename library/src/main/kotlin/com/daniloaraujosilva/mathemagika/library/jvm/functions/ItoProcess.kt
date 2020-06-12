package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ItoProcess
 *
 * Full name:        System`ItoProcess
 *
 *                   ItoProcess[{a, b}, x, t] represents an Ito process x(t), where  x(t)  a(t, x(t))  t + b(t, x(t)) .  w(t).
 *                   ItoProcess[{a, b, c}, x, t] represents an Ito process y(t)  c(t, x(t)), where  x(t)  a(t, x(t))  t + b(t, x(t)) .  w(t) .
 *                   ItoProcess[…, {x, x }, {t, t }] uses initial condition x(t )  x .
 *                                      0        0                             0     0
 *                   ItoProcess[…, …, …, Σ] uses a Wiener process w(t), with covariance Σ.
 *                   ItoProcess[proc] converts proc to a standard Ito process whenever possible.
 * Usage:            ItoProcess[sdeqns, expr, x, t, w  dproc] represents an Ito process specified by a stochastic differential equation sdeqns, output expression expr, with state x and time t, driven by w following the process dproc.
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ItoProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/ItoProcess.html
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
fun itoProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ItoProcess", arguments.toMutableList(), options)
}
